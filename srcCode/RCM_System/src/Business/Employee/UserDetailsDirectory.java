/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Role.Role;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author aliasgar
 */
public class UserDetailsDirectory {

    private ArrayList<UserDetails> userDetailsList;

    public UserDetailsDirectory() {
        userDetailsList = new ArrayList();
    }

    public ArrayList<UserDetails> getUserDetailsList() {
        return userDetailsList;
    }

    public void removeUserDetails(UserDetails ud) {
        userDetailsList.remove(ud);
    }

    public UserDetails searchUser(int id) {
        for (UserDetails ud : userDetailsList) {
            if (ud.getUserId() == id) {
                return ud;
            }
        }
        return null;
    }

    public UserDetails createRandomUsers(Role role) {
        UserDetails userDetails = new UserDetails();
        int count = 0;

        while (count < 2) {

//                            Customer c = clm.addCustomer();
//                            Product p= clm.addProduct();
            Random r = new Random();

            String firstNames[] = {"Jackson", "Aiden", "Liam", "Lucas", "Noah", "Mason", "Ethan", "Caden", "Jacob", "Logan", "Jayden", "Elijah", "Jack", "Luke", "Michael", "Sophia", "Emma", "Olivia", "Ava",
                "Isabella", "Mia", "Zoe", "Lily", "Emily", "Madelyn", "Madison", "Chloe", "Charlotte", "Aubrey", "Avery"};
            String lastNames[] = {"Beasley", "Wade", "Romero", "Bryan", "Roach", "Mann", "Frost", "Christian", "Finley", "Aguirre", "Schmidt", "Cisneros", "Horton",
                "Mata", "Chaney", "Hurst", "Klein", "Espinoza", "Wallace", "Lawson"};

            String street1[] = {"apt 11", "apt 13", "apt 16,mas ave", "apt 20,mas ave", "apt 30,mas ave"};
            String street2[] = {"apt 11,mas ave", "apt 13,mas ave", "apt 16,mas ave", "apt 20,mas ave", "apt 30,mas ave"};
            String city[] = {"apt 11,mas ave", "apt 13,mas ave", "apt 16,mas ave", "apt 20,mas ave", "apt 30,mas ave"};
            String country[] = {"apt 11,mas ave", "apt 13,mas ave", "apt 16,mas ave", "apt 20,mas ave", "apt 30,mas ave"};
            String zip[] = {"apt 11,mas ave", "apt 13,mas ave", "apt 16,mas ave", "apt 20,mas ave", "apt 30,mas ave"};
            String ssn[] = {"apt 11,mas ave", "apt 13,mas ave", "apt 16,mas ave", "apt 20,mas ave", "apt 30,mas ave"};
            String email[] = {"apt 11,mas ave", "apt 13,mas ave", "apt 16,mas ave", "apt 20,mas ave", "apt 30,mas ave"};
            String phoneno[] = {"9999999999", "9988999999", "8877999999", "8877996611", "8579021345"};
            String eID[] = {"mobile", "computer"};
            String wID[] = {"mobile", "computer"};
            String gID[] = {"mobile", "computer"};
            String user_name[] = {"m", "c", "f"};
            String pass_word[] = {"m", "c"};

            int price[] = {26, 225};

            userDetails.setCity(city[new Random().nextInt(city.length)]);
            userDetails.setStreet1(street1[new Random().nextInt(street1.length)]);
            userDetails.setStreet2(street2[new Random().nextInt(street2.length)]);
            userDetails.setCountry(country[new Random().nextInt(country.length)]);
            userDetails.setZip(zip[new Random().nextInt(zip.length)]);
            userDetails.setSsn(ssn[new Random().nextInt(ssn.length)]);
            userDetails.setEmail(email[new Random().nextInt(email.length)]);
            userDetails.setPhoneNo(phoneno[new Random().nextInt(phoneno.length)]);
            userDetails.seteID(eID[new Random().nextInt(eID.length)]);
            userDetails.setwID(wID[new Random().nextInt(wID.length)]);
            userDetails.setgID(gID[new Random().nextInt(gID.length)]);

            userDetailsList.add(userDetails);
            count++;
        }

        return userDetails;
    }
}
