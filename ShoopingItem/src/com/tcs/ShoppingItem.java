package com.tcs;

public class ShoppingItem {
        int itemId;
        String itemType;
        String itemName;
        double itemPrice;
        int yearofMFG;
        public ShoppingItem(int itemId, String itemType, String itemName, double itemPrice, int yearofMFG) {
            super();
            this.itemId = itemId;
            this.itemType = itemType;
            this.itemName = itemName;
            this.itemPrice = itemPrice;
            this.yearofMFG = yearofMFG;
        }
        public int getItemId() {
            return itemId;
        }

        public String getItemType() {
            return itemType;
        }

        public String getItemName() {
            return itemName;
        }

        public double getItemPrice() {
            return itemPrice;
        }

        public int getYearofMFG() {
            return yearofMFG;
        }
    }

