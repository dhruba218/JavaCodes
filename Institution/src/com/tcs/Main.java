package com.tcs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Institution[] institutions = new Institution[4];
        Scanner s = new Scanner(System.in);
        for(int i = 0; i<4; i++){
            institutions[i] = new Institution(s.nextInt(), s.nextInt(), s.next());
            s.nextLine();
        }
        String location = s.next();
        s.close();
        int res1 = findNumClearancedByLoc(institutions, location);
        System.out.println(res1);




    }
    public static int findNumClearancedByLoc(Institution[] institutions, String location){

        int sum = 0;
        for(int i = 0; i < institutions.length; i++) {
            if (institutions[i].getLocation().equalsIgnoreCase(location)) {
                sum += institutions[i].getNoOfStudentsCleared();
            }

        }
        return sum;
    }

}
