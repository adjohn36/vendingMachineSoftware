package com.techelevator;

public class Drink extends Items {
    public Drink(double price, String brandName, String slotLocation, int quantity) {
        super(price, brandName, slotLocation, quantity);
    }

    private String purchaseDrinkDisplayMessage = "Glug Glug, Yum!";
}
