package com.company;

import java.util.ArrayList;

public class BookModel {
    private ArrayList<Book> books = new ArrayList<>();

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Book> booksByAuthor(String author) {
       ArrayList<Book> booksArr = new ArrayList<>();
       for(Book elem : books) {
           if(elem.getAuthor() == author) {
               booksArr.add(elem);
           }
       }
       return booksArr;
    }
    public ArrayList<Book> booksByPublisher(String publisher) {
        ArrayList<Book> booksArr = new ArrayList<>();
        for(Book elem : books) {
            if(elem.getPublishHouse() == publisher) {
                booksArr.add(elem);
            }
        }
        return booksArr;
    }
    public ArrayList<Book> booksLaterThenYear(int year){
        ArrayList<Book> booksArr = new ArrayList<>();
        for(Book elem : books) {
            if(elem.getYear() > year) {
                booksArr.add(elem);
            }
        }
        return booksArr;
    }
}
