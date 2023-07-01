package com.santiagotettamanti.doodlepropertymanagement.floorplan;

public class FloorPlan {
    private int floorPlanId;
    private String floorPlan;
    private String unitType;
    private int squareFeet;

    public int getFloorPlanId() {
        return floorPlanId;
    }

    public void setFloorPlanId(int floorPlanId) {
        this.floorPlanId = floorPlanId;
    }

    public String getFloorPlan() {
        return floorPlan;
    }

    public void setFloorPlan(String floorPlan) {
        this.floorPlan = floorPlan;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }
}
