package com.techelevator;

public class Candy extends Items {
    public Candy(double price, String brandName, String slotLocation, int quantity, String typeOfSnack) {
        super(price, brandName, slotLocation, quantity, typeOfSnack);
    }


    public String purchaseCandyDisplayMessage = "Munch Munch, Yum!";

    public Candy() {

    }
}
