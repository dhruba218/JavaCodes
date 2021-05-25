package com.tcs;

public class Medicine {

    String medicineName;
    String batch;
    String disease;
    int price;

    String getDisease(){
        return disease;
    }
    int getPrice(){
        return price;
    }

    Medicine(String medicineName, String batch, String disease, int price) {
        this.medicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }
}
