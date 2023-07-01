package com.santiagotettamanti.doodlepropertymanagement.floorplan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class FloorPlanController {
    @GetMapping ("/floor-plan")
    public ArrayList<FloorPlan> getAllFloorPlans() {
        return null; //but I promise we will return something!!
    }
}
