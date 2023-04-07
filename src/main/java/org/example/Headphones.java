package org.example;

public class Headphones extends Product {

    private String brand;
    private String color;
    private String connection;
    private String doesHaveNC;

    public Headphones(String name, float price, int quantity, String listOfComments, int ID,
                      String companyOfSeller, String brand, String color, String connection, String doesHaveNC) {
        super(name, price, quantity, listOfComments, ID, companyOfSeller);
        this.brand = brand;
        this.color = color;
        this.connection = connection;
        this.doesHaveNC = doesHaveNC;
    }

    @Override
    public String toString() {
        return "Headphones \n" +
                "name= " + getName()  +
                ", price= " + getPrice() + "$" +
                ", number of available = " + getQuantity() +
                ", comments about it = " + getListOfComments() + "\n" +
                ", Seller= " + getCompanyOfSeller() +
                ", brand= " + brand +
                ", color= " + color+
                ", connection= " + connection +
                ", doesHaveNC= " + doesHaveNC;
    }
}
