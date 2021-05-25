package com.tcs;

public class Institution {
    int institutionId;

    int noOfStudentsCleared;
    String location;
    String grade;

    String getLocation(){
        return location;
    }
    int getNoOfStudentsCleared(){
        return noOfStudentsCleared;
    }
    Institution(int institutionId, int noOfStudentsCleared, String location){
        this.institutionId = institutionId;

        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;

    }


}
