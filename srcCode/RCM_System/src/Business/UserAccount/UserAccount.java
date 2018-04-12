/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.City.City;
import Business.Corporation.Enterprise;
import Business.CorporationAdmin.Appliance;
import Business.CorporationAdmin.Bill;
import Business.CorporationAdmin.Meter;
import Business.CorporationAdmin.Usage;
import Business.Employee.UserDetails;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccount {

    private String username;
    private String password;
    private String currentReading;
    private String consumption;
    private String Issue;
    private String billingStatus;
    private static int count = 0;
    private String firstName, lastName, street1, street2, city, country, zip, ssn, email, phoneNo, eID, wID, gID, billNo;
    private int userId;
    private UserDetails userDetails;
    private City.CorporationType cType;
    private Role role;
    private WorkQueue workQueue;
    private boolean notify;
    private Usage usage;
    private Appliance appliance;
    private ArrayList<Meter> meterReadingList;
    private ArrayList<Bill> billList;
    private ArrayList<Bill> monthlyBill;
    private ArrayList<Meter> overuseList;

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public ArrayList<Bill> getMonthlyBill() {
        return monthlyBill;
    }

    public void setMonthlyBill(ArrayList<Bill> monthlyBill) {
        this.monthlyBill = monthlyBill;
    }

    public boolean isNotify() {
        return notify;
    }

    public void setNotify(boolean notify) {
        this.notify = notify;
    }

    public ArrayList<Meter> getMeterReadingList() {
        return meterReadingList;
    }

    public void setMeterReadingList(ArrayList<Meter> meterReadingList) {
        this.meterReadingList = meterReadingList;
    }

    public ArrayList<Bill> getBillList() {
        return billList;
    }

    public void setBillList(ArrayList<Bill> billList) {
        this.billList = billList;
    }

    public ArrayList<Meter> getOveruseList() {
        return overuseList;
    }

    public void setOveruseList(ArrayList<Meter> overuseList) {
        this.overuseList = overuseList;
    }

    public Appliance getAppliance() {
        return appliance;
    }

    public void setAppliance(Appliance appliance) {
        this.appliance = appliance;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    public City.CorporationType getcType() {
        return cType;
    }

    public void setcType(City.CorporationType cType) {
        this.cType = cType;
    }

    public String getIssue() {
        return Issue;
    }

    public void setIssue(String Issue) {
        this.Issue = Issue;
    }

    public String getBillingStatus() {
        return billingStatus;
    }

    public void setBillingStatus(String billingStatus) {
        this.billingStatus = billingStatus;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public String getCurrentReading() {
        return currentReading;
    }

    public void setCurrentReading(String currentReading) {
        this.currentReading = currentReading;
    }

    public String getConsumption() {
        return consumption;
    }

    public void setConsumption(String consumption) {
        this.consumption = consumption;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String geteID() {
        return eID;
    }

    public void seteID(String eID) {
        this.eID = eID;
    }

    public String getwID() {
        return wID;
    }

    public void setwID(String wID) {
        this.wID = wID;
    }

    public String getgID() {
        return gID;
    }

    public void setgID(String gID) {
        this.gID = gID;
    }

    private Enterprise.EnterpriseType eType;

    public Enterprise.EnterpriseType geteType() {
        return eType;
    }

    public void seteType(Enterprise.EnterpriseType eType) {
        this.eType = eType;
    }

    public UserAccount() {
        workQueue = new WorkQueue();
        userId = count++;
        billingStatus = "Pending";
        notify = false;
        usage = new Usage();
        //   meter = new Meter();
        meterReadingList = new ArrayList<Meter>();
        billList = new ArrayList<Bill>();
        monthlyBill = new ArrayList<Bill>();
        overuseList = new ArrayList<Meter>();
        appliance = new Appliance();

    }

    public int getUserId() {
        return userId;
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

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    @Override
    public String toString() {
        return String.valueOf(userId);
    }

}
