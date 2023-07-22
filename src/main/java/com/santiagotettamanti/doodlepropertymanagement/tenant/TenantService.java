package com.santiagotettamanti.doodlepropertymanagement.tenant;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;

@Service
public class TenantService {
    private ArrayList<Tenant> tenants = new ArrayList<>();

    public boolean addTenant(Tenant tenant) {
        tenants.add(tenant);
        return true;
    }

    public ArrayList<Tenant> getTenants() {
        return tenants;
    }

    public Tenant getTenantById(int id) {
        for(int i=0; i<tenants.size(); i++) {
            Tenant currentTenant = tenants.get(i);
            int tenantId = currentTenant.getTenantId();
            if(tenantId == id) {
                return currentTenant;
            }
        }
        return null;
    }

    public Tenant deleteTenantById(int id) {
        for(int i=0; i<tenants.size(); i++) {
            Tenant currentTenant = tenants.get(i);
            int tenantId = currentTenant.getTenantId();
            if(tenantId == id) {
                tenants.remove(currentTenant);
                return currentTenant;
            }
        }
        return null;
    }

    public Tenant updateTenant(Tenant tenant, int id) {
        Tenant tenantToUpdate = getTenantById(id);
        String newFirstName = tenantToUpdate.getFirstName();
        String newLastName = tenantToUpdate.getLastName();
        String newEmail = tenantToUpdate.getEmail();
        LocalDate newDateOfBirth = tenant.getDateOfBirth();
        LocalDate newMoveInDate = tenantToUpdate.getMoveInDate();
        LocalDate newMoveOutDate = tenantToUpdate.getMoveOutDate();
        if (newFirstName != null) {
            tenantToUpdate.setFirstName(newFirstName);
        }
        if (newLastName != null) {
            tenantToUpdate.setLastName(newLastName);
        }
        if (newEmail != null) {
            tenantToUpdate.setEmail(newEmail);
        }
        if (newDateOfBirth != null) {
            tenantToUpdate.setDateOfBirth(newDateOfBirth);
        }
        if (newMoveInDate != null) {
            tenantToUpdate.setMoveInDate(newMoveInDate);
        }
        if (newMoveOutDate != null) {
            tenantToUpdate.setMoveOutDate(newMoveOutDate);
        }
        return tenantToUpdate;
    }
}
