package com.tcs;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Book[] books = new Book[4];
        double min = 0;
        double max = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<books.length;i++)
        {
            int id = sc.nextInt();
            String title = sc.nextLine();
            String author = sc.nextLine();
            sc.nextLine();
            double price = sc.nextDouble();

            books[i]= new Book(id,title,author,price);
        }
        min = sc.nextDouble();
        max = sc.nextDouble();

        Book[] newBooks = booksWithPriceRange(min,max,books);

        for(Book b:newBooks)
            System.out.println(b.getId());
    }

    //implement business methods here
    public static Book[] booksWithPriceRange(double min, double max, Book[] books){

        List<Book> bookList = Arrays.asList(books);
        List<Book> ref = new ArrayList<Book>();
        Iterator<Book> it = bookList.iterator();
        while(it.hasNext()){
            Book temp = it.next();
            if(temp.getPrice() >= min && temp.getPrice() <= max){
                ref.add(temp);
            }
        }
        Collections.sort(ref,new Comparator<Book>(){
            public int compare(Book o1, Book o2) {
                return o1.getId()-o2.getId();
            }
        });
        Book[] res = new Book[ref.size()];
        ref.toArray(res);
        return res;  
    }
}