/*
 * This Package is used for linking dao and model
 */
package com.ideas2it.employee.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.ideas2it.employee.model.Employee;

/**
 * This class is used for sent input to EmployeeServiceImpl 
 * @version 27/2/21
 * @author  Sathishkumar M
 */
public interface EmployeeService {
    public int createEmployee(String name, String dob, String joinYear, 
        long salary, long phoneNumber);
    public boolean updateName(String name, Integer employeeId);
    public boolean updateDob(String dob, Integer employeeId);
    public boolean updateJoinYear(String joinYear, Integer employeeId);
    public boolean updateSalary(long salary, Integer employeeId);    
    public boolean updatePhoneNumber(long phoneNumber, Integer employeeId);
    public boolean deleteEmployee(Integer employeeId);
    public Employee retrieveEmployee(Integer employeeId);   
}