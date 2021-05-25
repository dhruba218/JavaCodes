package com.tcs;

public class TravelAgencies {

    int regNo;
    String agencyName;
    String pakageType;
    int price;
    boolean flightFacility;

    int getPrice(){
        return price;
    }
    boolean isFlightFacility(){
        return flightFacility;
    }
    int getRegNo(){
        return regNo;
    }
    String getPakageType(){
        return pakageType;
    }
    String getAgencyName(){
        return agencyName;
    }

    TravelAgencies(int regNo, String agencyName, String pakageType, int price, boolean flightFacility){
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.pakageType = pakageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }
}
