/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.LabReport;

import Business.Person.Person;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nishigandha
 */
public class LabReportDirectory {
    
   ArrayList<LabReport> testReportList=new ArrayList<LabReport>();

    public ArrayList<LabReport> getTestReportList() {
        return testReportList;
    }

    public void setTestReportList(ArrayList<LabReport> testReportList) {
        this.testReportList = testReportList;
    }
   
   public LabReport newTestReport(Boolean result){
       LabReport testReport = new LabReport(result);
       testReportList.add(testReport);
       return testReport;
   }
   
   
   
    
    
            
            
}
