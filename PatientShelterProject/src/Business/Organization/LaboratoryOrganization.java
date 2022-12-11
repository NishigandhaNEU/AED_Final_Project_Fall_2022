/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.Role.LaboratoryRole;
import java.util.ArrayList;

/**
 *
 * @author Nishigandha
 */
public class LaboratoryOrganization extends Organization{
     public LaboratoryOrganization(String labName) {
        super(Organization.Type.LaboratoryOrganization.getValue(), labName);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LaboratoryRole());
        return roles;
    }
}
