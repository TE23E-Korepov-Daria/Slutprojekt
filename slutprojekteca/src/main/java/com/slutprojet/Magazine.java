package com.slutprojet;

/**KLassen Magazine representerar en tidning i bibliotekssystemet */

public class Magazine extends LibraryItem {
    private int issueNumber;
    private String category;
    private int publicationYear;

    public Magazine(int id, String title, int issueNumber, String category, int publicationYear, boolean isAvailable) {
        super(id, title, isAvailable);
        this.issueNumber = issueNumber;
        this.category = category;
        this.publicationYear = publicationYear;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
    
    public String getCategory() {
        return category;
    }
    public int getPublicationYear() {
        return publicationYear;
    }

    
}
