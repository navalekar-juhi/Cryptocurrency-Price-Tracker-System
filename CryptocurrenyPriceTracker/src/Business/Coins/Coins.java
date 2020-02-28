/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Coins;

import Business.Network.Network;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansigandhi
 */
public class Coins {
    private Network network;
    private static int count=11;
    private int coinId;
    //private String CryptoCoinName;
    private double dPrice;
    private String symbol;
    
    public Coins() {
    coinId=count++;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public int getCoinId() {
        return coinId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getdPrice() {
        return dPrice;
    }

    public void setdPrice(double dPrice) {
        this.dPrice = dPrice;
    }
    
    @Override
    public String toString() {
        return symbol;
    }
}
