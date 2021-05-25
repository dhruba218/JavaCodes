package com.tcs;


import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int empId;
        String empName;
        int mgrId;
        String deptName;
        double salary;
        Scanner s = new Scanner(System.in);
        Employee[] emp = new Employee[5];
        for(int i=0;i<emp.length;i++){
            empId = s.nextInt();s.nextLine();
            empName = s.nextLine();
            mgrId = s.nextInt();s.nextLine();
            deptName = s.nextLine();
            salary = s.nextDouble();
            emp[i] = new Employee(empId, empName, mgrId, deptName, salary);
        }

        int count = empsWithSalMoreThanAvg(emp);
        Employee employee = getManagerWithMaxSalary(emp);

        if(count > 0)
            System.out.println(count);
        else
            System.out.println("No such Employees");

        if(employee == null)
            System.out.println("No Managers");
        else
            System.out.println(employee.getEmpId()+"#"+employee.getEmpName());
    }
    public static int empsWithSalMoreThanAvg(Employee[] emp){
        int sum = 0, count = 0;
        for(int i = 0; i<emp.length;i++){
            sum += emp[i].getSalary();
            count++;
        }
        int avg = sum/count;
        int temp = 0;
        for(int i = 0; i<emp.length;i++){
            if(emp[i].getSalary() > avg){
                temp++;
            }
        }
        return temp;
    }
    public static Employee getManagerWithMaxSalary(Employee[] emp){
        int count = 0;
        for(int i = 0; i<emp.length;i++){
            if(emp[i].getMgrId() != 0){
                count++;
            }
        }
        Employee[] ref = new Employee[count];
        count = 0;
        for(int i = 0; i<emp.length;i++){
            if(emp[i].getMgrId() != 0){
                ref[count++] = emp[i];
            }
        }
        for(int i = 0; i<ref.length;i++){
            for(int j = i+1; j<ref.length; j++){
                if(ref[i].getSalary() > ref[j].getSalary()){
                    Employee temp = ref[i];
                    ref[i] = ref[j];
                    ref[j] = temp;
                }
            }
        }
        return ref[ref.length-1];

    }
}