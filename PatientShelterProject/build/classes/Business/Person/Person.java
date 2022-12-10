/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import Business.LabReport.LabReport;
import Business.LabReport.LabReportDirectory;

/**
 *
 * @author Nishigandha
 */
public class Person {
    public int personID;
    public String personName;
    public String adress;
    public String zipcode;
    public int age;
    public String communityName;
    public String phoneNo;
    public String email;
    public LabReportDirectory testHistory=new LabReportDirectory();
    
    
    public Person(int personID, String personName, String adress, String zipcode, int age, String communityName, String phoneNo, String email){
        this.personID = personID;
        this.personName = personName;
        this.adress = adress;
        this.zipcode = zipcode;
        this.age = age;
        this.communityName = communityName;
        this.phoneNo = phoneNo;
        this.email = email;
        
        
    }

    public LabReportDirectory getTestHistory() {
        return testHistory;
    }

    public void setTestHistory(LabReportDirectory testHistory) {
        this.testHistory = testHistory;
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
    
    public boolean isMatch(int id){
        if(getPersonID()==id) return true;
        return false;
    }
    
    @Override
    public String toString(){
        return personName;
    }
    
    
}
