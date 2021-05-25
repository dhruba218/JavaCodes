package com.tcs;
import java.util.*;
class Employee{
    int employeeId;
    String employeeName;
    double salary;
    String grade;
    String location;
    int yearsOfExperience;
    Employee(int employeeId, String employeeName, double salary, String grade, String location, int yearsOfExperience){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.grade = grade;
        this.location = location;
        this.yearsOfExperience = yearsOfExperience;
    }
    int getEmployeeId(){
        return employeeId;
    }
    String getEmployeeName(){
        return employeeName;
    }
    double getSalary(){
        return salary;
    }
    String getGrade(){
        return grade;
    }
    String getLocation(){
        return location;
    }
    int getYearsOfExperience(){
        return yearsOfExperience;
    }
}

