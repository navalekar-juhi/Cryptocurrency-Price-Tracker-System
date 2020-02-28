/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Account.Account;
import Business.Investment.Investment;

/**
 *
 * @author Pramathesh Navalekar
 */
public class SellCoinsWorkRequest extends WorkRequest{
    private int id;
    private static int count=21;
    private double dAmount;
    private String sNetwork;
    private String sEnterprise;
    private String customerAccount;
    private Investment SellCoins;
    public SellCoinsWorkRequest(){
    id = count;
     count++;  
     SellCoins = new Investment();
    }

    public int getId() {
        return id;
    }
    
    public double getdAmount() {
        return dAmount;
    }

    public void setdAmount(double dAmount) {
        this.dAmount = dAmount;
    }

    public String getsNetwork() {
        return sNetwork;
    }

    public void setsNetwork(String sNetwork) {
        this.sNetwork = sNetwork;
    }

    public String getsEnterprise() {
        return sEnterprise;
    }

    public void setsEnterprise(String sEnterprise) {
        this.sEnterprise = sEnterprise;
    }

    public String getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
    }
  
    public Investment getSellCoins() {
        return SellCoins;
    }

    public void setSellCoins(Investment SellCoins) {
        this.SellCoins = SellCoins;
    }
    
}
