package org.example;

public class Rug extends Product {

    private String pattern;
    private String country;
    private int numberOfKnots;
    private String isHandmade;

    public Rug(String name, float price, int quantity, String listOfComments, int ID,
               String companyOfSeller, String pattern, String country, int numberOfKnots, String isHandmade) {
        super(name, price, quantity, listOfComments, ID, companyOfSeller);
        this.pattern = pattern;
        this.country = country;
        this.numberOfKnots = numberOfKnots;
        this.isHandmade = isHandmade;
    }

    @Override
    public String toString() {
        return "Rug\n" +
                "name= " + getName()  +
                ", price= " + getPrice() + "$" +
                ", number of available = " + getQuantity() +
                ", comments about it = " + getListOfComments() + "\n" +
                ", Seller= " + getCompanyOfSeller() +
                ", pattern= " + pattern +
                ", country= " + country +
                ", numberOfKnots= " + numberOfKnots +
                ", isHandmade= " + isHandmade;
    }
}
