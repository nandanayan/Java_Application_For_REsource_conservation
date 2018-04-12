package Business;

import Business.Employee.Employee;
import Business.Employee.UserDetails;
import Business.Role.SystemAdminRole;
import Business.Role.UserRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Guest
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");

        UserDetails userDetails = system.getUserDetailsDirectory().createRandomUsers(new UserRole());

        UserAccount userAccount = system.getUserAccountDirectory().createRandomUsers(new UserRole());

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sys", "sys", userDetails, new SystemAdminRole());

        return system;
    }

}
