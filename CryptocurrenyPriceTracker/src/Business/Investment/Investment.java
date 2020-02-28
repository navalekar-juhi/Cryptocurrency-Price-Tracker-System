/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Investment;

import Business.Coins.Coins;

/**
 *
 * @author mansigandhi
 */
public class Investment {
    private Coins coin;
    private double dPrice;
    private int quantity;
    public Investment(){
    coin = new Coins();
    }
    public Investment(Coins coin) {
        this.coin=coin;
    }
    public Coins getCoin() {
        return coin;
    }

    public void setCoin(Coins coin) {
        this.coin = coin;
    }

    public double getdPrice() {
        return dPrice;
    }

    public void setdPrice(double dPrice) {
        this.dPrice = dPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double investmentAmount() {
        return quantity * dPrice;
    }
    @Override
    public String toString() {
        return String.valueOf(coin);
    }
}
