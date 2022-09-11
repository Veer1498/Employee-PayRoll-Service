package com.employeepayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Purpose : To Read Data, Write Data and Perform Operations and Store Data in a file and Count Entries
 * Author : Veer
 */

//EmployeePayrollService Class to Perform Operations
public class EmployeePayrollService {
    List<EmployeePayrollData> employeePayrollDataList;
    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollDataList) {
        super();
        this.employeePayrollDataList = employeePayrollDataList;
    }
    public EmployeePayrollService(){
        super();
        this.employeePayrollDataList = new ArrayList<>();
    }

    /**
     * Created an ArrayList To Store Data of Employee.
     * Created a ReadEmployee Data Function
     * - EmployeePayrollData object Created and Scanning id,name,salary.
     * - Adding those objects directly to ArrayList.
     * Created WriteEmployee Data Function
     * -Printing all The Data of ArrayList
     */
    public enum IOService{CONSOLE_IO,FILE_IO}

    //Function to Read Employee Data
    public void readEmployeeData() {

        EmployeePayrollData empData = new EmployeePayrollData();

        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Please Enter Employee ID");
        empData.setId(consoleInput.nextInt());
        System.out.println("Please Enter Employee Name");
        empData.setName(consoleInput.next());
        System.out.println("Please Enter Salary of Employee");
        empData.setSalary(consoleInput.nextInt());
        employeePayrollDataList.add(empData);

    }
    //Function to Write Employee Data
    public void writeEmployeeData(IOService ioService){
        if(ioService.equals(IOService.CONSOLE_IO)){
            System.out.println("Writing Employee Payroll Using Console \n"+employeePayrollDataList);
        } else if (ioService.equals(IOService.FILE_IO)) {
            new EmployeePayrollFileIOService().writeData(employeePayrollDataList);
        }
    }

    public void printEmployeeData(IOService ioService) {
        if(ioService.equals(IOService.FILE_IO))
            new EmployeePayrollFileIOService().printData();
    }
    public long countEntries(IOService ioService){
        if(ioService.equals(IOService.FILE_IO))
            new EmployeePayrollFileIOService().countEntry();
        return new EmployeePayrollFileIOService().countEntry();
    }
}
