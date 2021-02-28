/*
 * This Package is used for linking dao and model
 */
package com.ideas2it.employee.service.implementation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date; 

import com.ideas2it.employee.model.Employee;
import com.ideas2it.employee.service.EmployeeService;

/**
 * This class is used for sent data to EmployeeDao 
 * @version 27/2/21
 * @author  Sathishkumar M
 */
public class EmployeeServiceImpl implements EmployeeService {
    EmployeeDao employeeDao = new EmployeeDao();

    /**
     * This Method is used for send created employee details to modal
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
        return employeeDao.createEmployee(name, new SimpleDateFormat("dd/MM/yyyy").parse(dob),
                new SimpleDateFormat("dd/MM/yyyy").parse(joinYear), salary, phoneNumber);
    }
   
    /**
     * This method is use for sending updateName to Employee
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param name
     *        Name is used for update employee name
     * @return true or false
     */
    public boolean updateName(String name, Integer employeeId) {
        return employeeDao.updateName(name, employeeId);
    }

    /**
     * This method is use for sending updateDob to Employee
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param dob
     *        dob is used for update employee dob
     * @return true or false
     */
    public boolean updateDob(String dob, Integer employeeId)
            throws ParseException {
        return employeeDao.updateDob(new SimpleDateFormat("dd/MM/yyyy").parse(dob),
                 employeeId);
    }

    /**
     * This method is use for sending updateJoinYear to Employee
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param joinYear
     *        joinYear is used for update employee joinYear 
     * @return true or false
     */
    public boolean updateJoinYear(String joinYear, Integer employeeId) 
            throws ParseException {
        return employeeDao.updateJoinYear(new SimpleDateFormat("dd/MM/yyyy").
                parse(joinYear), employeeId);
    }

    /**
     * This method is use for sending updateSalary to Employee
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
     * This method is use for sending updatePhoneNumber to Employee
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param phoneNumber
     *         phoneNumber is used for update employee Phonenumber
     * @return true or false
     */
    public boolean updatePhoneNumber(long phoneNumber, Integer employeeId) {
        return employeeDao.updatePhoneNumber(phoneNumber, employeeId);
    }

    /**
     * This Method is used for Delect Employee Details
     * based on EmployeeId
     * @param employeeId
     *        EmployeeId is used for getting details
     * @return true or false
     */
    public boolean deleteEmployee(Integer employeeId) {
        return employeeDao.deleteEmployee(employeeId);
    }     
    
    /**
     * This Method is used for display Employee Details
     * based on EmployeeId
     * @param employeeId
     *        EmployeeId is used for getting details
     * @return Employee
     *         Employee get Employee Details 
     */
    public Employee retrieveEmployee(Integer employeeId) {
       return  employeeDao.retrieveEmployee(employeeId);
    }
}