package com.tcs;

public class Project {
    int projId;
    String projName;
    Double projCost;
    String technology1;
    String technology2;
    String technology3;

    double getCost(){
        return projCost;
    }
    String getProjName(){
        return getProjName();
    }
    String getTechnology1(){
        return technology1;
    }
    String getTechnology2(){
        return technology2;
    }
    String getTechnology3(){
        return technology3;
    }

    Project(int projId, String projName, Double projCost, String technology1, String technology2, String technology3){
        this.projId = projId;
        this.projName = projName;
        this.projCost = projCost;
        this.technology1 = technology1;
        this.technology2 = technology2;
        this.technology3 = technology3;

    }
}

