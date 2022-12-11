/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Nishigandha
 */
public abstract class Organization {

    private String orgName;
    private String orgType;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        DeliveryManOrganization("DeliveryManOrganization"),
        DoctorOrganization("DoctorOrganization"),
        HospitalOrganization("HospitalOrganization"),
        HospitalStaffOrganization("HospitalStaffOrganization"),
        LaboratoryOrganization("LaboratoryOrganization"),
        PharmacyOrganization("PharmacyOrganization"), 
        PharmacyStaffOrganization("PharmacyStaffOrganization"), 
        VaccineProviderOrganization("VaccineProviderOrganization"), 
        Patient("Patient"),
        //Person("Person"),
        SystemAdminOrganization("SystemAdminOrganization");
        
        private final String value;
        
        private Type(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
    }

    public Organization(String orgType, String orgName) {
        this.orgType = orgType;
        this.orgName = orgName;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    public Organization(){
        
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public String getType() {
        return orgType;
    }

    public void setType(String orgType) {
        this.orgType = orgType;
    }
    

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return orgName;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String orgName) {
        this.orgName = orgName;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return orgName;
    }
    
    
}
