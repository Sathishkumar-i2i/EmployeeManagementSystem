/*
 * This Package is used for linking service and model
 */
package com.ideas2it.employee.dao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.ideas2it.employee.model.Employee;
import com.ideas2it.employee.service.implementation.EmployeeServiceImpl;

/**
 * This class is used for sent input to Employee 
 * @version 27/2/21
 * @author  Sathishkumar M
 */
public interface EmployeeDao {
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