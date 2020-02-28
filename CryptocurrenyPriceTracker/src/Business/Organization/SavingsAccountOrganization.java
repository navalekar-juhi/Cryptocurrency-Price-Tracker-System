/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.SavingsAccountRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author poojahiremath
 */
public class SavingsAccountOrganization extends Organization {
    public SavingsAccountOrganization() {
        super(Organization.Type.SavingsAccount.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SavingsAccountRole());
        return roles;
    }
    
}
