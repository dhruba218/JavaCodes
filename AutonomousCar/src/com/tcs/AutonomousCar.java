package com.tcs;

public class AutonomousCar {
    int carId;
    String brand;
    int noOfTestsConducted;
    int noOfTestsPassed;
    String environment;
    String grade;

    String getEnvironment(){
        return environment;
    }
    int getNoOfTestsPassed(){
        return noOfTestsPassed;
    }
    String getBrand(){
        return brand;
    }
    int getNoOfTestsConducted(){
        return noOfTestsConducted;
    }
    String getGrade(){
        return grade;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }

    AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment){
        this.carId = carId;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestsPassed = noOfTestsPassed;
        this.environment = environment;

    }
}
