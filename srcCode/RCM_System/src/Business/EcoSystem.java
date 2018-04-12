/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.State.State;
import Business.Corporation.Enterprise;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author aliasgar
 */
public class EcoSystem extends Enterprise {

    private static EcoSystem business;
    private ArrayList<State> stateList;
    private ArrayList<Threshold> thresholdList;
    private String treeSelection;

    public EcoSystem() {
        super(null, null);
        stateList = new ArrayList<State>();
        thresholdList = new ArrayList<Threshold>();

    }

    public String getTreeSelection() {
        return treeSelection;
    }

    public void setTreeSelection(String treeSelection) {
        this.treeSelection = treeSelection;
    }

    public ArrayList<State> getStateList() {
        return stateList;
    }

    public void setStateList(ArrayList<State> stateList) {
        this.stateList = stateList;
    }

    public ArrayList<Threshold> getThresholdList() {
        return thresholdList;
    }

    public void setThresholdList(ArrayList<Threshold> thresholdList) {
        this.thresholdList = thresholdList;
    }

    public static EcoSystem getInstance() {

        if (business == null) {
            business = new EcoSystem();

        }
        return business;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;

    }

    public State createAndAddState() {

        State state = new State();
        stateList.add(state);
        return state;

    }

    public Threshold addThreshold() {
        Threshold t = new Threshold();
        thresholdList.add(t);
        return t;

    }

    public boolean checkIfUserNameIsUnique(String userName) {
        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }
        for (State state : stateList) {
            return false;
        }
        return true;
    }
}
