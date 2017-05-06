package com.green.service;

import com.green.dao.GreenDataPersistenceImpl;
import com.green.model.*;

import java.util.List;

/**
 * Created by kirupakart on 23-04-2017.
 */
public class GreenServiceImpl implements IGreenService {

    GreenDataPersistenceImpl greenDataPersistenceImpl= new GreenDataPersistenceImpl();
    @Override
    public List<FacilityGreenTeamInfo> getFacilityGreenTeamInfo() {

        return greenDataPersistenceImpl.getFacilityGreenTeamInfo();
    }

    @Override
    public boolean updateFacilityGreenTeamInfo(FacilityGreenTeamInfo teamInfo, int operationType) {
        return false;
    }

    @Override
    public List<AuditMemberInfo> getAuditMemberInfo() {
        return null;
    }

    @Override
    public boolean updateAuditMemberInfo(AuditMemberInfo teamInfo, int operationType) {
        return false;
    }

    @Override
    public List<FacilityInfo> getFacilityInfo() {
        return null;
    }

    @Override
    public boolean updateFacilityInfo(FacilityInfo teamInfo, int operationType) {
        return false;
    }

    @Override
    public List<FacilityRoleAccess> getFacilityRoleAccess() {
        return greenDataPersistenceImpl.getFacilityRoleAccess();
    }

    @Override
    public boolean updateFacilityRoleAccess(FacilityRoleAccess teamInfo, int operationType) {
        return false;
    }

    @Override
    public List<GreenBinAuditInfo> getGreenBinAuditInfo() {

        return greenDataPersistenceImpl.getGreenBinAuditInfo();
    }

    @Override
    public boolean updateGreenBinAuditInfos(GreenBinAuditInfo teamInfo, int operationType) {
        return false;
    }

    @Override
    public List<GreenBinsInfo> getGreenBinsInfo() {

        return greenDataPersistenceImpl.getGreenBinsInfo();
    }

    @Override
    public boolean updateGreenBinsInfo(GreenBinsInfo teamInfo, int operationType) {
        return false;
    }

    @Override
    public List<GreenFacilityInchargeInfo> getGreenFacilityInchargeInfo() {

        return greenDataPersistenceImpl.getGreenFacilityInchargeInfo();

    }

    @Override
    public boolean updateGreenFacilityInchargeInfo(GreenFacilityInchargeInfo teamInfo, int operationType) {
        return false;
    }
}
