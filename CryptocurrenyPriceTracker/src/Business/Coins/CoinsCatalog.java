/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Coins;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansigandhi
 */
public class CoinsCatalog {
    private List<Coins> coinsList;

    public CoinsCatalog() {
        coinsList = new ArrayList<Coins>();
    }

    public List<Coins> getCoinsList() {
        return coinsList;
    }

    public void setCoinsList(List<Coins> coinsList) {
        this.coinsList = coinsList;
    }
    public boolean contains(Coins c){
        return coinsList.contains(c);
    }
    
    public void addCoins(Coins c){
        coinsList.add(c);
    }
   
    public void removeCoins(Coins c)
    {
        coinsList.remove(c);
    }
}
