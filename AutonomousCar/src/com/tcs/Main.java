package com.tcs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        AutonomousCar[] autonomousCars = new AutonomousCar[4];
        Scanner sc =  new Scanner(System.in);
        for(int i = 0; i < autonomousCars.length; i++){
            autonomousCars[i] = new AutonomousCar(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.next());
            sc.nextLine();
        }
        String environment = sc.next();
        String brand = sc.next();
        sc.close();

        int res1 = findTestPassedByEnv(autonomousCars, environment);
        if(res1 != 0){
            System.out.println(res1);
        }
        else{
            System.out.println("There are no tests passed in this particular environment");
        }

        AutonomousCar res2 = updateCarGrade(autonomousCars, brand);
        if(res2 != null){
            System.out.println(brand+": "+res2.getGrade());
        }
    }

    public static int findTestPassedByEnv(AutonomousCar[] autonomousCars, String environment){
        int sum = 0;
        for(int i = 0; i < autonomousCars.length; i++){
            if(autonomousCars[i].getEnvironment().equalsIgnoreCase(environment)){
                sum += autonomousCars[i].getNoOfTestsPassed();
            }
        }
        return sum;

    }

    public static AutonomousCar updateCarGrade(AutonomousCar[] autonomousCars, String brand) {
        int rating = 0;
        for (int i = 0; i < autonomousCars.length; i++) {
            if (autonomousCars[i].getBrand().equalsIgnoreCase(brand)) {
                rating = ((autonomousCars[i].getNoOfTestsPassed() * 100) / autonomousCars[i].getNoOfTestsConducted());
            }
            if (rating > 80) {
                autonomousCars[i].setGrade("A");
            }
            else {
                autonomousCars[i].setGrade("B");
            }
            return autonomousCars[i];
        }
        return null;
    }

}
