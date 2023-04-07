package org.example;

public class Painting extends Product {

    private String painter;
    private int size;
    private String country;
    private String paintingStyle;

    public Painting(String name, float price, int quantity, String listOfComments, int ID,
                    String companyOfSeller, String painter, int size, String country, String paintingStyle) {
        super(name, price, quantity, listOfComments, ID, companyOfSeller);
        this.painter = painter;
        this.size = size;
        this.country = country;
        this.paintingStyle = paintingStyle;
    }

    @Override
    public String toString() {
        return "Painting\n" +
                "name= " + getName()  +
                ", price= " + getPrice() + "$" +
                ", number of available = " + getQuantity() +
                ", comments about it = " + getListOfComments() + "\n" +
                ", Seller= " + getCompanyOfSeller() +
                ", painter= " + painter +
                ", size= " + size +
                ", country= " + country +
                ", paintingStyle= " + paintingStyle;
    }
}
