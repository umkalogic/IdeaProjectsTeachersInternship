package com.company;

public class Book {
    private String bookName;
    private String author;
    private String publishHouse;
    private int year;
    private int numPages;
    private double price;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishHouse(String publishHouse) {
        this.publishHouse = publishHouse;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    public String getPublishHouse() {
        return publishHouse;
    }

    public int getNumPages() {
        return numPages;
    }

    public int getYear() {
        return year;
    }
}
