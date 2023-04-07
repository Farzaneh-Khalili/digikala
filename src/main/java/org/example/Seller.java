package org.example;

import java.util.ArrayList;

public class Seller {

    private String companyName;
    private String password;
    private float wallet;
    private boolean didGetAuthorization;
    private ArrayList<Product> listOfAvailableProducts = new ArrayList<Product>();

    public Seller(String companyName, String password, float wallet, boolean didGetAuthorization) {
        this.companyName = companyName;
        this.password = password;
        this.wallet = wallet;
        this.didGetAuthorization = didGetAuthorization;
    }

    //Setter methods
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setWallet(float wallet) {
        this.wallet = wallet;
    }

    public void setDidGetAuthorization(boolean didGetAuthorization) {
        this.didGetAuthorization = didGetAuthorization;
    }

    public void setListOfAvailableProducts(ArrayList<Product> listOfAvailableProducts) {
        this.listOfAvailableProducts = listOfAvailableProducts;
    }

    public void addToWallet(float newAmount) {
        wallet = getWallet() + ((newAmount * 90)/100) ;
    }

    //Getter methods
    public String getCompanyName() {
        return companyName;
    }

    public String getPassword() {
        return password;
    }

    public float getWallet() {
        return wallet;
    }

    public boolean isDidGetAuthorization() {
        return didGetAuthorization;
    }

    public ArrayList<Product> getListOfAvailableProducts() {
        return listOfAvailableProducts;
    }

    //method to add a new product to list of available products
    public void addToListOfAvailableProducts(Product product) {
        listOfAvailableProducts.add(product);
    }

    public void viewListOfAvailableProducts() {
        boolean existence = false;
        for (int i = 0; i < listOfAvailableProducts.size(); i++) {
            System.out.println(listOfAvailableProducts.get(i).toString());
            System.out.println("\n");
            existence = true;
        }
        if(!existence) {
            System.out.println("You don't have any available product");
        }
    }

    public void addNewWatch(String name, float price, int quantity, String listOfComments, int ID,
                            String companyOfSeller, String isDigital, String brand, String country) {

        Watch newWatch = new Watch(name, price, quantity, listOfComments, ID, companyName, isDigital, brand, country);
        listOfAvailableProducts.add(newWatch);

    }

}
