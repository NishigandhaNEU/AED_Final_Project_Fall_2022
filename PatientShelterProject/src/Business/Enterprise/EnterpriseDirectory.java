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
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type, int id){
        Enterprise enterprise=null;
        if( null!=type)switch (type) {
                case Hospital:
                    enterprise=new Hospital(name);
                    enterpriseArrayList.add(enterprise);
                    enterprise.setEnterpId(id);
                    break;
                case Laboratory:
                    enterprise=new Laboratory(name);
                    enterpriseArrayList.add(enterprise);
                    enterprise.setEnterpId(id);
                    break;
                case Pharmacy:
                    enterprise=new Pharmacy(name);
                    enterpriseArrayList.add(enterprise);
                    enterprise.setEnterpId(id);
                    break;
                case VaccineProvider:
                    enterprise=new VaccineProvider(name);
                    enterpriseArrayList.add(enterprise);
                    enterprise.setEnterpId(id);
                    break;
                default:
                    break;
            }
            return enterprise;
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
