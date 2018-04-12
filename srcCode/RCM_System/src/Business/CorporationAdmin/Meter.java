/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CorporationAdmin;

import java.util.Date;

/**
 *
 * @author aliasgar
 */
public class Meter {
    private double emReading;
    private double wmReading;
    private double gmReading;
    private double eOveruse,gOveruse,wOveruse;
    private Date readingDate;

    public double geteOveruse() {
        return eOveruse;
    }

    public void seteOveruse(double eOveruse) {
        this.eOveruse = eOveruse;
    }

    public double getgOveruse() {
        return gOveruse;
    }

    public void setgOveruse(double gOveruse) {
        this.gOveruse = gOveruse;
    }

    public double getwOveruse() {
        return wOveruse;
    }

    public void setwOveruse(double wOveruse) {
        this.wOveruse = wOveruse;
    }

    
    
    public Date getReadingDate() {
        return readingDate;
    }

    public void setReadingDate(Date readingDate) {
        this.readingDate = readingDate;
    }     

    public double getEmReading() {
        return emReading;
    }

    public void setEmReading(double emReading) {
        this.emReading = emReading;
    }

    public double getWmReading() {
        return wmReading;
    }

    public void setWmReading(double wmReading) {
        this.wmReading = wmReading;
    }

    public double getGmReading() {
        return gmReading;
    }

    public void setGmReading(double gmReading) {
        this.gmReading = gmReading;
    }
    
    
            
}
