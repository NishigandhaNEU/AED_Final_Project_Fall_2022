/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

/**
 *
 * @author Nishigandha
 */
public class Vaccine {
    private int quantity;
    private int batchNo;
    private String vacStatus;
    private String vacName;
    

    public Vaccine(int quantity, int batchNo, String vacStatus, String vacName) {
        this.quantity = quantity;
        this.batchNo = batchNo;
        this.vacStatus = vacStatus;
        this.vacName = vacName;
    }



    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(int batchNo) {
        this.batchNo = batchNo;
    }

    public String getVacStatus() {
        return vacStatus;
    }

    public void setVacStatus(String vacStatus) {
        this.vacStatus = vacStatus;
    }

    public String getVacName() {
        return vacName;
    }

    public void setVacName(String vacName) {
        this.vacName = vacName;
    }
    @Override
        public String toString(){
            return vacName;
        }
    
    
    
    
}
