/*
 * This Package is used for getting inputs from users
 * Like create, delete, update and display
 */
package com.ideas2it.employee.view;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ideas2it.employee.controller.EmployeeController;
import com.ideas2it.employee.model.Employee; 

/**
 * This class is used for getting input from user
 * Like create, delete, update and display
 * @version 01/3/21
 * @author  Sathishkumar M
 */
public class EmployeeView {
    EmployeeController employeeController = new EmployeeController();
    Scanner scanner = new Scanner(System.in);

    /**
     * This method is used for select purpose 
     * we can choose create, delete, update and display.
     */
    public void userSelection() {
        int userChoice = 1;
        String options = "\n\n Give input as Like \n 1 For Create" 
                         + "\n 2 For Update \n 3 For Delete" 
                         + "\n 4 For Display \n 5 For All Employee Details"
                         + "\n 6 For Completed"; 
        while(6 != userChoice) {
            System.out.println(options);
            userChoice = scanner.nextInt();
            switch(userChoice) {
                case 1:
                    System.out.println("Create Employee Details");
                    createEmployee();
                    break;
                case 2:
                    System.out.println("Update Employee Details");
                    updateEmployee();
                    break;
                case 3:
                    System.out.println("Delete Employee Details");
                    deleteEmployee();
                    break; 
                case 4:
                    System.out.println("Display Employee Details");
                    displayEmployeeDetail();
                    break;
                case 5:
                    System.out.println("Display All Employee Details");
                    getAllRecords();
                    break;
                case 6:
                    System.out.println("Completed");
                    break;
                default:
                    System.out.println("Given above mention input");
                    break;                       
            }
        }
    }

    /**
     * This method is used to get input from user for Create Employee Details
     */
    public void createEmployee() {
        System.out.println("Enter employee Name");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter employee Dob" 
                           + "\nExample(YYYY-MM-DD)");
        Date dob = Date.valueOf(scanner.nextLine());
        System.out.println("Enter employee JoinYear"
                           + "\nExample(YYYY-MM-DD)");
        Date joinYear = Date.valueOf(scanner.nextLine());
        System.out.println("Enter employee Salary");
        long salary = scanner.nextLong();
        System.out.println("Enter employee PhoneNumer");
        long phoneNumber = scanner.nextLong();
        if (1 == employeeController.createEmployee(name, dob, joinYear,
                salary, phoneNumber)) {
            System.out.println("New Employee Created Successfully");
        } else {
            System.out.println("Not New Employee Created Successfully");
        }    
    }

    /**
     * This method is used to get input from user for Update Employee Details
     */
    public void updateEmployee() {
        String options = "\n\n Give input as Like \n 1 For Name update" 
                         + "\n 2 For Date of Birth update \n 3 For JoinYear update" 
                         + "\n 4 For Salary update \n 5 For PhoneNumber update"
                         + "\n 6 For complete update function";
        int userOption = 1;
        System.out.println("Enter Employee Id");
        Integer employeeId = scanner.nextInt();
        while (6 != userOption) {
            System.out.println(options);
            userOption = scanner.nextInt();
            scanner.nextLine();
            switch(userOption) {
                case 1:
                    System.out.println("\nEnter the name: ");
                    String name = scanner.nextLine();
                    employeeController.updateName(name, employeeId);
                    break;
                case 2:
                    System.out.println("Enter the Dob: " 
                            + "\nExample(YYYY-MM-DD)");
                    Date dob = Date.valueOf(scanner.nextLine());
                    employeeController.updateDob(dob, employeeId);
                    break;
                case 3:
                    System.out.println("\nEnter the JoinYear: "
                            + "\nExample(YYYY-MM-DD)");
                    Date joinYear = Date.valueOf(scanner.nextLine());
                    employeeController.updateJoinYear(joinYear, employeeId);
                    break;
                case 4:   
                    System.out.println("\nEnter the salary: ");
                    long salary = scanner.nextLong();
                    employeeController.updateSalary(salary, employeeId);
                    break;
                case 5:
                    System.out.println("\nEnter the phone number: ");
                    long phoneNumber = scanner.nextLong();
                    employeeController.updatePhoneNumber(phoneNumber,
                            employeeId);
                    break;
                case 6:
                    System.out.println("Update Completed Successful");
                    break;
                default:
                    System.out.println("\nError: Invalid Input");
                    break;
            }
        }
    }

    /**
     * This method is used to get input from user for Delete Employee Details
     */  
    public void deleteEmployee() {
        if (employeeController.deleteEmployee(getEmployeeId())) {
            System.out.print("Delete Successfully");
        } else {
            System.out.print("Deletion failed");
        }
    }

    /**
     * This method is used to get input from user for Display Employee Details
     */
    public void displayEmployeeDetail() {
        Employee employeeDetail = employeeController.
                retrieveEmployee(getEmployeeId());
        if (null != employeeDetail) {
            System.out.println("Employee Name: " + employeeDetail.getName()
            + "\nEmployee Dob: " + employeeDetail.getDob()
            + "\nEmployee joinYear: " + employeeDetail.getJoinYear()
            + "\nEmployee Salary: " + employeeDetail.getSalary()
            + "\nEmployee PhoneNumber: " + employeeDetail.getPhoneNumber());
        } else {
            System.out.println("Not Valid EmployeeId");
        }
    }
  
    /**
     * This method is used to get all Employee Records in Database
     */  
    public void getAllRecords() {
        List<Employee> employeeAllDetails = employeeController.getAllRecords();
        for (Employee employee : employeeAllDetails) {
            System.out.println("Employee Name: " + employee.getName()
                + "\nEmployee Dob: " + employee.getDob()
                + "\nEmployee joinYear: " + employee.getJoinYear()
                + "\nEmployee Salary: " + employee.getSalary()
                + "\nEmployee PhoneNumber: " + employee.getPhoneNumber());
        }
    }

    /**
     * This method is used to get Employee Id from user
     */
    public Integer getEmployeeId() {
       System.out.println("Enter EmployeeId :");
       return scanner.nextInt();
    }
}
   

