package com.employeepayroll;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollFileIOService {
    public static String PAYROLL_FileName = "D:\\RFP-175\\Employee-PayRoll-Service\\EmployeePayroll\\src\\main\\resources\\payroll-file.txt";
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

//    public void printData() {
//        try{
//            Files.lines(new File(PAYROLL_FileName).toPath()).forEach(System.out::println);
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }
//    }
}
