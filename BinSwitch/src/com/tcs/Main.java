package com.tcs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two operands");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(" Press 1: Addition \n Press 2: Substraction \n Press 3: Exit");
        int choice = sc.nextInt();
        int res = 0;


        switch(choice){
            case 1:
                res = num1+num2;
                break;
            case 2:
                if(num1>num2)
                    res = num1-num2;
                break;
            case 3:
                System.out.println("Exiting");
                break;
            default:
                System.out.println("Invalid Choice!");
        }
        System.out.println(Integer.toBinaryString(res));
    }
}
