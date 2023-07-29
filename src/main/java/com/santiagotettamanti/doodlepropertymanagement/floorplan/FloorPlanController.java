package com.santiagotettamanti.doodlepropertymanagement.floorplan;

import com.santiagotettamanti.doodlepropertymanagement.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class FloorPlanController {
    private final FloorPlanService floorPlanService;

    @Autowired
    public FloorPlanController (FloorPlanService floorPlanService) {
        this.floorPlanService = floorPlanService;
    }


    @PostMapping ("/floor-plan")
    public FloorPlan createFloorPlan(@RequestBody FloorPlan floorPlan) {
        return floorPlanService.addFloorPlan(floorPlan);
    }

    @GetMapping ("/floor-plan")
    public ArrayList<FloorPlan> getAllFloorPlans() {
        ArrayList<FloorPlan> floorPlans = floorPlanService.getFloorPlans();
        return floorPlans;
    }

    @PutMapping ("/floor-plan/{id}")
    public FloorPlan updateFloorPlan(@RequestBody FloorPlan floorPlan, @PathVariable int id) {
        FloorPlan updatedFloorPlan = floorPlanService.updateFloorPlan(floorPlan, id);
        return updatedFloorPlan;
    }

}
