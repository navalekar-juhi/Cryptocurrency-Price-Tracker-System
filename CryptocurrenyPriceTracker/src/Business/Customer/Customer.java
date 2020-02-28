/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Account.Account;
import Business.Investment.Investment;
import Business.Investment.InvestmentDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author mansigandhi
 */
public class Customer {

    private int id;
    private static int count = 0;
    private String sFirstName;
    private String sLastName;
    private String sSex;
    private String sEmailId;
    private int iAge;
    private long lMobileNumber;
    private ImageIcon iProfilePicture;
    private UserAccount useraccount;
    private Role.RoleType roletype;
    private List<Account> accountList;
    private List<Investment> futureInvestment;
    private List<InvestmentDirectory> currentInvestment;
    private List<Investment> coinDetails;

    //List<Account>
    public Customer() {
        id = count;
        count++;
        roletype = Role.RoleType.Customer;
        useraccount = new UserAccount();
        accountList = new ArrayList<Account>();
        futureInvestment = new ArrayList<Investment>();
        currentInvestment = new ArrayList<InvestmentDirectory>();
        coinDetails = new ArrayList<Investment>();
    }

    public int getId() {
        return id;
    }

    public String getsFirstName() {
        return sFirstName;
    }

    public void setsFirstName(String sFirstName) {
        this.sFirstName = sFirstName;
    }

    public String getsLastName() {
        return sLastName;
    }

    public void setsLastName(String sLastName) {
        this.sLastName = sLastName;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public String getsEmailId() {
        return sEmailId;
    }

    public void setsEmailId(String sEmailId) {
        this.sEmailId = sEmailId;
    }

    public int getiAge() {
        return iAge;
    }

    public void setiAge(int iAge) {
        this.iAge = iAge;
    }

    public long getlMobileNumber() {
        return lMobileNumber;
    }

    public void setlMobileNumber(long lMobileNumber) {
        this.lMobileNumber = lMobileNumber;
    }

    public ImageIcon getiProfilePicture() {
        return iProfilePicture;
    }

    public void setiProfilePicture(ImageIcon iProfilePicture) {
        this.iProfilePicture = iProfilePicture;
    }

    public UserAccount getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(UserAccount useraccount) {
        this.useraccount = useraccount;
    }

    public Role.RoleType getRoletype() {
        return roletype;
    }

    public void setRoletype(Role.RoleType roletype) {
        this.roletype = roletype;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public List<Investment> getFutureInvestment() {
        return futureInvestment;
    }

    public void setFutureInvestment(List<Investment> futureInvestment) {
        this.futureInvestment = futureInvestment;
    }

    public List<InvestmentDirectory> getCurrentInvestment() {
        return currentInvestment;
    }

    public void setCurrentInvestment(List<InvestmentDirectory> currentInvestment) {
        this.currentInvestment = currentInvestment;
    }
    
    public List<Investment> getCoinDetails() {
        return coinDetails;
    }

    public void setCoinDetails(List<Investment> coinDetails) {
        this.coinDetails = coinDetails;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
