/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.Role.PharmacyRole;
import java.util.ArrayList;

/**
 *
 * @author Nishigandha
 */
public class PharmacyOrganization extends Organization{
     public PharmacyOrganization(String pharmName) {
        super(Organization.Type.PharmacyOrganization.getValue(), pharmName);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacyRole());
        return roles;
    }
}
