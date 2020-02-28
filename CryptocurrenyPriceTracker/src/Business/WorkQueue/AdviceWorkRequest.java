/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.CoinWallet;
import Business.Investment.Investment;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author mansigandhi
 */
public class AdviceWorkRequest extends WorkRequest{
    private int id;
    private static int count=101;
    private ArrayList<Investment> suggInvestList;
    private double dAmount;
    private String sNetwork;
    private String sEnterprise;
            
    public AdviceWorkRequest() {
        id = count;
        count++;  
        suggInvestList = new ArrayList<Investment>();
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

    public ArrayList<Investment> getSuggInvestList() {
        return suggInvestList;
    }

    public void setSuggInvestList(ArrayList<Investment> suggInvestList) {
        this.suggInvestList = suggInvestList;
    }

    public void addInvestment(Investment i){
        suggInvestList.add(i);
    }

     @Override
    public String toString() {
        return String.valueOf(id);
    }
}
