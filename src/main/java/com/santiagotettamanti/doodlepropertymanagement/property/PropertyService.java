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

    public ArrayList<Property> getProperties() {
        return properties;
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

    public Property deletePropertyById(int id) {
        for(int i=0; i<properties.size(); i++) {
           if(properties.get(i).getPropertyId()==id) {
               return properties.remove(i);
           }
        }
        return null;
    }

    public Property updateProperty(Property propertyChanges, int id) {
        Property propertyToUpdate = getPropertyById(id);
        int newNumberOfUnits = propertyChanges.getNumberOfUnits();
        if (newNumberOfUnits != 0) {
            propertyToUpdate.setNumberOfUnits(newNumberOfUnits);
        }
        return propertyToUpdate;
    }
}
