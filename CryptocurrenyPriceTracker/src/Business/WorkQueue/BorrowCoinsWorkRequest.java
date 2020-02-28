/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Investment.Investment;

/**
 *
 * @author Pramathesh Navalekar
 */
public class BorrowCoinsWorkRequest extends WorkRequest{
    private int id;
    private static int count=41;
    private String sNetwork;
    private String sEnterprise;
    private double amount;
    private Investment borrowCoin;
    
    public BorrowCoinsWorkRequest(){
    id = count;
    count++;  
    borrowCoin = new Investment();
    }

    public int getId() {
        return id;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Investment getBorrowCoin() {
        return borrowCoin;
    }

    public void setBorrowCoin(Investment borrowCoin) {
        this.borrowCoin = borrowCoin;
    }
    
}
