package com.tcs;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Product[] products = new Product[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int productId = sc.nextInt();
            sc.nextLine();
            String productName = sc.nextLine();
            int qty = sc.nextInt();
            int price = sc.nextInt();

            products[i] = new Product(productId, productName, qty, price);
        }


        int totalCartPrice = calculateTotalCartPrice(products);
        System.out.println("Total Cart Price : " + totalCartPrice);

        System.out.println("\n");

        Product[] productsWithDescendingPrice = arrangeProductsByPriceDescending(products);
        System.out.println("---- PRODUCTS WITH DESCENDING PRICE ----");
        for (Product p : productsWithDescendingPrice) {
            System.out.println(p.getProductName() + " \t\t: " + p.getPrice());
        }
    }

    //implement business methods here
    public static int calculateTotalCartPrice(Product[] products) {
        int[] temp = new int[products.length];
        int sum = 0;
        for (int i = 0; i < products.length; i++) {
            temp[i] = products[i].getQty() * products[i].getPrice();
            sum += temp[i];
        }
        return sum;
    }

    public static Product[] arrangeProductsByPriceDescending(Product[] products) {
        Product temp;
        for (int i = 0; i < products.length-1; i++){
            for (int j = i+1; j < products.length; j++){
                if(products[i].getPrice() < products[j].getPrice()){
                    temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }

    return products;

    }
}