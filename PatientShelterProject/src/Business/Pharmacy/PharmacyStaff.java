/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacy;

import Business.Person.Person;
import Business.LabReport.LabReportDirectory;

/**
 *
 * @author Nishigandha
 */
public class PharmacyStaff extends Person{
    


    public PharmacyStaff(int personID, String personName, String adress, String zipcode, int age, String communityName, String phoneNo, String email) {
        super(personID, personName, adress, zipcode, age, communityName, phoneNo, email);
    }

    
    
}
