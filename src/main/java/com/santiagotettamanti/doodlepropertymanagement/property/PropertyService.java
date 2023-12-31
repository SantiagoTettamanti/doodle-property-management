package com.santiagotettamanti.doodlepropertymanagement.property;

import com.santiagotettamanti.doodlepropertymanagement.floorplan.FloorPlan;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;

@Service
public class PropertyService {
    private ArrayList<Property> properties = new ArrayList<>();

    public Property addProperty(Property property) {
        property.setPropertyId(properties.size()+1);
        properties.add(property);
        return property;
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
        String newAddress = propertyChanges.getAddress();
        if (newAddress != null) {
            propertyToUpdate.setAddress(newAddress);
        }
        int newNumberOfUnits = propertyChanges.getNumberOfUnits();
        if (newNumberOfUnits != 0) {
            propertyToUpdate.setNumberOfUnits(newNumberOfUnits);
        }
        LocalDate newYearBuilt = propertyChanges.getYearBuilt();
        if (newYearBuilt != null) {
            propertyToUpdate.setYearBuilt(newYearBuilt);
        }
        return propertyToUpdate;
    }
}
