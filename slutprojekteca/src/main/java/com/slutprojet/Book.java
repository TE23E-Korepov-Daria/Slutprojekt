package com.slutprojet;

    /**Klassen Book representerar en bok i biblioteksystemet */

public class Book extends LibraryItem {
    private String author;
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
    public String getGenre() {
        return genre;
    }
    public int getPages() {
        return pages;
    }

    @Override
    public String getInfo() {
        return "Book - ID: " + getId() + ", Title: " + getTitle() + ", Author: " + getAuthor() + ", Genre: " + getGenre() + ", Pages: " + getPages() + ", Available: " + getIsAvailable();
    }
}
