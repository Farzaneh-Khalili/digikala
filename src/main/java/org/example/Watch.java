package org.example;

public class Watch extends Product {
    private String isDigital;
    private String brand;
    private String country;

    public Watch(String name, float price, int quantity, String listOfComments, int ID, String companyOfSeller, String isDigital, String brand, String country) {
        super(name, price, quantity, listOfComments, ID, companyOfSeller);
        this.isDigital = isDigital;
        this.brand = brand;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Watch\n" +
                "name=" + getName()  +
                ", price=" + getPrice() + "$" +
                ", number of available =" + getQuantity() +
                ", comments about it =" + getListOfComments() + "\n" +
                ", Seller=" + getCompanyOfSeller() +
                ", is it Digital =" + isDigital +
                ", brand=" + brand +
                ", country=" + country;
    }
}
