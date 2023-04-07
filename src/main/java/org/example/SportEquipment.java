package org.example;

public class SportEquipment extends Product {

    private String brand;
    private String nameOfSport;
    private String color;
    private String country;

    public SportEquipment(String name, float price, int quantity, String listOfComments, int ID,
                          String companyOfSeller, String brand, String nameOfSport, String color, String country) {
        super(name, price, quantity, listOfComments, ID, companyOfSeller);
        this.brand = brand;
        this.nameOfSport = nameOfSport;
        this.color = color;
        this.country = country;
    }

    @Override
    public String toString() {
        return "SportEquipment{" +
                "name= " + getName()  +
                ", price= " + getPrice() + "$" +
                ", number of available = " + getQuantity() +
                ", comments about it = " + getListOfComments() + "\n" +
                ", Seller= " + getCompanyOfSeller() +
                ", brand= " + brand +
                ", nameOfSport= " + nameOfSport +
                ", color= " + color +
                ", country= " + country;
    }
}
