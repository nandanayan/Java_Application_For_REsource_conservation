/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.City.City;
import Business.Corporation.Enterprise;
import Business.UserAccount.UserAccount;
import userinterface.FedralAdmin.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise organization, City enterprise, EcoSystem system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system, organization);
    }

}
