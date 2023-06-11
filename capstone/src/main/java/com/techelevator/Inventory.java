package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {

    private String inventoryFile = "vendingmachine.csv";
    private File inventoryList = new File(inventoryFile);
    private List <Items> items = new ArrayList<>();
    private Map<String, Items>


    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public String getSlotLocation() {
        return slotLocation;
    }

    public void setSlotLocation(String slotLocation) {
        this.slotLocation = slotLocation;
    }

    public void scanInventory() {
        try (Scanner inventoryScanner = new Scanner(inventoryList)) {
            while (inventoryScanner.hasNextLine()) {
                String list = inventoryScanner.nextLine();
                String[] menu = list.split("\\|");
                String type = menu[3].toLowerCase();
                items.setSlotLocation(menu[0]);
                items.setBrandName(menu[1]);
                items.setPrice(Double.parseDouble(menu[2]));
                items.setTypeOfSnack(menu[3]);
                items.setQuantity(5);
                items.add(item);
                for (Items item : items) {
                    System.out.println(item.getSlotLocation() + " " + item.getBrandName() + " " + item.getPrice() + " " + item.getTypeOfSnack() + " " + item.getQuantity());
                }
            }

            } catch(FileNotFoundException e){
                System.out.println("invalid file");

            }

    }
}