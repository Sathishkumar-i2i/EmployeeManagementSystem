/*
 * This package is used for controll the flow of input
 */
package com.ideas2it.employee.controller;
 
import java.text.ParseException;
import java.util.Date;

import com.ideas2it.employee.model.Employee;
import com.ideas2it.employee.service.EmployeeService;

/**
 * This class is used for control the flow of data to service.
 * @version 23/2/21
 * @author  Sathishkumar M
 */
public class EmployeeController {   
    EmployeeService employeeService = new EmployeeService();
   
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
    public int createEmployee(String name, String dob, String joinYear, 
        long salary, long phoneNumber) throws ParseException {
        return employeeService.createEmployee(name, dob, joinYear, salary, phoneNumber);
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
    public boolean updateDob(String dob, Integer employeeId)
            throws ParseException {
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
    public boolean updateJoinYear(String joinYear, Integer employeeId) 
            throws ParseException {
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
}