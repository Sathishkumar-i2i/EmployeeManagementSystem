/*
 * This Package is used for linking dao and model
 */
package com.ideas2it.employee.service;

import java.sql.Date;

import com.ideas2it.employee.model.Employee;

/**
 * This class is used for sent input to EmployeeServiceImpl 
 * @version 27/2/21
 * @author  Sathishkumar M
 */
public interface EmployeeService {
    public int createEmployee(String name, Date dob, Date joinYear, 
        long salary, long phoneNumber);
    public boolean updateName(String name, Integer employeeId);
    public boolean updateDob(Date dob, Integer employeeId);
    public boolean updateJoinYear(Date joinYear, Integer employeeId);
    public boolean updateSalary(long salary, Integer employeeId);    
    public boolean updatePhoneNumber(long phoneNumber, Integer employeeId);
    public boolean deleteEmployee(Integer employeeId);
    public Employee retrieveEmployee(Integer employeeId);   
}