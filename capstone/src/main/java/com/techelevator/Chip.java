package com.techelevator;

public class Chip extends Items{
    public Chip(double price, String brandName, String slotLocation, int quantity, String typeOfSnack) {
        super(price, brandName, slotLocation, quantity, typeOfSnack);
    }

    public Chip(){

    }

    private String purchaseChipDisplayMessage = "Crunch Crunch, Yum!";

}
