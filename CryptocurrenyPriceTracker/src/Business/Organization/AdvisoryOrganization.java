/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdvisoryRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author poojahiremath
 */
public class AdvisoryOrganization extends Organization  {
    public AdvisoryOrganization() {
        super(Organization.Type.Advisory.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdvisoryRole());
        return roles;
    }
    
}
