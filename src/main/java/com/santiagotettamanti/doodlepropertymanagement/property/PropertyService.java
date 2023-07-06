package com.santiagotettamanti.doodlepropertymanagement.property;

import com.santiagotettamanti.doodlepropertymanagement.floorplan.FloorPlan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PropertyService {
    private ArrayList<Property> properties = new ArrayList<>();

    public boolean addProperty(Property property) {
        properties.add(property);
        return true;
    }

    public Property getPropertyById(int id) {
        for(int i=0; i<properties.size(); i++) {
            Property currentProperty = properties.get(i);
            currentProperty.getPropertyId();
            if(currentProperty.getPropertyId()==id) {
                return currentProperty;
            }
        }
        return null;
    }
}
