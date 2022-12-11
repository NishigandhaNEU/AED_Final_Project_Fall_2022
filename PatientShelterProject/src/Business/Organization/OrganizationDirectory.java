/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package Business.Organization;



import Business.Organization.Organization.Type;
import java.util.ArrayList;



/**
*
* @author Nishigandha
*/
public class OrganizationDirectory {

private ArrayList<Organization> organizationArrayList;



    public OrganizationDirectory() {
        organizationArrayList = new ArrayList();
    }




    public ArrayList<Organization> getOrganizationArrayList() {
        return organizationArrayList;
    }

   

public Organization createOrganization(Type type, String name){
    Organization organization = null;
    if (type.getValue().equals(Type.DoctorOrganization.getValue())){
        organization = new DoctorOrganization(name);
        organizationArrayList.add(organization);
       }
    else if (type.getValue().equals(Type.DeliveryManOrganization.getValue())){
        organization = new DeliveryManOrganization(name);
        organizationArrayList.add(organization);
       }
    else if (type.getValue().equals(Type.HospitalOrganization.getValue())){
        organization = new HospitalOrganization(name);
        organizationArrayList.add(organization);
        }
    else if (type.getValue().equals(Type.HospitalStaffOrganization.getValue())){
        organization = new HospitalStaffOrganization(name);
        organizationArrayList.add(organization);
        }
    else if (type.getValue().equals(Type.Patient.getValue())){
        organization = new PatientOrganization(name);
        organizationArrayList.add(organization);
        }
    else if (type.getValue().equals(Type.SystemAdminOrganization.getValue())){
        organization = new SystemAdminOrganization(name);
        organizationArrayList.add(organization);
        }
    else if (type.getValue().equals(Type.LaboratoryOrganization.getValue())){
        organization = new LaboratoryOrganization(name);
        organizationArrayList.add(organization);
        }
    else if (type.getValue().equals(Type.PharmacyOrganization.getValue())){
        organization = new PharmacyOrganization(name);
        organizationArrayList.add(organization);
        }
    else if (type.getValue().equals(Type.PharmacyStaffOrganization.getValue())){
        organization = new PharmacyStaffOrganization(name);
        organizationArrayList.add(organization);
        }
    else if (type.getValue().equals(Type.VaccineProviderOrganization.getValue())){
        organization = new VaccineProviderOrganization(name);
        organizationArrayList.add(organization);
        }

    return organization;
    }

    public void removeOrganization(Organization org){
        organizationArrayList.remove(org);
    }

    public Organization getOrganization(String name){
        for(Organization o : organizationArrayList){
        if(o.getName().equalsIgnoreCase(name)){
            return o;
    }
        }
        return null;
    }
    }