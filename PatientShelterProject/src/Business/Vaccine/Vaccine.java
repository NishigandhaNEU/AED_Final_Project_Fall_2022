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
    
//    public Vaccine(int qty,int batchId,String status,String Name){
//        this.qty=qty;
//        this.batchId=batchId;
//        this.Name=Name;
//        this.status=status;
    public Vaccine(int quantity, int batchNo, String vacStatus, String vacName) {
        this.quantity = quantity;
        this.batchNo = batchNo;
        this.vacStatus = vacStatus;
        this.vacName = vacName;
    }

//    }
//    public int getQty() {
//        return qty;
//    }
//
//    public void setQty(int qty) {
//        this.qty = qty;
//    }
//
//    public int getBatchId() {
//        return batchId;
//    }
//
//    public void setBatchId(int batchId) {
//        this.batchId = batchId;
//    }
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public String getName() {
//        return Name;
//    }
//
//    public void setName(String Name) {
//        this.Name = Name;
//    }

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
