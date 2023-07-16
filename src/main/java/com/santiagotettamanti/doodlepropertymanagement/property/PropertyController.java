package com.santiagotettamanti.doodlepropertymanagement.property;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PropertyController {
    private final PropertyService propertyService;

    @Autowired
    public PropertyController (PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @GetMapping ("/property")
    public ArrayList<Property> getAllProperties() {
        ArrayList<Property> properties = propertyService.getProperties();
        return properties;
    }
}
