package com.tcs;

import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        int employeeId;
        String employeeName;
        double salary;
        String grade;
        String location;
        int yearsOfExperience;
        Employee[] emp = new Employee[4];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<emp.length;i++){
            emp[i] = new Employee(s.nextInt(), s.next(), s.nextDouble(), s.next(), s.next(), s.nextInt());
            s.nextLine();
        }
        s.nextLine();
        String newLocation = s.nextLine();
        String newGrade = s.nextLine();
        s.close();
        int countOfEmployees = findCountOfEmployeesByLoc(emp, newLocation);
        Employee emp1 = findHighestSalaryEmpDetailsWithGivenGrade(emp, newGrade);

        if(countOfEmployees == 0)
            System.out.println("There are no employees present in the given location and yearsOfExperience");
        else
            System.out.println(countOfEmployees);

        if(emp1 == null)
            System.out.println("No employees present in the given grade");
        else
            System.out.println(emp1.getEmployeeId()+":"+emp1.getEmployeeName()+":"+emp1.getLocation());
    }
    public static int findCountOfEmployeesByLoc(Employee[] emp, String location){
        int count = 0;
        for(int i = 0; i<emp.length; i++){
                if(emp[i].getYearsOfExperience() > 2){
                    if(emp[i].getLocation().equalsIgnoreCase(location)){
                        count++;
                    }
                }
        }
        return count;

    }
    public static Employee findHighestSalaryEmpDetailsWithGivenGrade(Employee[] emp, String grade){
        int count = 0;
        for(int i = 0; i<emp.length; i++) {
            if (emp[i].getGrade().equalsIgnoreCase(grade)) {
                count++;
            }
        }
        if(count == 0){
            return null;
        }
        Employee[] ref = new Employee[count];
        count = 0;
        for(int i = 0; i<ref.length; i++) {
            if (ref[i].getGrade().equalsIgnoreCase(grade)) {
                ref[count++] = emp[i];
            }
        }
        for(int i = 0; i<ref.length; i++){
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

