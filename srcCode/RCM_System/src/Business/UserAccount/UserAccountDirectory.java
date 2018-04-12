/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Corporation.Enterprise;
import Business.CorporationAdmin.Meter;
import Business.Employee.Employee;
import Business.Role.Role;
import Business.Employee.UserDetails;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;
    private ArrayList<UserAccount> randomUserList;

    public UserAccountDirectory() {

        userAccountList = new ArrayList();

    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public ArrayList<UserAccount> getRandomUserList() {
        return randomUserList;
    }

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    public void removeUserAccount(UserAccount ua) {
        userAccountList.remove(ua);
    }

    public UserAccount searchUser(int id) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUserId() == id) {
                return ua;
            }
        }
        return null;
    }

    public UserAccount createAdminAccount(String username, String password, Employee employee, Role role, Enterprise.EnterpriseType type) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.seteType(type);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public UserAccount createUserAccount(String username, String password, UserDetails userDetails, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setUserDetails(userDetails);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public UserAccount createRandomUsers(Role role) {
        UserAccount userAccount = new UserAccount();;
        int count = 0;

        while (count < 1) {

            Random r = new Random();

            String firstNames[] = {"Jackson", "Aiden", "Liam", "Lucas", "Noah", "Mason", "Ethan", "Caden", "Jacob", "Logan", "Jayden", "Elijah", "Jack", "Luke", "Michael", "Sophia", "Emma", "Olivia", "Ava",
                "Isabella", "Mia", "Zoe", "Lily", "Emily", "Madelyn", "Madison", "Chloe", "Charlotte", "Aubrey", "Avery"};
            String lastNames[] = {"Beasley", "Wade", "Romero", "Bryan", "Roach", "Mann", "Frost", "Christian", "Finley", "Aguirre", "Schmidt", "Cisneros", "Horton",
                "Mata", "Chaney", "Hurst", "Klein", "Espinoza", "Wallace", "Lawson"};

            String street1[] = {"apt 11", "apt 13", "apt 16", "apt 20", "apt 30", "apt 46", "apt 78", "apt 34", "apt 9", "apt 15"};
            String street2[] = {"mas ave", "tetlow street", "huntington avenue", "roxbury", "south huntington avenue", "falkon street", "parker street",
                "palace road"};
            String city[] = {"Houston", "boston", "worcester", "ssalem", "plymouth", "lowell", "dallas", "austin", "san antonio", "fort worth", "los angles",
                "san francisco", "san diego", "san jose", "oakland", "chicago", "aurora", "rockford", "springfield", "elgin",
                "atlanta", "auguta", "savannah", "marietta", "athens"};
            String country[] = {"USA"};
            String zip[] = {"02115", "09898", "34565", "89754", "56424", "09878", "04342", "65438", "78065", "34509"};
            String ssn[] = {"234561782", "908765678", "789654567", "908756456", "098907890", "234258920", "789026242", "567289054",
                "902724679", "567234678", "908765678", "453457890", "936383037", "839242536", "234509876", "230987345", "980768965"};

            String phoneno[] = {"8946490373", "9825373930", "9363820923", "88779963729", "85373936383", "73835637353",
                "6789353637", "6373927383", "9835372363", "9856437865", "7678393637", "5673469087", "7896543468", "9086743122"};
            String eID[] = {"9930360935", "83738672823"};
            String wID[] = {"6785709876", "7253627253"};
            String gID[] = {"6783457953", "5263536386 "};

            int currentReading = r.nextInt(40);

            for (int i = 0; i < 90; i++) {

                double emReading = 25 + 15 * r.nextDouble();
                double gmReading = 0 + 23 * r.nextDouble();
                double wmReading = 0 + 15 * r.nextDouble();

                Calendar c1 = Calendar.getInstance();
                c1.set(Calendar.DATE, c1.get(Calendar.DATE) - i);

                Meter meter = new Meter();

                meter.setEmReading(emReading);
                meter.setGmReading(gmReading);
                meter.setWmReading(wmReading);
                meter.setReadingDate(c1.getTime());

                if (emReading > 30) {
                    meter.seteOveruse(emReading - 30);
                }

                if (gmReading > 5) {
                    meter.setgOveruse(gmReading - 5);
                }

                if (wmReading > 3) {
                    meter.setwOveruse(wmReading - 3);
                }

                userAccount.getMeterReadingList().add(meter);

            }

            String consumption[] = {"Low", "Moderate", "Above Threshold", "Extreme"};

            int price[] = {26, 225};

            userAccount.setCity(city[new Random().nextInt(city.length)]);
            userAccount.setStreet1(street1[new Random().nextInt(street1.length)]);
            userAccount.setStreet2(street2[new Random().nextInt(street2.length)]);
            userAccount.setCountry(country[new Random().nextInt(country.length)]);
            userAccount.setZip(zip[new Random().nextInt(zip.length)]);
            userAccount.setSsn(ssn[new Random().nextInt(ssn.length)]);
            userAccount.setEmail(userAccount.getFirstName() + "_" + userAccount.getLastName() + "@gmail.com");
            userAccount.setPhoneNo(phoneno[new Random().nextInt(phoneno.length)]);
            userAccount.seteID(eID[new Random().nextInt(eID.length)]);
            userAccount.setwID(wID[new Random().nextInt(wID.length)]);
            userAccount.setgID(gID[new Random().nextInt(gID.length)]);
            userAccount.setFirstName(firstNames[new Random().nextInt(firstNames.length)]);
            userAccount.setLastName(lastNames[new Random().nextInt(lastNames.length)]);
            userAccount.setUsername(userAccount.getFirstName());
            userAccount.setPassword(userAccount.getFirstName());
            userAccount.setConsumption(consumption[new Random().nextInt(consumption.length)]);
            userAccount.setCurrentReading(String.valueOf(currentReading));
            userAccount.setBillNo(String.valueOf(r.nextInt(2000)));

            userAccount.setRole(role);

            userAccountList.add(userAccount);
            count++;
        }

        return userAccount;
    }

    public boolean checkIfUsernameIsUnique(String username) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
}
