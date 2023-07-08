package com.santiagotettamanti.doodlepropertymanagement.tenant;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TenantService {
    private ArrayList<Tenant> tenants = new ArrayList<>();

    public boolean addTenant(Tenant tenant) {
        tenants.add(tenant);
        return true;
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
}
