package com.green.model;

import java.util.Date;

/**
 * Created by kirupakart on 23-04-2017.
 */
public class GreenBinAuditInfo {

    private String firstName;
    private String lastName;
    private String month;
    private int day;
    private Date time;
    private String binNumber;
    private float wasteQty_Kg;
    private String wasteGenerationPoint;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getBinNumber() {
        return binNumber;
    }

    public void setBinNumber(String binNumber) {
        this.binNumber = binNumber;
    }

    public float getWasteQty_Kg() {
        return wasteQty_Kg;
    }

    public void setWasteQty_Kg(float wasteQty_Kg) {
        this.wasteQty_Kg = wasteQty_Kg;
    }

    public String getWasteGenerationPoint() {
        return wasteGenerationPoint;
    }

    public void setWasteGenerationPoint(String wasteGenerationPoint) {
        this.wasteGenerationPoint = wasteGenerationPoint;
    }

}
