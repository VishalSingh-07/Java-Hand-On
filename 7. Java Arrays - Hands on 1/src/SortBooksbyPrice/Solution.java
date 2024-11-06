package SortBooksbyPrice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan=new Scanner(System.in);
        Book[] booksArr=new Book[4];
        for(int i=0;i<4;i++){
            int id=scan.nextInt();
            String title=scan.next();
            String author=scan.next();
            double price=scan.nextInt();
            booksArr[i]=new Book(id,title,author,price);
        }
        Book[] result=sortBooksByPrice(booksArr);
        if(result!=null){
            for(int i=0;i<result.length;i++){
                System.out.println(result[i].getId()+" "+result[i].getTitle()+" "+
                        result[i].getAuthor()+" "+result[i].getPrice());
            }
        }
    }
    public static Book[] sortBooksByPrice(Book[] bookArray){
        int n=bookArray.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(bookArray[i].getPrice()>bookArray[j].getPrice()){
                    Book temp=bookArray[i];
                    bookArray[i]=bookArray[j];
                    bookArray[j]=temp;
                }
            }
        }
        return bookArray;
    }
}

class Book{
    private int id;
    private String title;
    private String author;
    private double price;

    Book(int id, String title,String author, double price){
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price=price;
    }

}