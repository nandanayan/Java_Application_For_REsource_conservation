/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Corporation;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

}
