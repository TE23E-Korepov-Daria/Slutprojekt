package com.slutprojet;

/** KLassen Magazine representerar en tidning i bibliotekssystemet */

public class Magazine extends LibraryItem {
    private int issueNumber;
    private String category;
    private int publicationYear;

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
