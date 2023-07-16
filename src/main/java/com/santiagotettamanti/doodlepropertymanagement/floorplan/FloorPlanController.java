package com.santiagotettamanti.doodlepropertymanagement.floorplan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class FloorPlanController {
    private final FloorPlanService floorPlanService;

    @Autowired
    public FloorPlanController (FloorPlanService floorPlanService) {
        this.floorPlanService = floorPlanService;
    }




    @GetMapping ("/floor-plan")
    public ArrayList<FloorPlan> getAllFloorPlans() {
        ArrayList<FloorPlan> floorPlans = floorPlanService.getFloorPlans();
        return floorPlans;
    }
}
