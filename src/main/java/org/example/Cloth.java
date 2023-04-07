package org.example;

import java.awt.font.ShapeGraphicAttribute;

public class Cloth extends Product{

    private String color;
    private String size;
    private String brand;
    private String gender;
    private String material;

    public Cloth(String name, float price, int quantity, String listOfComments, int ID
            , String companyOfSeller, String color, String size,String brand, String gender, String material) {
        super(name, price, quantity, listOfComments, ID, companyOfSeller);
        this.color = color;
        this.size = size;
        this.brand = brand;
        this.gender = gender;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Cloth\n" +
                "name= " + getName()  +
                ", price= " + getPrice() + "$" +
                ", number of available = " + getQuantity() +
                ", comments about it = " + getListOfComments() + "\n" +
                ", Seller = " + getCompanyOfSeller() +
                ", color= " + color +
                ", size= " + size +
                ", brand= " + brand +
                ", gender = " + gender +
                ", material= " + material;
    }
}
