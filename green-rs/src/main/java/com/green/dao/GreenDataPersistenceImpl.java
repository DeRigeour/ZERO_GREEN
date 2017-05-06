package com.green.dao;

import com.green.model.*;
import org.springframework.util.StringUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by kirupakart on 23-04-2017.
 */
public class GreenDataPersistenceImpl {


    private final String FACILITY_INFO_MASTER = "FACILITY_INFO_MASTER";
    private final String FACILITY_GREEN_TEAM_INFO = "FACILITY_GREEN_TEAM_INFO";
    private final String GREEN_BINS_MASTER_INFO = "GREEN_BINS_MASTER_INFO";
    private final String GREEN_TEAM_FACILITY_INCHARGE_INFO = "GREEN_TEAM_FACILITY_INCHARGE_INFO";
    private final String AUDIT_VERIFY_MEMBER_INFO = "AUDIT_VERIFY_MEMBER_INFO";
    private final String FACILITY_ROLE_BASED_ACCESS = "FACILITY_ROLE_BASED_ACCESS";
    private final String GREEN_BIN_AUDIT_INFO = "GREEN_BIN_AUDIT_INFO";


    private   Connection createConnection(   )
    {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:D:\\Android_Support_Tools\\gs-rest-service-master\\gs-rest-service-master\\complete\\test.db");
            System.out.println("Opened database successfully");


        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        return c;
     }

    private   void closeConnection(  Connection c )
    {
        try {
            c.close();
        }catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }


     public List<FacilityGreenTeamInfo> getFacilityGreenTeamInfo() {

        Statement stmt = null;
        List < FacilityGreenTeamInfo> facilityGreenTeamInfoList = new ArrayList ();
        try {
            Connection c = createConnection();

            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String query = " SELECT * FROM "+FACILITY_GREEN_TEAM_INFO + " ;" ;
            System.out.println("====query=="+query);

            ResultSet rs = stmt.executeQuery( query);
            while (rs.next()) {
                FacilityGreenTeamInfo facilityGreenTeamInfo =  new FacilityGreenTeamInfo();

                System.out.println("==1==query=="+query);
                facilityGreenTeamInfo.setId(rs.getInt("id"));
                facilityGreenTeamInfo.setContactNumber( rs.getLong("CONTACT_NUMBER"));
                facilityGreenTeamInfo.setFirstName(  rs.getString("FIRST_NAME"));
                facilityGreenTeamInfo.setLastName(rs.getString("LAST_NAME"));
                facilityGreenTeamInfo.setDesignation( rs.getString("DESIGNATION"));
                facilityGreenTeamInfo.setEmail( rs.getString("EMAIL_ADDRESS"));
                System.out.println("ID = " + facilityGreenTeamInfo.getEmail());

                facilityGreenTeamInfoList.add(facilityGreenTeamInfo);
            }
            rs.close();
            stmt.close();
            closeConnection(c);
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        return facilityGreenTeamInfoList;

    }

    public boolean updateFacilityGreenTeamInfo(FacilityGreenTeamInfo teamInfo, int operationType) {
        return false;
    }

    public List<AuditMemberInfo> getAuditMemberInfo() {
        return null;
    }

    public boolean updateAuditMemberInfo(AuditMemberInfo teamInfo, int operationType) {
        return false;
    }

    public List<FacilityInfo> getFacilityInfo() {
        return null;
    }

    public boolean updateFacilityInfo(FacilityInfo teamInfo, int operationType) {
        return false;
    }

    public List<FacilityRoleAccess> getFacilityRoleAccess() {

        Statement stmt = null;
        List < FacilityRoleAccess> facilityRoleAccessList = new ArrayList ();
        try {
            Connection c = createConnection();

            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String query = " SELECT * FROM "+FACILITY_ROLE_BASED_ACCESS+ " ;" ;
            System.out.println("====query=="+query);

            ResultSet rs = stmt.executeQuery( query);
            while (rs.next()) {

                FacilityRoleAccess facilityRoleAccess =  new FacilityRoleAccess();

                System.out.println("==1==query=="+query);

                facilityRoleAccess.setRoleType(  rs.getString("ROLE"));
                facilityRoleAccess.setRoleDesc(rs.getString("DESCRIPTION"));

                facilityRoleAccessList.add(facilityRoleAccess);
            }
            rs.close();
            stmt.close();
            closeConnection(c);
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        return facilityRoleAccessList;
    }

    public boolean updateFacilityRoleAccess(FacilityRoleAccess teamInfo, int operationType) {
        return false;
    }

    public List<GreenBinAuditInfo> getGreenBinAuditInfo() {
        Statement stmt = null;
        List < GreenBinAuditInfo> greenBinAuditInfoList = new ArrayList ();
        try {
            Connection c = createConnection();

            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String query = " SELECT * FROM "+GREEN_BIN_AUDIT_INFO + " ;" ;
            System.out.println("====query=="+query);

            ResultSet rs = stmt.executeQuery( query);
            while (rs.next()) {
                GreenBinAuditInfo greenBinAuditInfo =  new GreenBinAuditInfo();

                System.out.println("==1==query=="+query);

                greenBinAuditInfo.setFirstName(  rs.getString("FIRST_NAME"));
                greenBinAuditInfo.setLastName(rs.getString("LAST_NAME"));
                greenBinAuditInfo.setMonth(rs.getString("MONTH"));
                greenBinAuditInfo.setDay( rs.getInt("DAY"));
                String strdate = rs.getString("TIME");
                if ( !StringUtils.isEmpty( strdate)) {
                    Date df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(strdate); //Throws exception

                    greenBinAuditInfo.setTime( df);
                }
                greenBinAuditInfo.setBinNumber( rs.getString("BIN_NUMBER"));
                greenBinAuditInfo.setWasteQty_Kg( rs.getInt("WASTE_VOLUME_QTY_KG"));
                greenBinAuditInfo.setWasteGenerationPoint( rs.getString("WASTE_GENERATION_POINT"));

                greenBinAuditInfoList.add(greenBinAuditInfo);
            }
            rs.close();
            stmt.close();
            closeConnection(c);
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        return greenBinAuditInfoList;

    }

    public boolean updateGreenBinAuditInfos(GreenBinAuditInfo teamInfo, int operationType) {
        return false;
    }

    public List<GreenBinsInfo> getGreenBinsInfo() {
        Statement stmt = null;
        List < GreenBinsInfo> greenBinsInfoList = new ArrayList ();
        try {
            Connection c = createConnection();

            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String query = " SELECT * FROM "+GREEN_BINS_MASTER_INFO + " ;" ;
            System.out.println("====query=="+query);

            ResultSet rs = stmt.executeQuery( query);
            while (rs.next()) {

                GreenBinsInfo greenBinsInfo =  new GreenBinsInfo();

                System.out.println("==1==query=="+query);

                greenBinsInfo.setGeenrationPoint(  rs.getString("GENERATION_POINT"));
                greenBinsInfo.setMaterial(rs.getString("MATERIAL"));
                greenBinsInfo.setBinNumber(rs.getString("BIN_NUMBER"));
                greenBinsInfo.setCapacity_kg( rs.getInt("CAPACITY_KG"));

                greenBinsInfoList.add(greenBinsInfo);
            }
            rs.close();
            stmt.close();
            closeConnection(c);
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        return greenBinsInfoList;
    }

    public boolean updateGreenBinsInfo(GreenBinsInfo teamInfo, int operationType) {
        return false;
    }

    public List<GreenFacilityInchargeInfo> getGreenFacilityInchargeInfo() {

        Statement stmt = null;
        List < GreenFacilityInchargeInfo> greenFacilityInchargeInfoList = new ArrayList ();
        try {
            Connection c = createConnection();

            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            StringBuilder query = new StringBuilder();
            query.append(" SELECT FACILITY_INCHARE.INCHARGE , GREEN_TEAM.CONTACT_NUMBER , GREEN_TEAM.FIRST_NAME , ") ;
            query.append("   GREEN_TEAM.LAST_NAME , GREEN_TEAM.DESIGNATION ,GREEN_TEAM.EMAIL_ADDRESS  ") ;
            query.append(" FROM ") ;
            query.append(  GREEN_TEAM_FACILITY_INCHARGE_INFO +" FACILITY_INCHARE , ") ;
            query.append( FACILITY_GREEN_TEAM_INFO +" GREEN_TEAM ") ;
            query.append( " WHERE ");
            query.append(" FACILITY_INCHARE.CONTACT_ID = GREEN_TEAM.ID ; ");
            System.out.println("====query=="+query.toString());

            ResultSet rs = stmt.executeQuery( query.toString());
            while (rs.next()) {
                GreenFacilityInchargeInfo greenFacilityInchargeInfo =  new GreenFacilityInchargeInfo();

                System.out.println("==1==query=="+query);

                greenFacilityInchargeInfo.setBinIncharge(  rs.getString("INCHARGE"));
                greenFacilityInchargeInfo.getFacilityGreenTeamInfo().setContactNumber(rs.getLong("CONTACT_NUMBER"));
                greenFacilityInchargeInfo.getFacilityGreenTeamInfo().setFirstName(rs.getString("FIRST_NAME"));
                greenFacilityInchargeInfo.getFacilityGreenTeamInfo().setLastName( rs.getString("LAST_NAME"));
                greenFacilityInchargeInfo.getFacilityGreenTeamInfo().setDesignation( rs.getString("DESIGNATION"));
                greenFacilityInchargeInfo.getFacilityGreenTeamInfo().setEmail( rs.getString("EMAIL_ADDRESS"));
                greenFacilityInchargeInfoList.add(greenFacilityInchargeInfo);
            }
            rs.close();
            stmt.close();
            closeConnection(c);
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        return greenFacilityInchargeInfoList;

    }

    public boolean updateGreenFacilityInchargeInfo(GreenFacilityInchargeInfo teamInfo, int operationType) {
        return false;
    }
}

