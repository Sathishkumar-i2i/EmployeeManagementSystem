/*
 * This package is used to connect dasabase
 */ 
package com.ideas2it.employee.dao.implementation;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import java.lang.*;

import com.ideas2it.employee.dao.EmployeeDao; 
import com.ideas2it.employee.model.Employee;

/**
 * This class is used for connecting database of mysql
 * @version 27/2/21
 * @author  Sathishkumar M
 */
public class EmployeeDaoImpl implements EmployeeDao {

    /**
     * This method is used for connecting database using
     * url of database, username and password
     * @return connection
     */
    public static Connection getConnection() {  
        Connection connection = null;  
        try {  
            Class.forName("com.mysql.jdbc.Driver");  
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb",
                "root", "sathish@99");  
        } catch(Exception e) {
            System.out.println(e);
        }  
            return connection;  
    }

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
        long salary, long phoneNumber) { 
        try {  
            Connection connection = getConnection();  
            PreparedStatement preparedStatement = connection.prepareStatement(  
                "insert into employeedetails(name, dob, joinYear, salary, phoneNumber) values(?, ?, ?, ?, ?)");  
            preparedStatement.setString(2, name);  
            preparedStatement.setDate(3, dob);  
            preparedStatement.setDate(4, joinYear);  
            preparedStatement.setLong(5, salary);  
            preparedStatement.setLong(6, phoneNumber);  
            preparedStatement.executeUpdate();
            return 1; 
            connection.close(); 
        } catch(Exception e) {
            return 0;
        }  
    }

    /**
     * This method is use for sending updatename in database
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param name
     *        Name is used for update employee name
     * @return true or false
     */
    public boolean updateName(String name, Integer employeeId) {
        try {  
            Connection connection = getConnection();  
            PreparedStatement preparedStatement = connection.prepareStatement(  
                "update from employeedetails where id = employeeId");  
            preparedStatement.setString(2, name);    
            preparedStatement.executeUpdate();
            return true;
            connection.close();  
        } catch(Exception e) {
            return false;
        } 

    }

    /**
     * This method is use for sending updateDob in database
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param dob
     *        dob is used for update employee dob
     * @return true or false
     */
    public boolean updateDob(Date dob, Integer employeeId) {
        try {  
            Connection connection = getConnection();  
            PreparedStatement preparedStatement = connection.prepareStatement(  
                "update from employeedetails where id = employeeId");  
            preparedStatement.setDate(3, dob);    
            preparedStatement.executeUpdate();
            return true;
            connection.close();  
        } catch(Exception e) {
            return false;
        }

    }

    /**
     * This method is use for sending updatejoinYear in database
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param joinyear
     *        joinYear is used for update employee joinYear
     * @return true or false
     */
    public boolean updateJoinYear(Date joinYear, Integer employeeId) {
        try {  
            Connection connection = getConnection();  
            PreparedStatement preparedStatement = connection.prepareStatement(  
                "update from employeedetails where id = employeeId");  
            preparedStatement.setDate(4, joinYear);    
            preparedStatement.executeUpdate();
            return true;
            connection.close();  
        } catch(Exception e) {
            return false;
        }  
    }
  
    /**
     * This method is use for sending updateSalary in database
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param salary
     *        salary is used for update employee salary
     * @return true or false
     */
    public boolean updateSalary(long salary, Integer employeeId) {
        try {  
            Connection connection = getConnection();  
            PreparedStatement preparedStatement = connection.prepareStatement(  
                "update from employeedetails where id = employeeId");  
            preparedStatement.setLong(5, salary);    
            preparedStatement.executeUpdate();
            return true;
            connection.close();  
        } catch(Exception e) {
            return false;
        } 
    }
 
    /**
     * This method is use for sending updatePhoneNumber in database
     * @param employeeId
     *        EmployeeId is used for getting details
     * @param phoneNumber
     *        phoneNumber is used for update employee phoneNumber
     * @return true or false
     */    
    public boolean updatePhoneNumber(long phoneNumber, Integer employeeId) {
        try{  
            Connection connection = getConnection();  
            PreparedStatement preparedStatement = connection.prepareStatement(  
                "update from employeedetails where id = employeeId");  
            preparedStatement.setLong(6, phoneNumber);    
            status = preparedStatement.executeUpdate();
            return true; 
            connection.close(); 
        } catch(Exception e) {
            return false;
        }
    }

    /**
     * This method is use for sending DeleteEmployee in database
     * @param employeeId
     *        EmployeeId is used for getting details
     * @return true or false
     */
    public boolean deleteEmployee(Integer employeeId) {
        Integer intobject = new Integer(employeeId);
        int employeeid = intobject.intValue();
        try {  
            Connection connection = getConnection();  
            PreparedStatement preparedStatement = connection.prepareStatement(  
                "delete from employeedetails where id = ?");  
            preparedStatement.setString(1, employeeid);    
            preparedStatement.executeUpdate();
            return true;
            connection.close();  
        } catch(Exception e) {
            return false;
        }
    }

    /**
     * This method is use for sending retrieveEmployeein database
     * @param employeeId
     *        EmployeeId is used for getting details
     * @return Employee
     *         It return Employee details
     */
    public Employee retrieveEmployee(Integer employeeId) {
        Employee employee = null;  
        try {  
            Connection connection = getConnection();  
            PreparedStatement preparedStatement = connection.prepareStatement
                ("select * from employeedetails where id = employeeId");  
            preparedStatement.setInt(1, employeeId);  
            ResultSet resultSet = preparedStatement.executeQuery();  
            while(resultSet.next()) {  
                employee = new Employee();    
                employee.setName(resultSet.getString("name"));  
                employee.setDob(resultSet.getData("dob"));  
                employee.setJoinYear(resultSet.getData("joinYear"));  
                employee.setSalary(resultSet.getLong("salary"));  
                employee.setPhoneNumber(resultSet.getLong("phoneNumber"));  
            }  
            return employee;
            connection.close();
        } catch(Exception e) {
            return employee;
        }     
    }
}