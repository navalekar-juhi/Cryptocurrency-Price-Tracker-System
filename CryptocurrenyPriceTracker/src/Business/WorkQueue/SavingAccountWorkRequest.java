/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Account.Account;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansigandhi
 */
public class SavingAccountWorkRequest extends WorkRequest{
    private int id;
    private static int count=101;  
    private String sNetwork;
    private String sEnterprise;
    private String sMessage;
   
    
    public SavingAccountWorkRequest() {
        id = count;
        count++;  
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getsMessage() {
        return sMessage;
    }

    public void setsMessage(String sMessage) {
        this.sMessage = sMessage;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
