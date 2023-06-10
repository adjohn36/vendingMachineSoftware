package com.techelevator;

public class Gum extends Items {
    public Gum(double price, String brandName, String slotLocation, int quantity, String typeOfSnack) {
        super(price, brandName, slotLocation, quantity, typeOfSnack);
    }

    public Gum() {

    }

    private String purchaseGumDisplayMessage = "Chew Chew, Yum!";
}
