//Daria Korepov - TE23E
//Filen innehåller basklassen för bibliotekets objekt, t.ex. böcker och tidningar. 


package com.slutprojet;

// Klassen innehåller gemensamma variabler och metoder för alla bibliotekobjekt
public class LibraryItem {

    // Gemensamma variabler för alla bibliotekobjekt
    protected String id;
    protected String title;
    protected Boolean isAvailable;

    // Konstruktor för att skapa ett bibliotekobjekt
    public LibraryItem(String id, String title, Boolean isAvailable){
        this.id = id;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    // Getters för alla variabler
    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public Boolean getIsAvailable() {
        return isAvailable;
    }

    //toString metod för att visa information om bibliotekobjektet
    @Override
    public String toString() {
        return "ID: " + this.id + ", Title: " + this.title + ", Available: " + this.isAvailable;
    }
}

