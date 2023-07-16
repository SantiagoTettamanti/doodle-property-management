package com.santiagotettamanti.doodlepropertymanagement.floorplan;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FloorPlanService {
    private ArrayList<FloorPlan> floorPlans = new ArrayList<>();

    public boolean addFloorPlan(FloorPlan floorPlan) {
        floorPlans.add(floorPlan);
        return true;
    }

    public ArrayList<FloorPlan> getFloorPlans() {
        return floorPlans;
    }

    public FloorPlan getFloorPlanById(int id) {
        for(int i=0; i<floorPlans.size(); i++) {
            FloorPlan currentFloorPlan = floorPlans.get(i);
            int FloorPlanId = currentFloorPlan.getFloorPlanId();
            if(FloorPlanId==id) {
                return currentFloorPlan;
            }
        }
        return null;
    }

    public FloorPlan deleteFloorPlanById(int id) {
        for(int i=0; i<floorPlans.size(); i++) {
            if (floorPlans.get(i).getFloorPlanId() == id) {
                return floorPlans.remove(i);
            }
        }
        return null;
    }
}
