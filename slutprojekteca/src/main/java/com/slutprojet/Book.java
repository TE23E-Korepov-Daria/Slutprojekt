//Daria Korepov - TE23E
//Denna klass representerar en bok i biblioteket och ärver från basklassen LibraryItem. 
// Den innehåller specifika attribut för en bok, såsom författare, genre och antal sidor. Konstruktorn anropar super för att initiera de gemensamma attributen från LibraryItem, och sedan initierar den de specifika attributen för en bok. Det finns också getter-metoder för att hämta information om boken, samt en toString-metod som returnerar en strängrepresentation av boken inklusive dess specifika attribut.

package com.slutprojet;

public class Book extends LibraryItem {

    //Specifika attribut/variabler för en bok
    private String author;
    private String genre;
    private int pages;

    //Konstruktor som tar emot alla attribut, inklusive de som ärvs från LibraryItem
    public Book(String id, String title, String author, String genre, int pages, Boolean isAvailable) {
        
        //Anropar super för att kalla in från basklassen LibraryItem
        super(id, title, isAvailable);

        this.author = author;
        this.genre = genre;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return super.toString() + ", Author: " + author + ", Genre: " + genre + ", Pages: " + pages;
    }
}
