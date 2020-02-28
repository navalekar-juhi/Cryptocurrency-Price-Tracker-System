package Business;

import Business.Coins.Coins;
import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
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
 * @author rrheg
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();
        /*Coins c1= new Coins();
        c1.setCryptoCoinName("EUR");
        c1.setSymbol("EUR");
        c1.setdPrice(0.8810);
        Coins c2 = new Coins();
        c2.setCryptoCoinName("zar");
        c2.setSymbol("ZAR");
        c2.setdPrice(14.13);
        Coins c3= new Coins();
        c3.setCryptoCoinName("TRY");
        c3.setSymbol("TRY");
        c3.setdPrice(5.33);
        Coins c4= new Coins();
        c4.setCryptoCoinName("THB");
        c4.setSymbol("THB");
        c4.setdPrice(32.85);
        system.getCoinsCatalog().addCoins(c1);
        system.getCoinsCatalog().addCoins(c2);
        system.getCoinsCatalog().addCoins(c3);
        system.getCoinsCatalog().addCoins(c4);*/
        Employee emp = new Employee();
        //emp.setName("RRH");
        UserAccount ua = system.getUserDirectory().createUserAccount("sysadmin", "sysadmin", emp, new SystemAdminRole());

        return system;
    }

}
