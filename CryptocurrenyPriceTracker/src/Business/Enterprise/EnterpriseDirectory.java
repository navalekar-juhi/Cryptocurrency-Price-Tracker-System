/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author mansigandhi
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Bank){
            enterprise=new Bank(name);
            enterpriseList.add(enterprise);
        }
        else if (type==Enterprise.EnterpriseType.Government){
        enterprise = new Government(name);
        enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Private){
            enterprise=new PrivateBroker(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    public boolean SearchEnterprise(String name,Enterprise.EnterpriseType type){
        boolean status=false;
        
         for(Enterprise a:enterpriseList)
        {
            if(a.getName().equalsIgnoreCase(name)&&a.getEnterpriseType().equals(type))
            {
               return true;  
            }
           
        }
        return status;
     
    }
}
