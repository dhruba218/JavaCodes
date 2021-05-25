package com.tcs;

public class ToastMaster {
    int id;
    String location;
    String type;
    int noOfEvents;
    int noOfYears;

    int getId(){
        return id;
    }
    String getType(){
        return type;
    }
    int getNoOfEvents(){
        return noOfEvents;
    }
    int getNoOfYears(){
        return noOfYears;
    }
    String getLocation(){
        return location;
    }
    public void setType(String type){
        this.type = type;
    }


    ToastMaster(int id, String location, String type, int noOfEvents, int noOfYears){
        this.id = id;
        this.location = location;
        this.type = type;
        this.noOfEvents = noOfEvents;
        this.noOfYears = noOfYears;
    }
}
