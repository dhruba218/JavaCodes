package com.tcs;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Toy[] toys = new Toy[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < toys.length; i++){
            toys[i] = new Toy(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble());
            sc.nextLine();
        }
        String typeParameter = sc.next();
        double ratingParam = sc.nextDouble();
        sc.close();
        double res1 = getAvgRatingBasedOnType(toys, typeParameter);
        if(res1 != 0){
            System.out.println(Math.round(res1));
        }
        else{
            System.out.println("There are no Toys with rating more than given rating");
        }

        Toy res2 = getSecondCheapestToyAsPerRating(toys, ratingParam);
        if(res2 != null){
            System.out.println(res2.getToyType());
            System.out.println(res2.getToyPrice());
        }
        else{
            System.out.println("There are no Toys with rating more than given rating");
        }




    }
    public static double getAvgRatingBasedOnType(Toy[] toys, String typeParameter){
        double ref = 0.0;
        double avg = 0.0;
        for(int i = 0; i < toys.length; i++){
            if(toys[i].getToyType().equalsIgnoreCase(typeParameter)){
                ref += toys[i].getToyRating();
                avg = ref/i;
            }
        }
        return avg;
    }
    public static Toy getSecondCheapestToyAsPerRating(Toy[] toys, double ratingParam){
        HashMap<Double, Integer> hashMap = new HashMap<Double, Integer>();
        for (int i = 0; i < toys.length; i++) {
            if (toys[i].getToyRating() > ratingParam) {
                hashMap.put(toys[i].getToyRating(), i);
            }
        }
        if (hashMap.size() > 0) {
            Map<Double, Integer> map = new TreeMap<Double, Integer>(hashMap);
            int i = 0;
            int finalIndex = -1;
            int size = map.size();
            for (Map.Entry<Double, Integer> entry : map.entrySet()) {
                if (i == size - 2) {
                    finalIndex = entry.getValue();
                }
                i++;
            }
            if(finalIndex != -1){
                return toys[finalIndex];
            }
            else
                return null;
        }
        else
            return null;
    }



}

