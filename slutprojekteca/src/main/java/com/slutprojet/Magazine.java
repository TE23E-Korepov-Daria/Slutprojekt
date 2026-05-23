//Daria Korepov - TE23E
//Filen innehåller en barnklass Magazine som ärver från LibraryItem och representerar en tidning i bibliotekssystemet. 
//Den har ytterligare attribut som issueNumber, category och publicationYear, samt en toString-metod som returnerar en strängrepresentation av tidningen.

package com.slutprojet;

public class Magazine extends LibraryItem {

    //Magazines specifika attribut/variabler
    private int issueNumber;
    private String category;
    private int publicationYear;

    //Konstruktor för Magazine som tar emot alla nödvändiga parametrar inklusive de som ärvs från LibraryItem
    public Magazine(String id, String title, Boolean isAvailable, int issueNumber, String category,
            int publicationYear) {

        // Anropar superklassens konstruktor för att initiera id, title och isAvailable
        super(id, title, isAvailable);

        this.issueNumber = issueNumber;
        this.category = category;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return super.toString() + ", Issue Number: " + issueNumber + ", Category: " + category + ", Publication Year: "
                + publicationYear;

    }
}
