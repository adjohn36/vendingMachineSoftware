package com.techelevator;

public class Candy extends Items {
    public Candy(double price, String brandName, String vendingMachineLocation) {
        super(price, brandName, vendingMachineLocation);
    }

    private String purchaseCandyDisplayMessage = "Munch Munch, Yum!";
}
