package com.tcs;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Inventory[] inventories = new Inventory[4];
        Scanner sc =  new Scanner(System.in);
        for(int i =0; i < inventories.length; i++){
            inventories[i] = new Inventory(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
        }
        int limit = sc.nextInt();
        sc.close();
        Inventory[] res = replenish(inventories, limit);
        for(int i = 0; i<res.length; i++){
            if(res[i].getThreshold() > 75){
                System.out.println("Critical Filling");
            }
            else if(res[i].getThreshold() > 50 && res[i].getThreshold() < 75){
                System.out.println("Moderate Filling");
            }
            else{
                System.out.println("Non-Critical Filling");
            }
        }

    }
    public static Inventory[] replenish(Inventory[] inventories, int limit){
        Inventory[] ref = new Inventory[0];
        for(int i = 0; i < inventories.length; i++){
            if(inventories[i].getThreshold() >= limit){
                ref = Arrays.copyOf(ref, ref.length+1);
                ref[ref.length-1] = inventories[i];
            }
        }
        return ref;
    }
}
