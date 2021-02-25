package com.ideas2it.employee.model;

import java.util.Date;

/**
 * This class is used for stored employee details
 * @version 23/2/21
 * @author  Sathishkumar M
 */
public class Employee {
    private String name;
    private Date dob;
    private Date joinYear;
    private long salary;
    private long phoneNumber;
   
    public Employee(String name, Date dob, Date joinYear, long salary, long phoneNumber) {
        this.name = name;
        this.dob = dob;
        this.joinYear = joinYear;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
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