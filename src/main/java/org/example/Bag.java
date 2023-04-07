package org.example;

public class Bag extends Product {

    private String brand;
    private String color;
    private String materials;
    private int size;
    private String howToClose;

    public Bag(String name, float price, int quantity, String listOfComments, int ID,
               String companyOfSeller, String brand, String color, String materials, String howToClose, int size) {
        super(name, price, quantity, listOfComments, ID, companyOfSeller);
        this.brand = brand;
        this.color = color;
        this.howToClose = howToClose;
        this.size = size;
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "Bag \n" +
                "name= " + getName()  +
                ", price= " + getPrice() + "$" +
                ", number of available = " + getQuantity() +
                ", comments about it = " + getListOfComments() + "\n" +
                ", Seller= " + getCompanyOfSeller() +
                ", brand= " + brand +
                ", color= " + color +
                ", materials= " + materials +
                ", size= " + size +
                ", howToClose= " + howToClose;
    }
}
