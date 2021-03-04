/*
 * This Package is used for linking service and model
 */
package com.ideas2it.employee.dao;

import java.sql.Date;
import java.util.List;
import java.util.ArrayList;

import com.ideas2it.employee.model.Address;
import com.ideas2it.employee.model.Employee;

/**
 * This class is used for sent input to Employee 
 * @version 01/3/21
 * @author  Sathishkumar M
 */
public interface EmployeeDao {

    /**
     * This Method is used for send created employee details and 
     * stored in data in database
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
     * This method is use for sending updatename in database
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param name
     *        Name is used for update employee name
     * @return true or false
     */
    public boolean updateName(Employee employee, Integer employeeId);

    /**
     * This method is use for sending updateDob in database
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param dob
     *        dob is used for update employee dob
     * @return true or false
     */
    public boolean updateDob(Employee employee, Integer employeeId);

    /**
     * This method is use for sending updatejoinYear in database
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param joinyear
     *        joinYear is used for update employee joinYear
     * @return true or false
     */
    public boolean updateJoinYear(Employee employee, Integer employeeId);

    /**
     * This method is use for sending updateSalary in database
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param salary
     *        salary is used for update employee salary
     * @return true or false
     */
    public boolean updateSalary(Employee employee, Integer employeeId);    

    /**
     * This method is use for sending updatePhoneNumber in database
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param phoneNumber
     *        phoneNumber is used for update employee phoneNumber
     * @return true or false
     */
    public boolean updatePhoneNumber(Employee employee, Integer employeeId);

    /**
     * This method is use for sending DeleteEmployee in database
     * @param employeeId
     *        EmployeeId is used for getting details
     * @return true or false
     */
    public boolean deleteEmployee(Integer employeeId);

    public boolean deleteAddress(Integer employeeId);

    /**
     * This method is use for sending retrieveEmployeein database
     * @param employeeId
     *        EmployeeId is used for getting details
     * @return Employee
     *         It return Employee details
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