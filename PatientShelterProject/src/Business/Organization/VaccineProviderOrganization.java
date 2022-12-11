/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.Role.VaccineProviderRole;
import java.util.ArrayList;

/**
 *
 * @author Nishigandha
 */
public class VaccineProviderOrganization extends Organization{
     public VaccineProviderOrganization(String vacName) {
        super(Organization.Type.VaccineProviderOrganization.getValue(), vacName);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VaccineProviderRole());
        return roles;
    }
}
