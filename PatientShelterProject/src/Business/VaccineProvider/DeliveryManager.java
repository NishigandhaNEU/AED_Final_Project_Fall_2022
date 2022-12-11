/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VaccineProvider;

import Business.Person.Person;

/**
 *
 * @author Nishigandha
 */
public class DeliveryManager extends Person{
    private int DeliveryManagerId;

//    public DeliveryManager(int personID, String name, String street, String zipcode, int age, String Community, String phoneNo, String email) {
//        super(personID, name, street, zipcode, age, Community, phoneNo, email);
//    }

    public DeliveryManager(int DeliveryManagerId, int personID, String personName, String adress, String zipcode, int age, String communityName, String phoneNo, String email) {
        super(personID, personName, adress, zipcode, age, communityName, phoneNo, email);
        this.DeliveryManagerId = DeliveryManagerId;
    }
    
    
    public int getDeliveryManagerId() {
        return DeliveryManagerId;
    }

    public void setDeliveryManagerId(int DeliveryManagerId) {
        this.DeliveryManagerId = DeliveryManagerId;
    }
    
}
