/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CorporationAdmin;

import java.util.ArrayList;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import userinterface.UserAccount.ManageAppliancesPanel;

/**
 *
 * @author adbhutsangal
 */
public class Usage extends Observable implements Runnable {

    private static double usage;
    private static double over_usage;
    private double curr_usage;
    private static int[] flag = {0, 0, 0, 0, 0, 0};
    private static int f1 = 0;
    private static int f2 = 0;

    public int getF1() {
        return f1;
    }

    public void setF1(int f1) {
        this.f1 = f1;
    }

    public static int getF2() {
        return f2;
    }

    public static void setF2(int f2) {
        Usage.f2 = f2;
    }

    public static int[] getFlag() {
        return flag;
    }

    public static void setFlag(int[] flag) {
        Usage.flag = flag;
    }

    public static double getUsage() {
        return usage;
    }

    public static void setUsage(double usage) {
        Usage.usage = usage;
    }

    public static double getOver_usage() {
        return over_usage;
    }

    public static void setOver_usage(double over_usage) {
        Usage.over_usage = over_usage;
    }

    public void setCurr_usage(double curr_usage) {
        this.curr_usage = curr_usage;
        setChanged();
        notifyObservers();
    }

    public void use() {
        double use;
        while (true) {
            use = 0;
            if (getF1() == 1) {
                break;
            }
            for (int i : getFlag()) {
                if (i == 1) {
                    use += 0.42;
                }
            }
            if (use > 1.26) {
                if (getF2() == 0) {
                    setF2(1);
                }
                over_usage += (use - 1.26);
                usage += 1.26;
                setUsage(usage);
                setOver_usage(over_usage);
                setCurr_usage(usage);
            } else {
                if (getF2() == 1) {
                    setF2(0);
                }
                usage += use;
                setUsage(usage);
                setCurr_usage(usage);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Usage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void run() {
        use();
    }

}
