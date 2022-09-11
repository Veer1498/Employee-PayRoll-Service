package com.employeepayroll;
/**
 *  Purpose : To Read Data, Write Data and Perform Operations and Store Data in a file and Count Entries
 *  Author : Veer
 */
public class EmployeeMain {
    /**
     * In Main Function,
     *Created EmployeePayrollService Object
     * Calling the Required Methods of that Class.
     * 1.For Reading Data
     * 2.For Writing Data
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Payroll Service Program");
        EmployeePayrollService employeeService = new EmployeePayrollService();
        employeeService.readEmployeeData();
        employeeService.writeEmployeeData();

    }
}
