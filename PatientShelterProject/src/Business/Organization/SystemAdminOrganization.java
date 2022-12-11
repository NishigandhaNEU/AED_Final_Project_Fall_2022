/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Nishigandha
 */
public class SystemAdminOrganization extends Organization{
     public SystemAdminOrganization(String adminName) {
        super(Organization.Type.SystemAdminOrganization.getValue(), adminName);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SystemAdminRole());
        return roles;
    }
}
