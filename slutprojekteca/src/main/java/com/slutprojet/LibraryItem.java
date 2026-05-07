package com.slutprojet;

/**Basklass för bibliotekets objekt, till exempel böcker och tidningar*/

public class LibraryItem {
    private int id;
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;

    public LibraryItem(int id, String title, boolean isAvailable){
        this.id = id;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public boolean getIsAvailable() {
        return isAvailable;
    }
    public String getInfo() {
        return "ID: " + id + ", Title: " + title + ", Available: " + isAvailable;
    }
}

