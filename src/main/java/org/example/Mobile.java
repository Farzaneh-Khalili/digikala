package org.example;

public class Mobile extends Product {

    private String brand;
    private int memory;
    private int storage;
    private int sizing;
    private String color;


    public Mobile(String name, float price, int quantity, String listOfComments,
                  int ID, String companyOfSeller, String brand, int memory, int storage, int sizing, String color) {
        super(name, price, quantity, listOfComments, ID, companyOfSeller);
        this.brand = brand;
        this.memory = memory;
        this.storage = storage;
        this.sizing = sizing;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mobile\n" +
                "name= " + getName()  +
                ", price= " + getPrice() + "$" +
                ", number of available = " + getQuantity() +
                ", comments about it = " + getListOfComments() + "\n" +
                ", Seller= " + getCompanyOfSeller() +
                ", brand= " + brand +
                ", memory= " + memory +
                ", storage= " + storage +
                ", sizing= " + sizing +
                ", color= " + color ;
    }
}
