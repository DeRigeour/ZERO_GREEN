package com.green.model;

import java.util.Date;

/**
 * Created by kirupakart on 23-04-2017.
 */
public class AuditMemberInfo {

    private String completeName ;
    private Date   verifiedDate;
    //contact id
    private int id;

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public Date getVerifiedDate() {
        return verifiedDate;
    }

    public void setVerifiedDate(Date verifiedDate) {
        this.verifiedDate = verifiedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
