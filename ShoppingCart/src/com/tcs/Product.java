package com.tcs;
class Product
{
    int productId;
    String productName;
    int qty;
    int price;

    int getQty(){
        return qty;
    }
    int getPrice(){
        return price;
    }
    String getProductName(){
        return productName;
    }

    Product(int productId, String productName, int qty, int price) {
        this.productId = productId;
        this.productName = productName;
        this.qty = qty;
        this.price = price;

    }
}