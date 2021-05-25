package com.tcs;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {


        Flight[] flts = new Flight[7];

        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<7;i++)
        {
            String FlightId = sc.nextLine();
            String Departure_From = sc.nextLine();
            String Arrival_To = sc.nextLine();
            double duration = sc.nextDouble();sc.nextLine();
            boolean Meal_available = sc.nextBoolean();sc.nextLine();

            flts[i] = new Flight(FlightId,Departure_From,Arrival_To,duration,Meal_available);
        }
        String dep_from = sc.nextLine();
        String arv_to = sc.nextLine();

        Flight[] FlightArray = SearchFlight(flts);

        System.out.println("Flight_ID Duration Meal_Available");
        for(Flight f : FlightArray)
        {
            System.out.println(f.FlightId+"       "+f.duration+"       "+f.Meal_available);
        }

        System.out.println("--------------------------------------------------------");

        System.out.println("Flight_ID Dep  Arv   Duration");


        Flight[] FltDetl = GetFlightDetails(flts,dep_from,arv_to);


        for(Flight f : FltDetl)
        {
            System.out.println(f.FlightId+"      "+f.getDeparture_From()+"  "+f.getArrival_To()+"    "+ f.getDuration());
        }
    }

    public static Flight[] SearchFlight(Flight[] f)
    {
        //implement method

        int count = 0;
        for(int i=0;i<f.length;i++) {
            if(f[i].getMeal_available()== true){
                if(f[i].getDuration() > 2){
                    count++;
                }
            }
        }
        Flight[] refined = new Flight[count];
        count = 0;
        for(int i=0;i<f.length;i++) {
            if(f[i].getMeal_available() != false){
                if(f[i].getDuration() > 2){
                    refined[count++] = f[i];
                }
            }
        }

        return refined;
    }




    public static Flight[] GetFlightDetails(Flight[] f,String dep,String arv)
    {
        //implement method
        int count = 0;
        for(int i=0;i<f.length;i++) {
            if(f[i].getDeparture_From().equalsIgnoreCase(dep) &&  f[i].getArrival_To().equalsIgnoreCase(arv)){
                count++;
            }
        }
        Flight[] ref = new Flight[count];
        count = 0;
        for(int i=0;i<f.length;i++) {
            if(f[i].getDeparture_From().equalsIgnoreCase(dep) &&  f[i].getArrival_To().equalsIgnoreCase(arv)){
                ref[count++] = f[i];
            }
        }
        for(int i=0;i<ref.length;i++){
            for(int j = i+1; j<ref.length;j++){
                if(ref[i].getDuration() > ref[j].getDuration()){
                    Flight temp = ref[i];
                    ref[i] = ref[j];
                    ref[j] = temp;
                }

            }
        }
        return ref;


    }



}
