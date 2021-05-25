package com.tcs;


public class Main {

    public static void main(String[] args) {
	// write your code here
        int num = 8453;
        int rem = 0;
        int max = 0;
        while(num != 0){
            rem = num % 10;
            if(rem > max){
                max = rem;
            }
             num /= 10;
        }
        System.out.println(max);

    }


}
