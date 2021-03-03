/*
 * This package is used to connect dasabase
 */ 
package com.ideas2it.employee.dao.implementation;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;


import com.ideas2it.employee.dao.EmployeeDao; 
import com.ideas2it.employee.model.Employee;

/**
 * This class is used for connecting database of mysql
 * @version 01/3/21
 * @author  Sathishkumar M
 */
public class EmployeeDaoImpl implements EmployeeDao {

    /**
     * This method is used for connecting database using
     * url of database, username and password
     * @return connection
     */
    public Connection getConnection() {  
        Connection connection = null;  
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb",
                "root", "sathish@99");
        } catch(Exception e) {
            System.out.println(e);
        }  
        return connection;  
    }

    public int createEmployee(String name, Date dob, Date joinYear, 
        long salary, long phoneNumber) { 
        try {  
            Connection connection = this.getConnection();  
            PreparedStatement preparedStatement = connection.prepareStatement(  
                "insert into employeedetails (name, dob, joinYear, salary, phoneNumber) "
                 + "values(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, name);  
            preparedStatement.setDate(2, dob);  
            preparedStatement.setDate(3, joinYear);  
            preparedStatement.setLong(4, salary);  
            preparedStatement.setLong(5, phoneNumber);  
            if (0 != preparedStatement.executeUpdate()) {    
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                    if (resultSet.next()) {
                        return resultSet.getInt(1);
                    } 
	        } 
        } catch(Exception e) {
            System.out.println(e);
        }
        return 0;  
    }

   public boolean updateName(Employee employee, Integer employeeId) {
        try {  
            Connection connection = this.getConnection();  
            PreparedStatement preparedStatement = connection.prepareStatement(  
                "update employeedetails set name = ?, dob = ?, joinYear = ?, salary = ?, phoneNumber = ? where id = ?");  
            preparedStatement.setString(1, employee.getName());  
            preparedStatement.setDate(2, employee.getDob());  
            preparedStatement.setDate(3, employee.getJoinYear());  
            preparedStatement.setLong(4, employee.getSalary());  
            preparedStatement.setLong(5, employee.getPhoneNumber());
            preparedStatement.setInt(6, employeeId);    
            preparedStatement.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
        return true; 
    }

    public boolean updateDob(Employee employee, Integer employeeId) {
        try {  
            Connection connection = this.getConnection();  
            PreparedStatement preparedStatement = connection.prepareStatement(  
                "update employeedetails set name = ?, dob = ?, joinYear = ?, salary = ?, phoneNumber = ? where id = ?");  
            preparedStatement.setString(1, employee.getName());  
            preparedStatement.setDate(2, employee.getDob());  
            preparedStatement.setDate(3, employee.getJoinYear());  
            preparedStatement.setLong(4, employee.getSalary());  
            preparedStatement.setLong(5, employee.getPhoneNumber());
            preparedStatement.setInt(6, employeeId);     
            preparedStatement.executeUpdate(); 
        } catch(Exception e) {
            System.out.println(e);
        }
        return true;
    }

    public boolean updateJoinYear(Employee employee, Integer employeeId) {
        try {  
            Connection connection = this.getConnection();  
            PreparedStatement preparedStatement = connection.prepareStatement(  
                "update employeedetails set name = ?, dob = ?, joinYear = ?, salary = ?, phoneNumber = ? where id = ?");  
            preparedStatement.setString(1, employee.getName());  
            preparedStatement.setDate(2, employee.getDob());  
            preparedStatement.setDate(3, employee.getJoinYear());  
            preparedStatement.setLong(4, employee.getSalary());  
            preparedStatement.setLong(5, employee.getPhoneNumber());
            preparedStatement.setInt(6, employeeId);     
            preparedStatement.executeUpdate(); 
        } catch(Exception e) {
            System.out.println(e);
        }
        return true;  
    }
  
    public boolean updateSalary(Employee employee, Integer employeeId) {
        try {  
            Connection connection = this.getConnection();  
            PreparedStatement preparedStatement = connection.prepareStatement(  
                "update employeedetails set name = ?, dob = ?, joinYear = ?, salary = ?, phoneNumber = ? where id = ?");  
            preparedStatement.setString(1, employee.getName());  
            preparedStatement.setDate(2, employee.getDob());  
            preparedStatement.setDate(3, employee.getJoinYear());  
            preparedStatement.setLong(4, employee.getSalary());  
            preparedStatement.setLong(5, employee.getPhoneNumber());
            preparedStatement.setInt(6, employeeId);     
            preparedStatement.executeUpdate(); 
        } catch(Exception e) {
            System.out.println(e);
        }
        return true; 
    }
     
    public boolean updatePhoneNumber(Employee employee, Integer employeeId) {
        try{  
            Connection connection = this.getConnection();  
            PreparedStatement preparedStatement = connection.prepareStatement(  
                "update employeedetails set name = ?, dob = ?, joinYear = ?, salary = ?, phoneNumber = ? where id = ?");  
            preparedStatement.setString(1, employee.getName());  
            preparedStatement.setDate(2, employee.getDob());  
            preparedStatement.setDate(3, employee.getJoinYear());  
            preparedStatement.setLong(4, employee.getSalary());  
            preparedStatement.setLong(5, employee.getPhoneNumber());
            preparedStatement.setInt(6, employeeId);    
            preparedStatement.executeUpdate(); 
        } catch(Exception e) {
            System.out.println(e);
        }
        return true;
    }

    public boolean deleteEmployee(Integer employeeId) {
        try {  
            Connection connection = this.getConnection();  
            PreparedStatement preparedStatement = connection.prepareStatement(  
                "delete from employeedetails where id = ?");  
            preparedStatement.setInt(1, employeeId);    
            preparedStatement.executeUpdate();  
        } catch(Exception e) {
            System.out.println(e);
        }
        return true;
    }

    public Employee retrieveEmployee(Integer employeeId) {
        Employee employee = null;  
        try {  
            Connection connection = this.getConnection();  
            PreparedStatement preparedStatement = connection.prepareStatement
                ("select * FROM employeedetails where id = " + employeeId);    
            ResultSet resultSet = preparedStatement.executeQuery();  
            if(resultSet.next()) {  
                employee = new Employee();
                employee.setId(resultSet.getInt("id"));    
                employee.setName(resultSet.getString("name"));  
                employee.setDob(resultSet.getDate("dob"));  
                employee.setJoinYear(resultSet.getDate("joinYear"));  
                employee.setSalary(resultSet.getLong("salary"));  
                employee.setPhoneNumber(resultSet.getLong("phoneNumber"));  
            }  
        } catch(Exception e) {
            System.out.println(e);
        }
        return employee;    
    }

    public List<Employee> getAllRecords() {  
    List<Employee> employeeList = new ArrayList<Employee>();
    Employee employee = null;    
    try{  
        Connection connection = this.getConnection();  
        PreparedStatement preparedStatement = connection.prepareStatement
            ("select * from employeedetails");  
        ResultSet resultSet = preparedStatement.executeQuery();  
        while(resultSet.next()){  
            employee = new Employee();
            employee.setId(resultSet.getInt("id"));   
            employee.setName(resultSet.getString("name"));  
            employee.setDob(resultSet.getDate("dob"));  
            employee.setJoinYear(resultSet.getDate("joinYear"));  
            employee.setSalary(resultSet.getLong("salary"));  
            employee.setPhoneNumber(resultSet.getLong("phoneNumber"));  
            employeeList.add(employee);  
        }  
    } catch(Exception e) { 
        System.out.println(e);
    }  
    return employeeList;  
    }
}