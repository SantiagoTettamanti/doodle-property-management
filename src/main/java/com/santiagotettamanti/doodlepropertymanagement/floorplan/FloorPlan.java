package com.santiagotettamanti.doodlepropertymanagement.floorplan;

public class FloorPlan {
    private int floorPlanId;
    private String floorPlanName;
    private String unitType; //ie. 1 bedroom, 2 bath
    private int squareFeet;

    public int getFloorPlanId() {
        return floorPlanId;
    }

    public void setFloorPlanId(int floorPlanId) {
        this.floorPlanId = floorPlanId;
    }

    public String getFloorPlanName() {
        return floorPlanName;
    }

    public void setFloorPlanName(String floorPlanName) {
        this.floorPlanName = floorPlanName;
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
