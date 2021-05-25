package com.tcs;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Medicine[] medicines = new Medicine[4];
        Scanner sc =  new Scanner(System.in);
        for (int i = 0; i < medicines.length; i++){
            medicines[i] = new Medicine(sc.next(), sc.next(), sc.next(), sc.nextInt());
            sc.nextLine();
        }
        String paramDisease = sc.next();
        sc.close();
        int[] res = getPriceByDisease(medicines, paramDisease);
        for (int i = 0; i < res.length; i++){
            if(res[i] != 0){
                System.out.println(res[i]);
            }
        }
    }
    public static int[] getPriceByDisease(Medicine[] medicines, String paramDisease) {
        int[] ref = new int[medicines.length];
        for (int i = 0; i < medicines.length; i++){
            if(medicines[i].getDisease().equalsIgnoreCase(paramDisease)){
                ref[i] = medicines[i].getPrice();
            }
        }
        Arrays.sort(ref);
        return ref;
    }
}
