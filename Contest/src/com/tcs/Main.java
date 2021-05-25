package com.tcs;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Contest[] contests = new Contest[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < contests.length; i++) {
            contests[i] = new Contest(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.next());
            sc.nextLine();
        }
        String parameter = sc.next();
        String categoryParameter = sc.next();
        sc.close();

        int res1 = finfTotalPointsBasedOnWinner(contests, parameter);
        if (res1 != 0) {
            System.out.println(res1);
        } else {
            System.out.println("Contest winner not found");
        }
        Contest res2 = getContestWithSecondHighestPoints(contests, categoryParameter);
        if (res2 != null) {
            System.out.println(res2.getContestName());
            System.out.println(res2.getPoints());
        } else {
            System.out.println("There is no matching contest");
        }

    }


    public static int finfTotalPointsBasedOnWinner(Contest[] contests, String parameter) {
        int sum = 0;
        for (int i = 0; i < contests.length; i++) {
            if (contests[i].getContestWinner().equalsIgnoreCase(parameter)) {
                sum += contests[i].getPoints();
            }
        }
        return sum;
    }

    public static Contest getContestWithSecondHighestPoints(Contest[] contests, String categoryParameter) {

        Contest temp;
        for (int i = 0; i < contests.length - 1; i++) {
            for (int j = i + 1; j < contests.length; j++) {
                if (contests[i].getPoints() < contests[j].getPoints()) {
                    temp = contests[i];
                    contests[i] = contests[j];
                    contests[j] = temp;
                }
            }
        }
        return contests[contests.length - 2];
    }
}
