/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Person.Person;
import Business.LabReport.LabReportDirectory;
import Business.VitalSigns.VitalSigns;
import Business.VitalSigns.VitalSignsHistory;
import Business.WorkQueue.AdmitPatient;
import static Business.WorkQueue.Order.gen;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Nishigandha
 */
public class Patient extends Person {
    int patientId;
    private String vacStatus;
    private String quarantineStatus;
    private String doctorName;
   private Person person;
    String AdmitStatus;
    VitalSignsHistory vitalSignHistory=new VitalSignsHistory();
    
   //VitalSignsHistory vitalHistory=new VitalSignsHistory();
   
public VitalSignsHistory getVitalHistory() {
        return vitalSignHistory;
    }
//    public VitalSignsHistory getVitalSignHistory() {
//        return vitalSignHistory;
//    }

    public void setVitalSignHistory(VitalSignsHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public Patient(int personID, String personName, String adress, String zipcode, int age, String communityName, String phoneNo, String email, String doctorName, String quarantineStatus, String vacStatus) {
        super(personID, personName, adress, zipcode, age, communityName, phoneNo, email);
        this.doctorName=doctorName;
        this.vacStatus=vacStatus;
        this.quarantineStatus=quarantineStatus;
        this.patientId = gen();
        this.AdmitStatus="Admitted";
    }

     public static int gen() {
        Random randomNo = new Random( System.currentTimeMillis() );
        return ((1 + randomNo.nextInt(2)) * 10000 + randomNo.nextInt(10000));
    }
     
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getVacStatus() {
        return vacStatus;
    }

    public void setVacStatus(String vacStatus) {
        this.vacStatus = vacStatus;
    }

    public String getQuarantineStatus() {
        return quarantineStatus;
    }

    public void setQuarantineStatus(String quarantineStatus) {
        this.quarantineStatus = quarantineStatus;
    }

   

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.doctorName = DoctorName;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LabReportDirectory getTestHistory() {
        return testHistory;
    }

    public void setTestHistory(LabReportDirectory testHistory) {
        this.testHistory = testHistory;
    }

//    public int getPersonID() {
//        return personID;
//    }
//
//    public void setPersonID(int personID) {
//        this.personID = personID;
//    }
//
//    public String getPersonName() {
//        return personName;
//    }
//
//    public void setPersonName(String name) {
//        this.personName = personName;
//    }
//
//    public String getAdress() {
//        return adress;
//    }
//
//    public void setAdress(String adress) {
//        this.adress = adress;
//    }
//
//    public String getZipcode() {
//        return zipcode;
//    }
//
//    public void setZipcode(String zipcode) {
//        this.zipcode = zipcode;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getCommunityName() {
//        return communityName;
//    }
//
//    public void setCommunityName(String communityName) {
//        this.communityName = communityName;
//    }
//
//  
//
//    public String getPhoneNo() {
//        return phoneNo;
//    }
//
//    public void setPhoneNo(String phoneNo) {
//        this.phoneNo = phoneNo;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }

    public String getAdmitStatus() {
        return AdmitStatus;
    }

    public void setAdmitStatus(String AdmitStatus) {
        this.AdmitStatus = AdmitStatus;
    }
    
@Override
        public String toString(){
            return personName;
        }
}
