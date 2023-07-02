package com.techelevator;

public class Drink extends Items {
    public Drink(double price, String brandName, String slotLocation, int quantity, String typeOfSnack) {
        super(price, brandName, slotLocation, quantity, typeOfSnack);
    }



    public String purchaseDrinkDisplayMessage = "Glug Glug, Yum!";

    public Drink() {

    }
}
