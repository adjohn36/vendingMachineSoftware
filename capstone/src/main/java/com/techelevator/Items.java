package com.techelevator;

import com.techelevator.view.Menu;

public class Items {
    private double price;
    private String name;
    private String vendingMachineLocation;

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getVendingMachineLocation() {// location that user selects to buy item
        return vendingMachineLocation;
    }

    public void setPrice(double price) {// price of item
        this.price = price;
    }

    public void setName(String name) {// name of item
        this.name = name;
    }

    public void setVendingMachineLocation(String vendingMachineLocation) {
        this.vendingMachineLocation = vendingMachineLocation;
    }

    public Items(double price, String name, String vendingMachineLocation) {
        this.price = price;
        this.name = name;
        this.vendingMachineLocation = vendingMachineLocation;
    }


}
