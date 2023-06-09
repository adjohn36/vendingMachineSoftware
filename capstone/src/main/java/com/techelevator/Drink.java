package com.techelevator;

public class Drink extends Items {
    public Drink(double price, String name, String vendingMachineLocation) {
        super(price, name, vendingMachineLocation);
    }

    private String purchaseDrinkDisplayMessage = "Glug Glug, Yum!";
}
