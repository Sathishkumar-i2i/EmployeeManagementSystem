package com.ideas2it.employee.model;

/**
 * This class is used for stored Address details for Employee
 * @version 04/3/21
 * @author  Sathishkumar M
 */
public class Address {
    private int id;
    private String doorNo;
    private String streetName;
    private String localArea;
    private String district;
    private String state;
    private int pinCode;
   
    public int getId() {
        return id;        
    }

    public String getDoorNo() {
        return doorNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getLocalArea() {
        return localArea;
    }

    public String getDistrict() {
        return district;
    }

    public String getState() {
        return state;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setId(int id) {
        this.id = id;        
    }
    
    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public void setStreetName(String StreetName) {
        this.streetName = streetName;
    }

    public void setLocalArea(String localArea) {
        this.localArea = localArea;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}