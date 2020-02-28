 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Account.Account;
import Business.Investment.Investment;
import Business.Investment.InvestmentDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author mansigandhi
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private Account enterpriseAcnt;
    private ArrayList<Investment> enterpriseInvestment;

    public Account getEnterpriseAcnt() {
        return enterpriseAcnt;
    }

    public void setEnterpriseAcnt(Account enterpriseAcnt) {
        this.enterpriseAcnt = enterpriseAcnt;
    }  
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public ArrayList<Investment> getEnterpriseInvestment() {
        return enterpriseInvestment;
    }

    public void setEnterpriseInvestment(ArrayList<Investment> enterpriseInvestment) {
        this.enterpriseInvestment = enterpriseInvestment;
    }
    
    public enum EnterpriseType{
        Bank("Bank"),
        Private("PrivateBroker"),
        Government("Government");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }
    

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
        enterpriseInvestment = new ArrayList<Investment>();
        enterpriseAcnt = new Account();
    }
}
