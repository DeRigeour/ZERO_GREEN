package com.green.model;

/**
 * Created by kirupakart on 23-04-2017.
 */
public class GreenFacilityInchargeInfo {

    private String binIncharge;

    //contact id
    private int id;


    private FacilityGreenTeamInfo facilityGreenTeamInfo = new FacilityGreenTeamInfo();

    public FacilityGreenTeamInfo getFacilityGreenTeamInfo() {
        return facilityGreenTeamInfo;
    }

    public void setFacilityGreenTeamInfo(FacilityGreenTeamInfo facilityGreenTeamInfo) {
        this.facilityGreenTeamInfo = facilityGreenTeamInfo;
    }

    public String getBinIncharge() {
        return binIncharge;
    }

    public void setBinIncharge(String binIncharge) {
        this.binIncharge = binIncharge;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
