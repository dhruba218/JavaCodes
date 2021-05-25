package com.tcs;

class Book
{
    //implement class here
    int id;
    String title;
    String author;
    double price;

    int getId(){
        return id;
    }
    double getPrice(){
        return price;
    }


    Book(int id, String title, String author, double price){
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

