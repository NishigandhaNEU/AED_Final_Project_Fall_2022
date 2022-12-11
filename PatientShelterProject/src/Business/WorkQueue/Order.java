/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.City.City;
import Business.Organization.VaccineProviderOrganization;
import Business.UserAccount.UserAccount;
import java.util.Random;

/**
 *
 * @author Nishigandha
 */
public class Order extends WorkRequest{
    
	private int id=0;
    
    private String vacName;
    private int quantity;
    private UserAccount deliveryManager=null;
    

    public UserAccount getDeliveryManager() {
        return deliveryManager;
    }

    public void setDeliveryManager(UserAccount deliveryManager) {
        this.deliveryManager = deliveryManager;
    }

    public String getVacName() {
        return vacName;
    }

    public void setVacName(String vacName) {
        this.vacName = vacName;
    }

    

    public Order(String message, UserAccount sender, UserAccount receiver, String status) {
        super(message, sender, receiver, status);
        this.id = gen();
        
    }
    public static int gen() {
        Random r = new Random( System.currentTimeMillis() );
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return vacName;
    }

   
    


    
}
