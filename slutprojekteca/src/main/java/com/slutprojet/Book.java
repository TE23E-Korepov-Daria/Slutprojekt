package com.slutprojet;

    /**Klassen Book representerar en bok i biblioteksystemet */

public class Book extends LibraryItem {
    private String author;
    private String genre;
    private int pages;
    public Book(String id, String title, String author, String genre, int pages, Boolean isAvailable) {
        
        //Anropar super för att kalla in från basklassen LibraryItem
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
    public String toString() {
        return super.toString() + ", Author: " + author + ", Genre: " + genre + ", Pages: " + pages;
    }
}
