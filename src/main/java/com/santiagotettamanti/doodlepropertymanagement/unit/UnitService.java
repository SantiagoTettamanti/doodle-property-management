package com.santiagotettamanti.doodlepropertymanagement.unit;

import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Service
public class UnitService {
    public ArrayList<Unit> units = new ArrayList<>();

    public Unit addUnit(Unit unit) {
        unit.setUnitId(units.size()+1);
        units.add(unit);
        return unit;
    }

    public ArrayList<Unit> getUnits() {
        return units;
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

    public Unit deleteUnitById(int id) {
        for(int i=0; i<units.size(); i++) {
            Unit currentUnit = units.get(i);
            int unitId = currentUnit.getUnitId();
            if(unitId == id) {
                units.remove(currentUnit);
                return currentUnit;
            }
        }
        return null;
    }

    public Unit updateUnit (Unit unit, int id) {
        Unit unitToUpdate = getUnitById(id);
        String newFloorLevel = unitToUpdate.getFloorLevel();
        int newRentCost = unitToUpdate.getRentCost();
        boolean newIsVacant = unitToUpdate.isVacant();
        if (newFloorLevel != null) {
            unitToUpdate.setFloorLevel(newFloorLevel);
        }
        if (newRentCost != 0) {
            unitToUpdate.setRentCost(newRentCost);
        }
        /*if (newIsVacant != ) {
            unitToUpdate.setVacant
        } */
        return unitToUpdate;
    }
}
