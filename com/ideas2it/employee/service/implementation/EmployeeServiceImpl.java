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
    Employee employee = new Employee();

    public int createEmployee(String name, Date dob, Date joinYear, 
        long salary, long phoneNumber) {
        return employeeDao.createEmployee(name, dob,
                joinYear, salary, phoneNumber);
    }
   
    public boolean updateName(String name, Integer employeeId) {
        employee = employeeDao.retrieveEmployee(employeeId);
        employee.setName(name);
        return employeeDao.updateName(employee, employeeId);
    }

    public boolean updateDob(Date dob, Integer employeeId) {
        employee = employeeDao.retrieveEmployee(employeeId);
        employee.setDob(dob);
        return employeeDao.updateDob(employee, employeeId);
    }

    public boolean updateJoinYear(Date joinYear, Integer employeeId) {
        employee = employeeDao.retrieveEmployee(employeeId);
        employee.setJoinYear(joinYear);
        return employeeDao.updateJoinYear(employee, employeeId);
    }

    public boolean updateSalary(long salary, Integer employeeId) {
        employee = employeeDao.retrieveEmployee(employeeId);
        employee.setSalary(salary);
        return employeeDao.updateSalary(employee, employeeId);
    }

    public boolean updatePhoneNumber(long phoneNumber, Integer employeeId) {
        employee = employeeDao.retrieveEmployee(employeeId);
        employee.setPhoneNumber(phoneNumber);
        return employeeDao.updatePhoneNumber(employee, employeeId);
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