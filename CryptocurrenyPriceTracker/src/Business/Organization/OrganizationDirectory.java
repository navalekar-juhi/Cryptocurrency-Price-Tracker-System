/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author mansigandhi
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if(type.getValue().equals(Type.FinancialService.getValue())){
            organization = new FinancialServiceOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Advisory.getValue())){
            organization = new AdvisoryOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.SavingsAccount.getValue())){
            organization = new SavingsAccountOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.CheckingAccount.getValue())){
            organization = new CheckingAccountOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Government.getValue())){
            organization = new GovernmentOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}