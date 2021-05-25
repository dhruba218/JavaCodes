package com.tcs;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        //code to read values
        //code to call required method
        //code to display the result
        int id;
        int quantity;
        String name;
        double price;
        Item[] items = new Item[4];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<items.length;i++){
            id = s.nextInt();s.nextLine();
            quantity = s.nextInt();s.nextLine();
            name = s.nextLine();
            price = s.nextDouble();
            items[i] = new Item(id, quantity, name, price);
        }
        s.nextLine();
        String nameParam = s.nextLine();
        String newItemName = s.nextLine();
        s.close();
        double res1 = findAverageQuantityOfItem(items);
        if(res1 != 0){
            System.out.println(res1);
        }
        else{
            System.out.println("No Item found with mentioned attribute");
        }
        Item res2 = searchItemByName(items, nameParam);
        if(res2 != null){
            System.out.println(res1);
        }
        else{
            System.out.println("No Item found with mentioned attribute");
        }


    }

    public static double findAverageQuantityOfItem(Item[] item) {
        //method logic
        int sum = 0, count = 0;
        for (int i = 0; i < item.length; i++) {
            sum += item[i].getQuantity();
            count++;
        }
        double avg = sum / count;
        return avg;
    }

    public static Item searchItemByName(Item[] item, String name) {

        //method logic

        for (int i = 0; i < item.length; i++) {
            if (item[i].getName().equalsIgnoreCase(name)) {
                return item[i];
            }
        }
        return null;

    }
}
