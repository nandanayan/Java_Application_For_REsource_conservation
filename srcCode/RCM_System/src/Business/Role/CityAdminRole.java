/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.City.City;
import Business.Corporation.Enterprise;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CityAdmin.AdminWorkAreaJPanel;

/**
 *
 * @author aliasgar
 */
public class CityAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, City city, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, city, business, account, enterprise);
    }
}
