/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansigandhi
 */
public class CheckingAccountWorkRequest extends WorkRequest{
    private int id;
    private static int count=101;
    private String sNetwork;
    private String sEnterprise;
    private String sMessage;

    public String getsMessage() {
        return sMessage;
    }

    public void setsMessage(String sMessage) {
        this.sMessage = sMessage;
    }
            
    public CheckingAccountWorkRequest() {
        id = count;
        count++;  
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        CheckingAccountWorkRequest.count = count;
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
    
    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
