/*
 * This Package is used for linking service and model
 */
package com.ideas2it.employee.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.ideas2it.employee.model.Employee;

/**
 * This class is used for sent input to Employee 
 * @version 23/2/21
 * @author  Sathishkumar M
 */
public class EmployeeService {
    Map<Integer, Employee> employees = new HashMap<Integer, Employee>();
    Integer employeeId = 1;

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
        Employee newEmployee = new Employee(name, 
                new SimpleDateFormat("dd/MM/yyyy").parse(dob),
                new SimpleDateFormat("dd/MM/yyyy").parse(joinYear),
                salary, phoneNumber);
        if (null != employees.put(employeeId, newEmployee)) {
            ++employeeId;
            return 1;
        } else {
            return 0;
        }
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
        Employee employee = employees.get(employeeId);
        if (null != employee) {
            employee.setName(name);
            return true;
        } else {
            return false;        
        }           
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
        Employee employee = employees.get(employeeId);
        if (null != employee) {
            employee.setDob(new SimpleDateFormat("dd/MM/yyyy").parse(dob));
            return true;        
        } else {
            return false;        
        }        
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
        Employee employee = employees.get(employeeId);
        if (null != employee) {
            employee.setJoinYear(new SimpleDateFormat("dd/MM/yyyy").
                    parse(joinYear));
            return true;        
        } else {
            return false;        
        }        
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
        Employee employee = employees.get(employeeId);
        if (null != employee) {
            employee.setSalary(salary);
            return true;
        } else {
            return false;
        }        
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
        Employee employee = employees.get(employeeId);
        if (null != employee) {
            employee.setPhoneNumber(phoneNumber);
            return true;        
        } else {
            return false;   
        }        
    }
     

    /**
     * This Method is used for Delect Employee Details
     * based on EmployeeId
     * @param employeeId
     *        EmployeeId is used for getting details
     * @return true or false
     */
    public boolean deleteEmployee(Integer employeeId) {
        return (null == employees.remove(employeeId)) ? true : false;
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
        return employees.get(employeeId);
    }
}