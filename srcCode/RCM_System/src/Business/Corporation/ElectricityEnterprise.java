/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Corporation;

import Business.Corporation.Enterprise.EnterpriseType;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aliasgar
 */
public class ElectricityEnterprise extends Enterprise {

    public ElectricityEnterprise() {
        super(EnterpriseType.Electricity.getValue(), EnterpriseType.Electricity);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
