/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CheckingAccountRole;
import Business.Role.SavingsAccountRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mansigandhi
 */
public class CheckingAccountOrganization extends Organization {
   public CheckingAccountOrganization() {
        super(Organization.Type.CheckingAccount.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CheckingAccountRole());
        return roles;
    } 
}
