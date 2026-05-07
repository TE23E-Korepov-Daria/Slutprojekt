package com.slutprojet;

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

    @Override
    public String getInfo() {
        return "Magazine - ID: " + getId() + ", Title: " + getTitle() + ", Issue Number: " + getIssueNumber() + ", Category: " + getCategory() + ", Published Year: " + getPublicationYear() + ", Available: " + getIsAvailable();
    }
}
