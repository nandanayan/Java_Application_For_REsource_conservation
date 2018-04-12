/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CorporationAdmin;

/**
 *
 * @author aliasgar
 */
public class Appliance {

    private boolean ac1 = false;
    private boolean ac2 = false;
    private boolean rad1 = false;
    private boolean rad2 = false;
    private boolean wm = false;
    private boolean mwo = false;

    private Usage use = new Usage();

    private static int[] f = new int[6];

    public void setAc1(boolean ac1) {
        this.ac1 = ac1;
        if (ac1) {
            f[0] = 1;
            use.setFlag(f);
        } else {
            f[0] = 0;
            use.setFlag(f);
        }
    }

    public void setAc2(boolean ac2) {
        this.ac2 = ac2;
        if (ac2) {
            f[1] = 1;
            use.setFlag(f);
        } else {
            f[1] = 0;
            use.setFlag(f);
        }
    }

    public void setRad1(boolean rad1) {
        this.rad1 = rad1;
        if (rad1) {
            f[2] = 1;
            use.setFlag(f);
        } else {
            f[2] = 0;
            use.setFlag(f);
        }
    }

    public void setRad2(boolean rad2) {
        this.rad2 = rad2;
        if (rad2) {
            f[3] = 1;
            use.setFlag(f);
        } else {
            f[3] = 0;
            use.setFlag(f);
        }
    }

    public void setWm(boolean wm) {
        this.wm = wm;
        if (wm) {
            f[4] = 1;
            use.setFlag(f);
        } else {
            f[4] = 0;
            use.setFlag(f);
        }
    }

    public void setMwo(boolean mwo) {
        this.mwo = mwo;
        if (mwo) {
            f[5] = 1;
            use.setFlag(f);
        } else {
            f[5] = 0;
            use.setFlag(f);
        }
    }
}
