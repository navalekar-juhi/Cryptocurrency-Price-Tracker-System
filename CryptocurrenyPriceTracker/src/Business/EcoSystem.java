package Business;

import Business.Coins.CoinsCatalog;
import Business.Customer.CustomerDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author mansigandhi
 */
public class EcoSystem {
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private CustomerDirectory customerDirectory;
    private UserAccountDirectory userDirectory;
    private OrganizationDirectory organizationDirectory;
    private CoinsCatalog coinsCatalog;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    public void deleteNetwork(Network network)
    {
        networkList.remove(network);
        
    }
    public boolean searchNetwork(String name){
        boolean status=false;
         for(Network a:networkList)
        {
            if(a.getName().equalsIgnoreCase(name))
            {
               return true;  
            }
           
        }
        return status;
        
    }
    private EcoSystem(){
      //  super(null);
        networkList=new ArrayList<Network>();
        customerDirectory=new CustomerDirectory();
        userDirectory = new UserAccountDirectory();
        organizationDirectory = new OrganizationDirectory();
        coinsCatalog= new CoinsCatalog();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public UserAccountDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserAccountDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public CoinsCatalog getCoinsCatalog() {
        return coinsCatalog;
    }

    public void setCoinsCatalog(CoinsCatalog coinsCatalog) {
        this.coinsCatalog = coinsCatalog;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
}