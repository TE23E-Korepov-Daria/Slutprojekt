package com.slutprojet;

/**Basklass för bibliotekets objekt, till exempel böcker och tidningar*/

// Klassen innehåller gemensamma variabler och metoder för alla bibliotekobjekt
public class LibraryItem {
    protected int id;
    protected String title;
    protected String author;
    protected int publicationYear;
    protected boolean isAvailable;

    // Konstruktor för att skapa ett bibliotekobjekt
    public LibraryItem(int id, String title, String author, int publicationYear, boolean isAvailable){
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = isAvailable;
    }

    // Getters för alla variabler
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public boolean getIsAvailable() {
        return isAvailable;
    }

    //toString metod för att visa information om bibliotekobjektet
    @Override
    public String toString() {
        return "ID: " + this.id + ", Title: " + this.title + ", Author: " + this.author + ", Year: " + this.publicationYear + ", Available: " + this.isAvailable;
    }
}

