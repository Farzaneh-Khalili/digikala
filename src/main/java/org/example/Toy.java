package org.example;

public class Toy extends Product {

    private int numberOfPlayers;
    private String ageOfPlaying;
    private int timeOfPlaying;
    private String styleOfGame;


    public Toy(String name, float price, int quantity, String listOfComments, int ID,
               String companyOfSeller, String ageOfPlaying, int numberOfPlayers, int timeOfPlaying, String styleOfGame) {
        super(name, price, quantity, listOfComments, ID, companyOfSeller);
        this.numberOfPlayers = numberOfPlayers;
        this.ageOfPlaying = ageOfPlaying;
        this.timeOfPlaying = timeOfPlaying;
        this.styleOfGame = styleOfGame;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name= " + getName()  +
                ", price= " + getPrice() + "$" +
                ", number of available = " + getQuantity() +
                ", comments about it = " + getListOfComments() + "\n" +
                ", Seller= " + getCompanyOfSeller() +
                ", numberOfPlayers= " + numberOfPlayers +
                ", ageOfPlaying= " + ageOfPlaying +
                ", timeOfPlaying= " + timeOfPlaying +
                ", styleOfGame= " + styleOfGame;
    }
}
