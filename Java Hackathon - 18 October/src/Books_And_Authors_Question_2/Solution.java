package Books_And_Authors_Question_2;

import java.util.*;

public class Solution {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        Book [] books=new Book[n];
        Author [] authors=new Author[n];
        for(int i=0;i<n;i++){
            int authorId=scan.nextInt();
            scan.nextLine();
            String authorName=scan.nextLine();
            int bookId=scan.nextInt();
            scan.nextLine();
            String title=scan.nextLine();
            String genre=scan.next();
            double price=scan.nextDouble();
            scan.nextLine();

            authors[i]=new Author(authorId,authorName);
            books[i]=new Book(bookId,title,genre,price,authors[i]);
        }
        String Genre1=scan.nextLine();
        String Genre2=scan.nextLine();
        double discountedPercentage=scan.nextDouble();

        Book [] matchedGenre=getBooksBelongingTOAGenre(books,Genre1);
        for(Book bk: matchedGenre){
            System.out.println("AuthorName: "+bk.author.authorName+", Title: "+bk.title);
        }
        Book [] matchedGenreWithDiscount=calculateDiscountedPrice(books,Genre2,discountedPercentage);
        if(matchedGenreWithDiscount.length>1){
            System.out.println("Discounted "+Genre2+" Books: ");
            for(Book bk: matchedGenreWithDiscount){
                System.out.println("AuthorName: "+bk.author.authorName+", Title: "+bk.title+", Updated Price: "+bk.price);
            }
        }
        else{
            System.out.println("Discounted books are unavailable in the given genre.");
        }


    }
    public static Book[] getBooksBelongingTOAGenre(Book[] books, String genre){
        ArrayList<Book> matchedGenre=new ArrayList<>();
        for(Book bk: books){
            if(bk.genre.equalsIgnoreCase(genre)){
                matchedGenre.add(bk);
            }
        }
        return matchedGenre.toArray(new Book[0]);
    }
    public static Book[] calculateDiscountedPrice(Book[] books, String genre, double discountPercentage){
        ArrayList<Book> matchedGenreWithDiscount=new ArrayList<>();
        for(Book bk: books){
            double DiscountedPrice=bk.price-(bk.price*discountPercentage)/100;
            if(bk.genre.equalsIgnoreCase(genre)){
                bk.price=DiscountedPrice;
                matchedGenreWithDiscount.add(bk);
            }
        }

        return matchedGenreWithDiscount.toArray(new Book[0]);
    }
}

class Author{
    int authorId;
    String authorName;

    public Author(int authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
    }
}

class Book{
    int bookId;
    String title;
    String genre;
    double price;
    Author author;

    public Book(int bookId, String title, String genre, double price, Author author) {
        this.bookId = bookId;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.author = author;
    }

}