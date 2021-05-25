package com.tcs;

import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        int id;
        String name;
        double salary;
        int age;
        Customer[] customers = new Customer[4];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<customers.length;i++){
            customers[i] = new Customer(s.nextInt(), s.next(), s.nextDouble(), s.nextInt());
            s.nextLine();
        }
        double salaryParam = s.nextDouble();
        s.close();


        double average = findAverageSalaryOfCustomer(customers);
        Customer res2 = searchCustomerBySalary(customers, salaryParam);

        if(average > 0)
            System.out.println("Average of Salary "+average);
        else
            System.out.println("No Customer found with mentioned attribute");

        if(res2 == null)
            System.out.println("The given salary is incorrect");
        else
            System.out.println(res2.getId()+" "+res2.getName()+" "+res2.getSalary()+" "+res2.getAge());

    }
    public static double findAverageSalaryOfCustomer(Customer[] customers){
        double average = 0;
        for(Customer customer: customers){
            average += customer.getSalary();
        }
        if(average > 0) return average/customers.length;
        else return average;
    }

    public static Customer searchCustomerBySalary(Customer[] customers, double salaryParam){
        for(int i=0;i<customers.length;i++){
            if(salaryParam == customers[i].getSalary())
                return customers[i];
        }
        return null;
    }


}