/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Account.Account;
import Business.Employee.Employee;
//import Business.PersonDetails.PersonDetails;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import Business.Customer.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansigandhi
 */
public class UserAccount {
   
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private boolean isActive;
  
    public UserAccount() {
        workQueue = new WorkQueue();
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return username;
    }
    
}