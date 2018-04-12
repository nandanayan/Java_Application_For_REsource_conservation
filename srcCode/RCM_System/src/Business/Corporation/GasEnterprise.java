/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Corporation;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aliasgar
 */
public class GasEnterprise extends Enterprise {

    public GasEnterprise() {
        super(Enterprise.EnterpriseType.Gas.getValue(), Enterprise.EnterpriseType.Gas);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
