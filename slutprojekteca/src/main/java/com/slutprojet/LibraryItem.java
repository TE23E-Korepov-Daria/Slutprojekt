package com.slutprojet;

/**Basklass för bibliotekets objekt, till exempel böcker och tidningar*/

// Klassen innehåller gemensamma variabler och metoder för alla bibliotekobjekt
public class LibraryItem {
    protected String id;
    protected String title;
    protected String author;
    protected String publicationYear;
    protected Boolean isAvailable;

    // Konstruktor för att skapa ett bibliotekobjekt
    public LibraryItem(String id, String title, String author, String publicationYear, Boolean isAvailable){
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = isAvailable;
    }

    // Getters för alla variabler
    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublicationYear() {
        return publicationYear;
    }
    public Boolean getIsAvailable() {
        return isAvailable;
    }

    //toString metod för att visa information om bibliotekobjektet
    @Override
    public String toString() {
        return "ID: " + this.id + ", Title: " + this.title + ", Author: " + this.author + ", Year: " + this.publicationYear + ", Available: " + this.isAvailable;
    }
}

