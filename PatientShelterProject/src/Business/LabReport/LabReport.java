/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.LabReport;

import Business.Person.Person;
import java.util.Date;

/**
 *
 * @author Nishigandha
 */
public class LabReport {

    private boolean output;



    
    public boolean isResult() {
        return output;
    }

    public void setResult(boolean output) {
        this.output = output;
    }
    
    public LabReport( Boolean output){
        this.output = output;
    }
    
}
