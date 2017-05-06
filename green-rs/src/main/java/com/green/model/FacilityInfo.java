package com.green.model;

/**
 * Created by kirupakart on 23-04-2017.
 */
public class FacilityInfo {

    private String facilityType;
    private int noOfLiving;
    private int avg_served_daily_kg;
    private String facilityName;


    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    public int getNoOfLiving() {
        return noOfLiving;
    }

    public void setNoOfLiving(int noOfLiving) {
        this.noOfLiving = noOfLiving;
    }

    public int getAvg_served_daily_kg() {
        return avg_served_daily_kg;
    }

    public void setAvg_served_daily_kg(int avg_served_daily_kg) {
        this.avg_served_daily_kg = avg_served_daily_kg;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }



}
