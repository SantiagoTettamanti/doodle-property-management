package com.santiagotettamanti.doodlepropertymanagement.unit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UnitController {
    private final UnitService unitService;

    @Autowired
    public UnitController(UnitService unitService) {
        this.unitService = unitService;
    }
    @GetMapping ("/unit")
    public ArrayList<Unit> getAllUnits() {
        return unitService.getUnits();
    }

    @PutMapping ("/unit/{id}")
    public Unit updateUnit (@RequestBody Unit unit, @PathVariable int id) {
        Unit updatedUnit = unitService.updateUnit(unit, id);
        return updatedUnit;
    }
}
