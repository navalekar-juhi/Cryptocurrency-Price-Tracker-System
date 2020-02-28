/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author mansigandhi
 */
public class CoinWallet {
    private String sCoinName;
    private double dCoinPrice;
    private long lQuantity;

    public String getsCoinName() {
        return sCoinName;
    }

    public void setsCoinName(String sCoinName) {
        this.sCoinName = sCoinName;
    }

    public double getdCoinPrice() {
        return dCoinPrice;
    }

    public void setdCoinPrice(double dCoinPrice) {
        this.dCoinPrice = dCoinPrice;
    }

    public long getlQuantity() {
        return lQuantity;
    }

    public void setlQuantity(long lQuantity) {
        this.lQuantity = lQuantity;
    }
       @Override
    public String toString() {
        return sCoinName;
    }
}
