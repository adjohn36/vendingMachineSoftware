package com.techelevator;

public class Candy extends Items {
    public Candy(double price, String name, String vendingMachineLocation) {
        super(price, name, vendingMachineLocation);
    }

    private String purchaseCandyDisplayMessage = "Munch Munch, Yum!";
}
