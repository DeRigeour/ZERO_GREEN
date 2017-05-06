package com.green.service;

import com.green.model.*;

import java.util.List;

/**
 * Created by kirupakart on 23-04-2017.
 */
public interface IGreenService {

    /**
     * get Facility INfo
     * @return
     */
    List<FacilityGreenTeamInfo> getFacilityGreenTeamInfo();

    /**
     * Methd to update ro delete
     * @param teamInfo : single object
     * @param operationType : delete or update
     * @return : success or fail
     */
    boolean   updateFacilityGreenTeamInfo(FacilityGreenTeamInfo teamInfo , int operationType );

    /**
     * get AuditMemberInfo
     * @return
     */
    List<AuditMemberInfo> getAuditMemberInfo();

    /**
     * Methd to update ro delete
     * @param teamInfo : single object
     * @param operationType : delete or update
     * @return : success or fail
     */
    boolean   updateAuditMemberInfo(AuditMemberInfo teamInfo , int operationType );

    /**
     * get FacilityInfo
     * @return
     */
    List<FacilityInfo> getFacilityInfo();

    /**
     * Methd to update ro delete
     * @param teamInfo : single object
     * @param operationType : delete or update
     * @return : success or fail
     */
    boolean   updateFacilityInfo(FacilityInfo teamInfo , int operationType );

    /**
     * get FacilityInfo
     * @return
     */
    List<FacilityRoleAccess> getFacilityRoleAccess();

    /**
     * Methd to update ro delete
     * @param teamInfo : single object
     * @param operationType : delete or update
     * @return : success or fail
     */
    boolean   updateFacilityRoleAccess(FacilityRoleAccess teamInfo , int operationType );

    /**
     * get GreenBinAuditInfo
     * @return
     */
    List<GreenBinAuditInfo> getGreenBinAuditInfo();

    /**
     * Methd to update ro delete
     * @param teamInfo : single object
     * @param operationType : delete or update
     * @return : success or fail
     */
    boolean   updateGreenBinAuditInfos(GreenBinAuditInfo teamInfo , int operationType );

    /**
     * get GreenBinsInfo
     * @return
     */
    List<GreenBinsInfo> getGreenBinsInfo();

    /**
     * Methd to update ro delete
     * @param teamInfo : single object
     * @param operationType : delete or update
     * @return : success or fail
     */
    boolean   updateGreenBinsInfo(GreenBinsInfo teamInfo , int operationType );

    /**
     * get GreenFacilityInchargeInfo
     * @return
     */
    List<GreenFacilityInchargeInfo> getGreenFacilityInchargeInfo();

    /**
     * Methd to update ro delete
     * @param teamInfo : single object
     * @param operationType : delete or update
     * @return : success or fail
     */
    boolean   updateGreenFacilityInchargeInfo(GreenFacilityInchargeInfo teamInfo , int operationType );




}
