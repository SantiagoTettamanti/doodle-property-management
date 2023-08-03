package com.santiagotettamanti.doodlepropertymanagement.property;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

public class PropertyServiceTest {
    PropertyService propertyService = new PropertyService();

    @Test
    void addProperty() {
        Property newProperty = new Property();
        newProperty.setAddress("1234 Optimus Ln.");
        newProperty.setNumberOfUnits(65);
        newProperty.setYearBuilt(LocalDate.of(2009,9,5));
        Property property = propertyService.addProperty(newProperty);
        assertEquals(1, property.getPropertyId());
    }

    @Test
    void getProperty() {
        addProperty();
        ArrayList<Property> properties = propertyService.getProperties();
        assertEquals(1, properties.size());
    }
}
