package com.santiagotettamanti.doodlepropertymanagement.tenant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TenantController {
    @GetMapping ("/tenant")
    public ArrayList<Tenant> getAllTenants() {
        return null; //not forever, though ;)
    }
}
