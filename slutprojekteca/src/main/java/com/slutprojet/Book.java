package com.slutprojet;

    /**KLassen Book representerar en bok i biblioteksystemet */

public class Book {
    private String  author;
    private String genre;
    private int pages;
    public Book(int id, String title, String author, String genre, int pages, boolean isAvailable) {
        super(id, title, isAvailable);
        this.author = author;
        this.genre = genre;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }
}
