package com.santiagotettamanti.doodlepropertymanagement.tenant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TenantController {
    private final TenantService tenantService;

    @Autowired
    public TenantController(TenantService tenantService) {
        this.tenantService = tenantService;
    }
    @GetMapping ("/tenant")
    public ArrayList<Tenant> getAllTenants() {
        return tenantService.getTenants();
    }
}
