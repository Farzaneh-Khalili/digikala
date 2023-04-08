package org.example;

public class Product {

    private String name;
    private float price;
    private int quantity;
    private String listOfComments;
    private int ID;
    private String companyOfSeller;
    private int orderedNumber;

    //Getter methods


    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getListOfComments() {
        return listOfComments;
    }

    public int getID() {
        return ID;
    }

    public String getCompanyOfSeller() {
        return companyOfSeller;
    }

    public void setOrderedNumber(int number) {
        this.orderedNumber = orderedNumber;
    }

    public Product(String name, float price, int quantity, String listOfComments, int ID, String companyOfSeller) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.listOfComments = listOfComments;
        this.ID = ID;
        this.companyOfSeller = companyOfSeller;
    }

    @Override
    public String toString() {
        return "Product " +
                "name= " + name  +
                ", price= " + price + "$" +
                ", number of available = " + quantity +
                ", listOfComments= " + listOfComments +
                ", companyOfSeller= " + companyOfSeller;
    }
}
