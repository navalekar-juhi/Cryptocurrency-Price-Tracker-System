/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansigandhi
 */
public class CustomerDirectory {
    List<Customer> customerList;

    public CustomerDirectory() {
        this.customerList = new ArrayList<Customer>();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
    public void addCustomer(Customer c) {
        customerList.add(c);
    }
    public Customer searchCustomer(String username) {
        for (Customer customer : customerList) {
            if (customer.getUseraccount().getUsername().equals(username)) {
                return customer;
            }
        }
        return null;
    }
    public UserAccount validateCustomer(String username,String password){
        for(Customer c:customerList){
            UserAccount u=c.getUseraccount();
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.isIsActive()){
                return u;
            }
        }
        return null;
    }
}
