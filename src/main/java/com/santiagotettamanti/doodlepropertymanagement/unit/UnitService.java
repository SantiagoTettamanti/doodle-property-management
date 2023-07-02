package com.santiagotettamanti.doodlepropertymanagement.unit;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UnitService {
    public ArrayList<Unit> units = new ArrayList<>();

    public boolean addUnit(Unit unit) {
        units.add(unit);
        return true;
    }

    public Unit getUnitById(int id) {
        for (int i = 0; i < units.size(); i++) {
            Unit currentUnit = units.get(i);
            int unitId = currentUnit.getUnitId();
            if (unitId == id) {
                return currentUnit;
            }
        }
        return null;
    }
}
