package com.tcs;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        ToastMaster[] t = new ToastMaster[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<t.length;i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String location = sc.nextLine();
            String type = sc.nextLine();
            int NoOfEvents = sc.nextInt();
            int NoOfYears =  sc.nextInt();
            t[i] = new ToastMaster(id,location,type,NoOfEvents,NoOfYears);
        }
        sc.nextLine();
        String loc = sc.nextLine();
        System.out.println("Total Count of "+loc+" : "+specificLocationCount(t,loc));
        ToastMaster t1[] = updateType(t);
        for(int i=0;i<t1.length;i++)
            System.out.println(t1[i].getId()+"  "+t1[i].getLocation()+"  "+t1[i].getType());
    }

    public static int specificLocationCount(ToastMaster[] t,String loc)
    {
        //implement the method
        int count = 0;
        for(int i = 0; i<t.length; i++){
            if(t[i].getNoOfEvents() > 10 && t[i].getLocation().equalsIgnoreCase(loc)){
                count++;
            }
        }
        return count;
    }

    public static ToastMaster[] updateType(ToastMaster[] t)
    {
        //implement the method
        int count = 0;
        for(int i = 0; i<t.length; i++) {
            if (t[i].getType().equalsIgnoreCase("Member")) {
                if (t[i].getNoOfEvents() > 8 && t[i].getNoOfYears() > 3) {
                    count++;
                }
            }
        }
        ToastMaster[] ref = new ToastMaster[count];
        count = 0;
        for(int i = 0; i<t.length; i++) {
            if (t[i].getType().equalsIgnoreCase("Member")) {
                if (t[i].getNoOfEvents() > 8 && t[i].getNoOfYears() > 3) {
                    t[i].setType("Host");
                    ref[count++] = t[i];
                }
            }
        }
        return ref;

    }
}

