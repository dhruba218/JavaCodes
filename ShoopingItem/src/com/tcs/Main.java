package com.tcs;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
                int itemId;
                String itemType;
                String itemName;
                double itemPrice;
                int yearofMFG;
                ShoppingItem[] shop = new ShoppingItem[4];
                Scanner sc = new Scanner(System.in);
                for(int i=0;i<shop.length;i++) {
                    itemId = sc.nextInt();
                    sc.nextLine();
                    itemType = sc.nextLine();
                    itemName = sc.nextLine();
                    itemPrice = sc.nextDouble();
                    yearofMFG = sc.nextInt();
                    shop[i] = new ShoppingItem(itemId, itemType, itemName, itemPrice, yearofMFG);
                }
                int yearofMFG1 = sc.nextInt();
                sc.nextLine();
                String itemType1 = sc.nextLine();
                int count = getItemCountForYear(shop,yearofMFG1);
                if(count>0) {
                    System.out.println(count);
                }
                else {
                    System.out.println("no Item");
                }

                ShoppingItem shop1 = getHighestPricedItem(shop,itemType1);
                if(shop1 == null) {
                    System.out.println("no item");
                }
                else {
                    System.out.println(shop1.getItemName()+";"+shop1.getItemPrice()+";"+shop1.getItemType());
                }
            }
            public static int getItemCountForYear(ShoppingItem[] shop, int yearofMFG) {
                int count =0;
                for(int  i = 0; i<shop.length; i++){
                    if(shop[i].getYearofMFG() == yearofMFG){
                        count++;
                    }
                }
                return count;

            }
            public static ShoppingItem getHighestPricedItem(ShoppingItem[] shop,String itemType) {
                int count = 0;
                for(int  i = 0; i<shop.length; i++){
                    if(shop[i].getItemType().equalsIgnoreCase(itemType)){
                        count++;
                    }
                }
                ShoppingItem[] ref = new ShoppingItem[count];
                count = 0;
                for(int  i = 0; i<shop.length; i++){
                    if(shop[i].getItemType().equalsIgnoreCase(itemType)){
                        ref[count++] = shop[i];
                    }
                }
                double highest = 0;
                for(int  i = 0; i<ref.length; i++){
                    for(int  j = i+1; j<ref.length; j++){
                        if(ref[i].getItemPrice() > ref[j].getItemPrice()){
                            ShoppingItem r = ref[i];
                            ref[i] = ref[j];
                            ref[j] = r;

                        }

                    }
                }
                return ref[ref.length-1];
            }
}
