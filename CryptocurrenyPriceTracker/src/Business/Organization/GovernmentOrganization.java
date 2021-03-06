/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GovernmentRole;
import Business.Role.SavingsAccountRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mansigandhi
 */
public class GovernmentOrganization extends Organization{
  
    public GovernmentOrganization() {
        super(Organization.Type.Government.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentRole());
        return roles;
    }
}
