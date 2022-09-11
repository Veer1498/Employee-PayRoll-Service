package com.employeepayroll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.employeepayroll.EmployeePayrollService.IOService.FILE_IO;

/**
 * Purpose : To Read Data, Write Data and Perform Operations and Store Data in a file and Count Entries
 * Author : Veer
 */
//Service Test Class
public class EmployeePayrollServiceTest {
    // Test Method to Check Number of Entries equals to Entries Entered.
    @Test
    public void given3inputsShouldMatchCountEntries(){
        EmployeePayrollData[] arrayOfEmployees = {
                new EmployeePayrollData(1,"Veer",10000),
                new EmployeePayrollData(2,"Priya",20000),
                new EmployeePayrollData(3,"Hitesh",25000)
        };

        EmployeePayrollService employeeService = new EmployeePayrollService(Arrays.asList(arrayOfEmployees));
        employeeService.writeEmployeeData(FILE_IO);
        employeeService.printEmployeeData(FILE_IO);
        long entries = employeeService.countEntries(FILE_IO);
        System.out.println("Entries : "+entries);
        Assertions.assertEquals(3,entries);
    }
}
