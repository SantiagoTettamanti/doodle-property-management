package com.santiagotettamanti.doodlepropertymanagement.floorplan;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class FloorplanServiceTest {
    FloorPlanService floorplanService = new FloorPlanService();

    @Test
    void addFloorplan() {
        FloorPlan newFloorplan = new FloorPlan();
        newFloorplan.setFloorPlanName("Valheim");
        newFloorplan.setUnitType("2bed1bath");
        newFloorplan.setSquareFeet(720);
        FloorPlan floorPlan = floorplanService.addFloorPlan(newFloorplan);
        assertEquals(1, floorPlan.getFloorPlanId());
    }

    @Test
    void getFloorplans() {
        addFloorplan();
        ArrayList<FloorPlan> floorPlans = floorplanService.getFloorPlans();
        assertEquals(1, floorPlans.size());
    }
}
