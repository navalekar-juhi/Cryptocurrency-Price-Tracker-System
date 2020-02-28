/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Investment.InvestmentDirectory;
import Business.Role.Role;
    import java.util.ArrayList;

/**
 *
 * @author mansigandhi
 */
public class PrivateBroker extends Enterprise {
      public PrivateBroker(String name){
        super(name,Enterprise.EnterpriseType.Private);
    }
      
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
