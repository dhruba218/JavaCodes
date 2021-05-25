package com.tcs;

public class Toy {
    int toyId;
    String toyType;
    double toyPrice;
    double toyRating;

    String getToyType(){
        return toyType;
    }
    double getToyRating(){
        return toyRating;
    }
    double getToyPrice(){
        return toyPrice;
    }

    Toy(int toyId, String toyType, double toyPrice, double toyRating){
        this.toyId = toyId;
        this.toyType = toyType;
        this.toyPrice = toyPrice;
        this.toyRating = toyRating;
    }

}
