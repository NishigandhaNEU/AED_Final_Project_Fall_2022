/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Nishigandha
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseArrayList;

    public ArrayList<Enterprise> getEnterpriseArrayList() {
        return enterpriseArrayList;
    }

    public void setEnterpriseArrayList(ArrayList<Enterprise> enterpriseArrayList) {
        this.enterpriseArrayList = enterpriseArrayList;
    }

  
    
    public EnterpriseDirectory(){
        enterpriseArrayList=new ArrayList<Enterprise>();
    }
    
   
    public boolean checkIfEnterpriseNameIsUnique(String name){
        for (Enterprise e : enterpriseArrayList){
            if (e.getOrganizationDirectory().getOrganization(name).equals(name))
                return false;
        }
        return true;
    }

    
        public boolean checkIfIDIsUnique(int ID){
        for (Enterprise  e : enterpriseArrayList){
            if (e.getEnterpId()==ID)
                return false;
        }
        return true;
    }
    
}
