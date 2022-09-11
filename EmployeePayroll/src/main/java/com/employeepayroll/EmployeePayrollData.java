package com.employeepayroll;

/**
 *  Purpose : To Read Data, Write Data and Perform Operations and Store Data in a file and Count Entries
 *  Author : Veer
 */
public class EmployeePayrollData {
    /**
     * Declared 3 Variables and they are made private for abstraction
     * Added a Constructor.
     * Used Getters and Setters to Access values of variable.
     */
    private int id;
    private String name;
    private int salary;

    public EmployeePayrollData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
