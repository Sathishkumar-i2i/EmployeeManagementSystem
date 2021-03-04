/*
 * This package is used for controll the flow of input
 */
package com.ideas2it.employee.controller;
 
import java.sql.Date;
import java.util.List;

import com.ideas2it.employee.model.Address;
import com.ideas2it.employee.model.Employee;
import com.ideas2it.employee.service.implementation.EmployeeServiceImpl;

/**
 * This class is used for control the flow of data to service.
 * @version 01/3/21
 * @author  Sathishkumar M
 */
public class EmployeeController {   
    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
   
    /**
     * This method is used for sending details to service;
     * @param name
     *        Represent Employee Name
     * @param dob
     *        Represent Employee Data of Birth
     * @param joinYear
     *        Represent Employee Join Year in Company
     * @param salary
     *        Represent Employee Salary
     * @param phoneNumber
     *        Represent Employee personal PhoneNumber
     * @return true or false
     */
    public int createEmployee(String name, Date dob, Date joinYear, 
        long salary, long phoneNumber) {
        return employeeService.createEmployee(name, dob, joinYear, salary, phoneNumber);
    }

    public boolean createAddress(int employeeId, String doorNo, String streetName, 
        String localArea, String district, String state, int pinCode) { 
        return employeeService.createAddress(employeeId, doorNo, streetName, 
            localArea, district, state, pinCode); 
    }
    
    /**
     * This method is use for sending updatename to sevice
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param name
     *        Name is used for update employee name
     * @return true or false
     */
    public boolean updateName(String name, Integer employeeId) {
        return employeeService.updateName(name, employeeId);
    }

    /**
     * This method is use for sending updateDob to sevice
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param dob
     *        dob is used for update employee dob
     * @return true or false
     */
    public boolean updateDob(Date dob, Integer employeeId) {
        return employeeService.updateDob(dob, employeeId);
    }

    /**
     * This method is use for sending updatejoinYear to sevice
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param joinyear
     *        joinYear is used for update employee joinYear
     * @return true or false
     */
    public boolean updateJoinYear(Date joinYear, Integer employeeId) {
        return employeeService.updateJoinYear(joinYear, employeeId);
    }

    /**
     * This method is use for sending updateSalary to sevice
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param salary
     *        salary is used for update employee salary
     * @return true or false
     */
    public boolean updateSalary(long salary, Integer employeeId) {
        return employeeService.updateSalary(salary, employeeId);
    }

    /**
     * This method is use for sending updatePhoneNumber to sevice
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param phoneNumber
     *        phoneNumber is used for update employee phoneNumber
     * @return true or false
     */
    public boolean updatePhoneNumber(long phoneNumber, Integer employeeId) {
        return employeeService.updatePhoneNumber(phoneNumber, employeeId);
    }


    /**
     * This method is use for sending DeleteEmployee to sevice
     * @param employeeId
     *        EmployeeId is used for getting details
     * @return true or false
     */
    public boolean deleteEmployee(Integer employeeId) {
        return employeeService.deleteEmployee(employeeId);
    }
   
    public boolean deleteAddress(Integer employeeId) {
        return employeeService.deleteAddress(employeeId);
    }
    /**
     * This method is use for sending displayEmployee to sevice
     * @param employeeId
     *        EmployeeId is used for getting details
     * @return Employee
     *         It return Employee details
     */
    public Employee retrieveEmployee(Integer employeeId) {
       return  employeeService.retrieveEmployee(employeeId);
    }

    public Address retrieveAddress(Integer employeeId) {
       return  employeeService.retrieveAddress(employeeId);
    }

    /**
     * This method is used to get all Employee Records in Database
     */
    public List<Employee> getAllRecords() {
        return employeeService.getAllRecords();
    }
}