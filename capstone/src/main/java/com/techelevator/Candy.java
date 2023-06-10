package com.techelevator;

public class Candy extends Items {
    public Candy(double price, String brandName, String slotLocation, int quantity) {
        super(price, brandName, slotLocation, quantity);
    }

    private String purchaseCandyDisplayMessage = "Munch Munch, Yum!";
}
