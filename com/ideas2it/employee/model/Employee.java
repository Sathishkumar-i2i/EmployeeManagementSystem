package com.ideas2it.employee.model;

import java.sql.Date;

/**
 * This class is used for stored employee details
 * @version 27/2/21
 * @author  Sathishkumar M
 */
public class Employee {
    private int id;
    private String name;
    private Date dob;
    private Date joinYear;
    private long salary;
    private long phoneNumber;
   
    public int getId() {
        return id;        
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public Date getJoinYear() {
        return joinYear;
    }

    public long getSalary() {
        return salary;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(int id) {
        this.id = id;        
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setJoinYear(Date joinYear) {
        this.joinYear = joinYear;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}