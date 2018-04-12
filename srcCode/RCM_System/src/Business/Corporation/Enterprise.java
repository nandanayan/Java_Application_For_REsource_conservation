/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Corporation;

import Business.Employee.EmployeeDirectory;
import Business.Employee.UserDetailsDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Enterprise {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserDetailsDirectory userDetailsDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int enterpriseID;
    private static int counter;

    private EnterpriseType etype;

    public EnterpriseType getEtype() {
        return etype;
    }

    public void setEtype(EnterpriseType etype) {
        this.etype = etype;
    }

    public enum EnterpriseType {
        Electricity("Electricity Enterprise"), Gas("Gas Enterprise"), Water("Water Enterprise");
        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        private EnterpriseType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public Enterprise(String name, EnterpriseType type) {
        this.name = name;
        this.etype = type;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userDetailsDirectory = new UserDetailsDirectory();
        userAccountDirectory = new UserAccountDirectory();
        enterpriseID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getEnterpriseID() {
        return enterpriseID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public UserDetailsDirectory getUserDetailsDirectory() {
        return userDetailsDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

}
