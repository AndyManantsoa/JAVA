// Create a class called "Book" with the following attributes:
// title (String)
// author (String)
// numberOfPages (int)
// Write a program that:
// * Defines the Book class with the mentioned attributes.
// * Creates two objects (instances) of the Book class with different book information.
// * Prints the details of each book object (title, author, number of pages) using appropriate methods or by accessing the attributes directly.

import java.util.Scanner;

public class Book {
    String title;
    String author;
    int numberOfPages;

    public Book(String title, String author, int numberOfPages){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public void printBook(){
        System.out.println("Title: " + this.title );
        System.out.print( " Author: " + this.author );
        System.out.print( " Number of pages: " + this.numberOfPages);
       }  

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Book book1 = new Book("Friends forever", "Danielle Steel", 240);
        book1.printBook();

        Book book2 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 240);
        book2.printBook();
        scanner.close();
    }
}
