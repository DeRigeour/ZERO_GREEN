package com.green.model;

/**
 * Created by kirupakart on 23-04-2017.
 */
public class FacilityGreenTeamInfo {

   private  int id;
   private  long  contactNumber;
   private  String firstName ;
   private  String lastName;
   private  String designation;
   private  String email;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
