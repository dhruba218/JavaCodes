package com.tcs;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TravelAgencies[] travelAgencies = new TravelAgencies[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < travelAgencies.length; i++){
            travelAgencies[i] = new TravelAgencies(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.nextBoolean());
            sc.nextLine();
        }
        int regNo = sc.nextInt();
        String packageType = sc.next();
        sc.close();
        int res1 = findAgencyWithHighestPackagePrice(travelAgencies);
        System.out.println(res1);
        TravelAgencies res2 = agencyDetailsForGivenldAndType(travelAgencies, regNo, packageType);
        if (res2 == null)
            System.out.println("A string value should be printed here!");
        else
            System.out.println(res2.getAgencyName() + ":" + res2.getPrice());

    }
    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] travelAgencies){
        int[] arr = new int[travelAgencies.length];
        for(int i = 0; i < travelAgencies.length; i++){
            arr[i] = travelAgencies[i].getPrice();
        }
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
    public static TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies[] travelAgencies, int regNo, String packageType){
        for(int i = 0; i < travelAgencies.length; i++){
            if(travelAgencies[i].isFlightFacility() == true){
                if(travelAgencies[i].getRegNo() == regNo && packageType.equalsIgnoreCase(travelAgencies[i].getPakageType())){
                    return travelAgencies[i];
                }
            }
        }
        return null;
    }

}
