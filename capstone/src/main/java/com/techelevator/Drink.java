package com.techelevator;

public class Drink extends Items {
    public Drink(double price, String brandName, String vendingMachineLocation) {
        super(price, brandName, vendingMachineLocation);
    }

    private String purchaseDrinkDisplayMessage = "Glug Glug, Yum!";
}
