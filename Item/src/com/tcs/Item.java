package com.tcs;


    class Item
    {
        //code to build the class
        int id;
        int quantity;
        String name;
        double price;


        double getPrice(){
            return price;
        }
        int getQuantity(){
            return quantity;
        }
        String getName(){
            return name;
        }





        Item(int id, int quantity, String name, double price){
            this.id = id;
            this.quantity = quantity;
            this.name = name;
            this.price = price;

        }
    }
