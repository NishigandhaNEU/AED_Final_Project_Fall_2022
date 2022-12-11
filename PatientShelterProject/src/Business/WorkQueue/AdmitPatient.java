/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author Nishigandha
 */
public class AdmitPatient extends WorkRequest {
    private String doctorName;
    private String patientName;
    int PatientId=1;
    private String admitStatus;
    
    public AdmitPatient(String message, UserAccount sender, UserAccount receiver, String status) {
        super(message, sender, receiver, status);
        PatientId++;
    }
 

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientID() {
        return PatientId;
    }

    public void setPatientID(int PatientID) {
        this.PatientId = PatientID;
    }

    public String getAdmitStatus() {
        return admitStatus;
    }

    public void setAdmitStatus(String admitStatus) {
        this.admitStatus = admitStatus;
    }
    
}
