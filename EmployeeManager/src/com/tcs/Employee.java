package com.tcs;

import java.util.Scanner;

class Employee{
    private int empId;
    private String empName;
    private int mgrId;
    private String deptName;
    private double salary;
    public Employee(int empId, String empName, int mgrId, String deptName, double salary){
        this.empId = empId;
        this.empName = empName;
        this.mgrId = mgrId;
        this.deptName = deptName;
        this.salary = salary;
    }
    public int getEmpId(){
        return empId;
    }
    public String getEmpName(){
        return empName;
    }
    public int getMgrId(){
        return mgrId;
    }
    public double getSalary(){
        return salary;
    }
}
