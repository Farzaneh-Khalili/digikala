package org.example;

import java.util.Date;

public class Order {

    private String date;
    private float totalPrice;
    private String detailsOfBuyer;
    private String detailsOfSeller;

    public Order(String date, float totalPrice, String detailsOfBuyer, String detailsOfSeller) {
        this.date = date;
        this.totalPrice = totalPrice;
        this.detailsOfBuyer = detailsOfBuyer;
        this.detailsOfSeller = detailsOfSeller;
    }

    //Setter method
    public void setDate(String  date) {
        this.date = date;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setDetailsOfBuyer(String detailsOfBuyer) {
        this.detailsOfBuyer = detailsOfBuyer;
    }

    public void setDetailsOfSeller(String detailsOfSeller) {
        this.detailsOfSeller = detailsOfSeller;
    }

    //Getter methods
    public String  getDate() {
        return date;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public String getDetailsOfBuyer() {
        return detailsOfBuyer;
    }

    public String getDetailsOfSeller() {
        return detailsOfSeller;
    }

    @Override
    public String toString() {
        return "Order{" +
                "date=" + date +
                ", total price of your order= " + totalPrice +
                ", details of buyer= '" + detailsOfBuyer + '\'' +
                ", details of seller='" + detailsOfSeller + '\'' +
                '}';
    }
}
