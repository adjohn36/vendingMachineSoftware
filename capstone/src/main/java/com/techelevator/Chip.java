package com.techelevator;

public class Chip extends Items{
    public Chip(double price, String brandName, String slotLocation, int quantity, String typeOfSnack) {
        super(price, brandName, slotLocation, quantity, typeOfSnack);
    }


    public String purchaseChipDisplayMessage = "Crunch Crunch, Yum!";

    public Chip() {

    }

    //   @Override
   // public String toString() {
     //   return getSlotLocation() + " - " + getBrandName() + " - " + getPrice();
    //}
}
