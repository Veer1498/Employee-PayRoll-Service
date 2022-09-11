package com.employeepayroll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.employeepayroll.EmployeePayrollService.IOService.FILE_IO;

public class EmployeePayrollServiceTest {
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
