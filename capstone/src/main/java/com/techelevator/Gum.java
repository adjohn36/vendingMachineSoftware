package com.techelevator;

public class Gum extends Items {
    public Gum(double price, String brandName, String slotLocation, int quantity, String typeOfSnack) {
        super(price, brandName, slotLocation, quantity, typeOfSnack);
    }

    public Gum() {

    }

    public String purchaseGumDisplayMessage = "Chew Chew, Yum!";
}
