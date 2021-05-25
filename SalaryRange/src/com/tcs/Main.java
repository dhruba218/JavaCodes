package com.tcs;
import java.util.*;

public class Main{
    public static void main(String[] args){
        int empId;
        String empName;
        int mgrId;
        String deptName;
        double salary;
        Scanner s = new Scanner(System.in);
        Employee[] emp = new Employee[4];
        for(int i=0;i<emp.length;i++){
            empId = s.nextInt();
            empName = s.next();
            mgrId = s.nextInt();s.nextLine();
            deptName = s.nextLine();
            salary = s.nextDouble();
            emp[i] = new Employee(empId, empName, mgrId, deptName, salary);
        }
        s.nextLine();
        double r1=s.nextDouble();
        double r2=s.nextDouble();

        int res=findempsWithSalRange(emp,r1,r2);
        if(res==0)
            System.out.println("No Employee in the given range");
        else
            System.out.println(res);

        Employee res2=getEmployeeWitMaxSal(emp);
        if(res2==null)
            System.out.println("NOT FOUND");
        else
            System.out.println(res2.empId+"#"+res2.empName+"#"+res2.salary);
    }
    public static int findempsWithSalRange(Employee[] emp,double r1,double r2){
        int count = 0;
        for(int i = 0; i<emp.length; i++){
            if(emp[i].getSalary() >= r1 && emp[i].getSalary() <= r2){
                count++;
            }
        }
        return count;
    }
    public static Employee getEmployeeWitMaxSal(Employee[] emp)
    {
        for(int i = 0; i<emp.length; i++){
            for(int j = i+1; j<emp.length; j++){
                if(emp[i].getSalary() > emp[j].getSalary()){
                    Employee temp = emp[i];
                    emp[i] = emp[j];
                    emp[j] = temp;
                }

            }
        }

        return emp[emp.length-1];
    }
}