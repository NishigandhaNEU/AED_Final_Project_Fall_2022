/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.PharmacyStaffRole;
import java.util.ArrayList;

/**
 *
 * @author Nishigandha
 */
public class PharmacyStaffOrganization extends Organization{
     public PharmacyStaffOrganization(String staffName) {
        super(Organization.Type.PharmacyStaffOrganization.getValue(), staffName);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacyStaffRole());
        return roles;
    }
}
