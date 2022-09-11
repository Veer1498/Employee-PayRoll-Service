package com.employeepayroll;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

// Employee Payroll Service Class For IO Services
public class EmployeePayrollFileIOService {
    public static String PAYROLL_FileName = "D:\\RFP-175\\Employee-PayRoll-Service\\EmployeePayroll\\src\\main\\resources\\payroll-file.txt";
    //Function to Write Data
    public void writeData(List<EmployeePayrollData> employeePayrollDataList) {
        StringBuffer empBuffer = new StringBuffer();
        employeePayrollDataList.forEach(employee ->{
            String empDataString = employee.toString().concat("\n");
            empBuffer.append(empDataString);
        });
        try{
            Files.write(Paths.get(PAYROLL_FileName), empBuffer.toString().getBytes());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    //Function to Print Data
    public void printData() {
        try{
            Files.lines(new File(PAYROLL_FileName).toPath()).forEach(System.out::println);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    //Function to Count Entries
    public long countEntry() {
        long entries = 0;
        try{
            entries = Files.lines(new File(PAYROLL_FileName).toPath()).count();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return entries;
    }
}
