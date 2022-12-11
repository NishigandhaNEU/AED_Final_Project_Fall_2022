/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSigns;

import Business.Vaccine.Vaccine;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nishigandha
 */
public class VitalSignsHistory {
    private ArrayList<VitalSigns> vitalArrayList; 
    
    public VitalSignsHistory(){
        vitalArrayList = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalDir() {
        return vitalArrayList;
    }

    public void setVitalDir(ArrayList<VitalSigns> vitalDir) {
        this.vitalArrayList = vitalDir;
    }

    public VitalSigns addVitalDir(int BloodPressure, double temperature, int SPO2Level) {
        VitalSigns v = new VitalSigns(BloodPressure, temperature, SPO2Level);
        vitalArrayList.add(v);
        return v;
    }
}
