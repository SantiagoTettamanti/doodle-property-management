package com.santiagotettamanti.doodlepropertymanagement.property;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PropertyController {
    @GetMapping ("/property")
    public ArrayList<Property> getAllProperties() {
        return null;
    }
}
