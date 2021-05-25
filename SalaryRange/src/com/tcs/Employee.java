package com.tcs;


class Employee
{
    int empId;
    String empName;
    int mgId;
    String deptName;
    double salary;
    public int getEmpId() {
        return empId;
    }
    public Employee(int empId, String empName, int mgId, String deptName, double salary) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.mgId = mgId;
        this.deptName = deptName;
        this.salary = salary;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getMgId() {
        return mgId;
    }
    public void setMgId(int mgId) {
        this.mgId = mgId;
    }
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
