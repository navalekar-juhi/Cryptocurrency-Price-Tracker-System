/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Investment;

import Business.Customer.Customer;
import Business.Employee.Employee;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mansigandhi
 */
public class InvestmentDirectory {
    private Investment investmentList;
    private String type;
    public InvestmentDirectory(){
    investmentList = new Investment();
    }

    public Investment getInvestmentList() {
        return investmentList;
    }

    public void setInvestmentList(Investment investmentList) {
        this.investmentList = investmentList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
   
}
