/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Coins.Coins;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author mansigandhi
 */
public class CoinValueGenerator {

    public static void generateValues(final EcoSystem system) {
        
        Timer timer = new Timer();
        TimerTask tsk = new TimerTask() {

            @Override
            public void run() {
                try {
                    JsonParser jp = new JsonParser();
                    String url_str = "https://rest.coinapi.io/v1/exchangerate/USD?apikey=609E78DB-5E62-4C48-9424-F39537DE0271";

                    String req_result = "-1"; // Making Request

                    URL url = new URL(url_str);
                    HttpURLConnection request = (HttpURLConnection) url.openConnection();
                    request.disconnect();
                    request.setRequestMethod("GET");

                    // Convert to JSON
                    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
                    com.google.gson.JsonObject jsonobj = root.getAsJsonObject();
                    com.google.gson.JsonElement jsonElem = jsonobj.get("rates");
                    Object[] row = new Object[jsonElem.getAsJsonArray().size()];

                    for (int i = 0; i < jsonElem.getAsJsonArray().size(); i++) {
                        JsonElement node = jp.parse(jsonElem.getAsJsonArray().get(i).toString());
                        JsonElement time = node.getAsJsonObject().get("time");
                        JsonElement rate = node.getAsJsonObject().get("rate");
                        JsonElement quote = node.getAsJsonObject().get("asset_id_quote");
                                         System.out.println(time + "  " + rate + "   " + quote);
                        //row[0] = time.toString();
                        Coins c = new Coins();
                        double dPrice = Double.parseDouble(rate.toString());
                        c.setdPrice(dPrice);
                        String sSymbol = quote.toString();
                        c.setSymbol(sSymbol);
                        String dTime = time.toString();
                        //c.setTime(dTime);
                        system.getCoinsCatalog().addCoins(c);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        };
        timer.schedule(tsk, 0, 600000);

    }
};
