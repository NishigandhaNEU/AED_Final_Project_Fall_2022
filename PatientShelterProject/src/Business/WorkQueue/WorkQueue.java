/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Nishigandha
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestArrayList;

    public WorkQueue() {
        workRequestArrayList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestArrayList;
    }
    
    public Order addWorkRequestList(String message, UserAccount sender, UserAccount receiver, String status) {
        Order temp = new Order(message, sender, receiver, status);
        workRequestArrayList.add(temp);
        return temp;
    }
    
    public VaccinatePatient addWorkRequestList2(String message, UserAccount sender, UserAccount receiver, String status){
        VaccinatePatient temp = new VaccinatePatient(message, sender, receiver, status);
        workRequestArrayList.add(temp);
        return temp;
    }
    
     public TestPatient addWorkRequestList3(String message, UserAccount sender, UserAccount receiver, String status){
        TestPatient temp = new TestPatient(message, sender, receiver, status);
        workRequestArrayList.add(temp);
        return temp;
    }
}