package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Control {
    public static void run() {
        System.out.println("List of books in a Library.");

        String[] authors = {"Joan Rowling",
                "Beedebee K. Rome",
                "Jerome. K Jerome",
                "B. Prus",
                "Joan Rowling",
                "Gi de Mopassan",
                "A. Duma" };
        String[] names = {"Harry Potter 1",
                "Just a thing",
                "Three in a boat",
                "Pharaon",
                "Harry Potter 2",
                "Novellas",
                "Three musketeers" };
        String[] publisher = {"NewAge",
                "NewAge",
                "London Publishing",
                "NextGen",
                "NewAge",
                "Nova Publishing",
                "NewAge" };
        int[] years = {
                2007,
                1955,
                1956,
                1895,
                2010,
                1882,
                1844
        };

        int[] pages = {
                860,
                345,
                145,
                678,
                970,
                434,
                688
        };
        double[] prices = {
                56.40,
                34.50,
                11.45,
                67.80,
                67.89,
                41.34,
                68.80
        };

        ArrayList<Book> books = new ArrayList<>();

        for(int i = 0; i < authors.length; i++) {
            Book book = new Book();
            book.setBookName(names[i]);
            book.setAuthor(authors[i]);
            book.setYear(years[i]);
            book.setNumPages(pages[i]);
            book.setPublishHouse(publisher[i]);
            book.setPrice(prices[i]);
            books.add(book);
        }

        //user inputs data
        Scanner in = new Scanner(System.in);
        Book book = new Book();
        System.out.println("Add a book info:");
        try {
            System.out.println("year of the book -> ");
            if(!in.hasNextInt()) {
                throw new ArithmeticException("Wrong value!");
            }
            book.setYear(in.nextInt());
        }
        catch( InputMismatchException | ClassCastException | ArithmeticException e) {
            System.out.println(e.getMessage());
            while(!in.hasNextInt()) {
                System.out.println("Enter an arithmetic value -> ");
                in.next();
            }
            book.setYear(in.nextInt());
        }
        finally {
            book.setBookName("Max Force");
            book.setAuthor("Jack Forester");
            book.setNumPages(1992);
            book.setPublishHouse("Axe");
            book.setPrice(199.45);
            books.add(book);
            in.close();
        }
        BookModel library = new BookModel();
        library.setBooks(books);

        System.out.println("Books by " + authors[0] + ":");
        ArrayList<Book> temp;
        temp = library.booksByAuthor(authors[0]);
        for(Book elem : temp) {
            System.out.println("\t" + elem.getAuthor()
                    + " "
                    + elem.getBookName());
        }

        System.out.println("Books later then 1950:");
        temp = library.booksLaterThenYear(1950);
        for(Book elem : temp) {
            System.out.println("\t" + elem.getAuthor()
                    + " "
                    + elem.getBookName()
            + " "
            + elem.getYear());
        }

    }
}
