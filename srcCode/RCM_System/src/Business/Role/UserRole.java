/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.City.City;
import Business.EcoSystem;
import Business.Corporation.Enterprise;
import Business.UserAccount.UserAccount;
import userinterface.UserAccount.UsersMainPagePanel;
import javax.swing.JPanel;


/**
 *
 * @author aliasgar
 */
public class UserRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise organization, City city, EcoSystem business) {
        return new UsersMainPagePanel(userProcessContainer, city, business, account);
    }
}
