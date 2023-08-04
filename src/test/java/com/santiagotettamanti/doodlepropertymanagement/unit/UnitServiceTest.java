package com.santiagotettamanti.doodlepropertymanagement.unit;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitServiceTest {
    UnitService unitService = new UnitService();

    @Test
    void addUnit() {
        Unit newUnit = new Unit();
        newUnit.setVacant(true);
        newUnit.setRentCost(1850);
        newUnit.setFloorLevel("3rd floor");
        newUnit.setEmployeeId(1);
        newUnit.setFloorPlanId(10);
        newUnit.setPropertyId(3);
        newUnit.setTenantId(2);
        Unit unit = unitService.addUnit(newUnit);
        assertEquals(1, unit.getUnitId());
    }

    @Test
    void getUnit() {
        addUnit();
        ArrayList<Unit> units = unitService.getUnits();
        assertEquals(1, units.size());
    }
}
