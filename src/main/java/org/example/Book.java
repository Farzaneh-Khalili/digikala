package org.example;

public class Book extends Product {

    private String author;
    private int releaseYear;
    private int numberOfVolumes;
    private String genre;
    private int numberOfPages;
    private String readingAge;

    public Book(String name, float price, int quantity, String listOfComments, int ID, String companyOfSeller,
                String author, int releaseYear, int numberOfVolumes, String genre, int numberOfPages, String readingAge) {
        super(name, price, quantity, listOfComments, ID, companyOfSeller);
        this.author = author;
        this.releaseYear = releaseYear;
        this.numberOfVolumes = numberOfVolumes;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.readingAge = readingAge;
    }

    @Override
    public String toString() {
        return "Book" +
                "name=" + getName()  +
                ", price=" + getPrice() + "$" +
                ", number of available =" + getQuantity() +
                ", comments about it ='" + getListOfComments() + "\n" +
                ", Seller=" + getCompanyOfSeller() +
                ", author=" + author +
                ", releaseYear=" + releaseYear +
                ", numberOfVolumes=" + numberOfVolumes +
                ", genre=" + genre +
                ", numberOfPages=" + numberOfPages +
                ", readingAge=" + readingAge ;
    }
}
