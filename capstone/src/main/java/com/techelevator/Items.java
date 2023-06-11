package com.techelevator;

import com.techelevator.view.Menu;

public abstract class Items {
    private double price;
    private String brandName;
    private String slotLocation;
    private int quantity = 5;
    private String typeOfSnack;

    public Items(){

    }

    public String getTypeOfSnack() {
        return typeOfSnack;
    }

    public void setTypeOfSnack(String typeOfSnack) {
        this.typeOfSnack = typeOfSnack;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getSlotLocation() {// location that user selects to buy item
        return slotLocation;
    }

    public void setPrice(double price) {// price of item
        this.price = price;
    }

    public void setBrandName(String name) {// name of item
        this.brandName = name;
    }

    public void setSlotLocation(String slotLocation) {
        this.slotLocation = slotLocation;
    }

    public Items(double price, String name, String slotLocation, int quantity, String typeOfSnack) {
        this.price = price;
        this.brandName = name;
        this.slotLocation = slotLocation;
        this.quantity = quantity;
        this.typeOfSnack = typeOfSnack;
    }


    @Override
    public String toString() {
        return getSlotLocation() + " - " + getBrandName() + " - " + getPrice();
    }
}
