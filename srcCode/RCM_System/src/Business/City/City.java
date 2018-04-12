/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.City;

import Business.Corporation.Enterprise;
import Business.Corporation.EnterpriseDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Guest
 */
public abstract class City extends Enterprise {

    public City(String name, CorporationType type) {
        super(name, null);
        this.corporationType = type;
        enterpriseDirectory = new EnterpriseDirectory();
    }

    private CorporationType corporationType;
    private EnterpriseDirectory enterpriseDirectory;
    private double cityUsage;
    private double cityOveruse;

    public double getCityUsage() {
        return cityUsage;
    }

    public void setCityUsage(double cityUsage) {
        this.cityUsage = cityUsage;
    }

    public double getCityOveruse() {
        return cityOveruse;
    }

    public void setCityOveruse(double cityOveruse) {
        this.cityOveruse = cityOveruse;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public CorporationType getCorporationType() {
        return corporationType;
    }

    public void setCorporationType(CorporationType corporationType) {
        this.corporationType = corporationType;
    }

    public enum CorporationType {
        Electricity("Electricity Enterprise"), Gas("Gas Enterprise"), Water("Water Enterprise");

        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        private CorporationType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
