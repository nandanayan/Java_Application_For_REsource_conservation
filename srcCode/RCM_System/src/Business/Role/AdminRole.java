/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.City.City;
import Business.Corporation.Enterprise;
import Business.UserAccount.UserAccount;
import userinterface.CityAdmin.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, City city, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, city, business, account, enterprise);
    }

}
