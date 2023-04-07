package org.example;

public class Shoes extends Product {

    private String country;
    private String color;
    private int size;
    private String material;

    public Shoes(String name, float price, int quantity, String listOfComments, int ID,
                 String companyOfSeller, String country, String color, int size, String material) {
        super(name, price, quantity, listOfComments, ID, companyOfSeller);
        this.country = country;
        this.color = color;
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Shoes " +
                "name= " + getName()  +
                ", price= " + getPrice() + "$" +
                ", number of available = " + getQuantity() +
                ", comments about it = " + getListOfComments() + "\n" +
                ", Seller= " + getCompanyOfSeller() +
                ", country= " + country +
                ", color= " + color +
                ", size= " + size +
                ", material= " + material;
    }
}
