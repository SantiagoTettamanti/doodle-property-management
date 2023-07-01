package com.santiagotettamanti.doodlepropertymanagement.unit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UnitController {
    @GetMapping ("/unit")
    public ArrayList<Unit> getAllUnits() {
        return null; //patience is a virtue
    }
}
