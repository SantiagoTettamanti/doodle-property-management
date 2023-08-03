package com.santiagotettamanti.doodlepropertymanagement.tenant;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TenantServiceTest {
    TenantService tenantService = new TenantService();

    @Test
    void addTenant() {
        Tenant newTenant = new Tenant();
        newTenant.setFirstName("Bob");
        newTenant.setLastName("Dylan");
        newTenant.setUnitId(1);
        newTenant.setMoveOutDate(LocalDate.of(2023, 1, 25));
        newTenant.setMoveInDate(LocalDate.of(2022, 1, 25));
        newTenant.setEmail("bob.dylan@gmail.com");
        Tenant tenant = tenantService.addTenant(newTenant);
        assertEquals(1, tenant.getTenantId());
    }

    @Test
    void getTenant() {
        addTenant();
        ArrayList<Tenant> tenants = tenantService.getTenants();
        assertEquals(1, tenants.size());
    }
}
