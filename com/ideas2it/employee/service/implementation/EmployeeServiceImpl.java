/*
 * This Package is used for linking dao and model
 */
package com.ideas2it.employee.service.implementation;

import java.sql.Date;
import java.util.List; 

import com.ideas2it.employee.model.Employee;
import com.ideas2it.employee.service.EmployeeService;
import com.ideas2it.employee.dao.implementation.EmployeeDaoImpl;
import com.ideas2it.employee.dao.EmployeeDao;

/**
 * This class is used for sent data to EmployeeDao 
 * @version 01/3/21
 * @author  Sathishkumar M
 */
public class EmployeeServiceImpl implements EmployeeService {
    EmployeeDao employeeDao = new EmployeeDaoImpl();

    public int createEmployee(String name, Date dob, Date joinYear, 
        long salary, long phoneNumber) {
        return employeeDao.createEmployee(name, dob,
                joinYear, salary, phoneNumber);
    }
   
    public boolean updateName(String name, Integer employeeId) {
        return employeeDao.updateName(name, employeeId);
    }

    public boolean updateDob(Date dob, Integer employeeId) {
        return employeeDao.updateDob(dob, employeeId);
    }

    public boolean updateJoinYear(Date joinYear, Integer employeeId) {
        return employeeDao.updateJoinYear(joinYear, employeeId);
    }

    public boolean updateSalary(long salary, Integer employeeId) {
        return employeeDao.updateSalary(salary, employeeId);
    }

    public boolean updatePhoneNumber(long phoneNumber, Integer employeeId) {
        return employeeDao.updatePhoneNumber(phoneNumber, employeeId);
    }

    public boolean deleteEmployee(Integer employeeId) {
        return employeeDao.deleteEmployee(employeeId);
    }    
    
    public Employee retrieveEmployee(Integer employeeId) {
        return employeeDao.retrieveEmployee(employeeId);
    }
   
    public List<Employee> getAllRecords() {
        return employeeDao.getAllRecords();
    }
}