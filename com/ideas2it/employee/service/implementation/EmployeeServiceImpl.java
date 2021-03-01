/*
 * This Package is used for linking dao and model
 */
package com.ideas2it.employee.service.implementation;

import java.sql.Date; 

import com.ideas2it.employee.model.Employee;
import com.ideas2it.employee.service.EmployeeService;
import com.ideas2it.employee.dao.implementation.EmployeeDaoImpl;

/**
 * This class is used for sent data to EmployeeDao 
 * @version 27/2/21
 * @author  Sathishkumar M
 */
public class EmployeeServiceImpl implements EmployeeService {
    EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();

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
        long salary, long phoneNumber) {
        return employeeDao.createEmployee(name, dob,
                joinYear, salary, phoneNumber);
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
    public boolean updateDob(Date dob, Integer employeeId) {
        return employeeDao.updateDob(dob, employeeId);
    }

    /**
     * This method is use for sending updateJoinYear to Employee
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param joinYear
     *        joinYear is used for update employee joinYear 
     * @return true or false
     */
    public boolean updateJoinYear(Date joinYear, Integer employeeId) {
        return employeeDao.updateJoinYear(joinYear, employeeId);
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
        return employeeDao.updateSalary(salary, employeeId);
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