/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.City.CityDirectory;

/**
 *
 * @author aliasgar
 */
public class Threshold {

    private String eRange, gRange, wRange;
    private int eFactor, gFactor, wFactor;
    private CityDirectory cityDirectory;

    public Threshold() {
        cityDirectory = new CityDirectory();
    }

    public String geteRange() {
        return eRange;
    }

    public void seteRange(String eRange) {
        this.eRange = eRange;
    }

    public String getgRange() {
        return gRange;
    }

    public void setgRange(String gRange) {
        this.gRange = gRange;
    }

    public String getwRange() {
        return wRange;
    }

    public void setwRange(String wRange) {
        this.wRange = wRange;
    }

    public int geteFactor() {
        return eFactor;
    }

    public void seteFactor(int eFactor) {
        this.eFactor = eFactor;
    }

    public int getgFactor() {
        return gFactor;
    }

    public void setgFactor(int gFactor) {
        this.gFactor = gFactor;
    }

    public int getwFactor() {
        return wFactor;
    }

    public void setwFactor(int wFactor) {
        this.wFactor = wFactor;
    }

    @Override
    public String toString() {
        return eRange;
    }
}
