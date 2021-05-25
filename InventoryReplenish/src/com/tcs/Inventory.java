package com.tcs;

public class Inventory {
    String inventoryId;
    int maximumQuantity;
    int currentQuantity;
    int threshold;

    int getThreshold(){
        return threshold;
    }

    Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold){
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }

}
