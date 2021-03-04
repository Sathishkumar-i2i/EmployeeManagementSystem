/*
 * This Package is used for linking dao and model
 */
package com.ideas2it.employee.service;

import java.sql.Date;
import java.util.List;

import com.ideas2it.employee.model.Address;
import com.ideas2it.employee.model.Employee;

/**
 * This class is used for sent input to EmployeeServiceImpl 
 * @version 27/2/21
 * @author  Sathishkumar M
 */
public interface EmployeeService {

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
    public int createEmployee(String name, Date dob, Date joinYear, 
        long salary, long phoneNumber);

    public boolean createAddress(int employeeId, String doorNo, String streetName, 
        String localArea, String district, String state, int pinCode);
 
    /**
     * This method is use for sending updateName to Employee
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param name
     *        Name is used for update employee name
     * @return true or false
     */
    public boolean updateName(String name, Integer employeeId);

  
    /**
     * This method is use for sending updateDob to Employee
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param dob
     *        dob is used for update employee dob
     * @return true or false
     */    
    public boolean updateDob(Date dob, Integer employeeId);

    /**
     * This method is use for sending updateJoinYear to Employee
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param joinYear
     *        joinYear is used for update employee joinYear 
     * @return true or false
     */
    public boolean updateJoinYear(Date joinYear, Integer employeeId);

    /**
     * This method is use for sending updateSalary to Employee
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param salary 
     *        salary is used for update employee salary
     * @return true or false
     */
    public boolean updateSalary(long salary, Integer employeeId);    

    /**
     * This method is use for sending updatePhoneNumber to Employee
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param phoneNumber
     *         phoneNumber is used for update employee Phonenumber
     * @return true or false
     */
    public boolean updatePhoneNumber(long phoneNumber, Integer employeeId);

    /**
     * This Method is used for Delect Employee Details
     * based on EmployeeId
     * @param employeeId
     *        EmployeeId is used for getting details
     * @return true or false
     */
    public boolean deleteEmployee(Integer employeeId);
    public boolean deleteAddress(Integer employeeId);
    /**
     * This Method is used for display Employee Details
     * based on EmployeeId
     * @param employeeId
     *        EmployeeId is used for getting details
     * @return Employee
     *         Employee get Employee Details 
     */
    public Employee retrieveEmployee(Integer employeeId);
   
    public Address retrieveAddress(Integer employeeId);
    
    /**
     * This Method is used for display All Employee Details
     * @return Employee
     *         <List>Employee get All Employee Details 
     */
    public List<Employee> getAllRecords();   
}