package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Inventory {

    private String inventoryFile = "vendingmachine.csv";
    private File inventoryList = new File(inventoryFile);
    private List <Items> items = new ArrayList<>();

    private Map<String, Items>


    public List<Items> getItems() {
        return items;
    }

    private Map<String, Items> itemsMap = new TreeMap<>();

    public Map<String, Items> getItemsMap() {
        return itemsMap;
    }
    public String type;


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
                if(type.equals("chip")) {
                    Chip chip = new Chip();
                    chip.setSlotLocation(menu[0]);
                    chip.setBrandName(menu[1]);
                    chip.setPrice(Double.parseDouble(menu[2]));
                    chip.setTypeOfSnack(menu[3]);
                    chip.setQuantity(5);
                    itemsMap.put(menu[0], chip);
                } else if (type.equals("gum")) {
                    Gum gum = new Gum();
                    gum.setSlotLocation(menu[0]);
                    gum.setBrandName(menu[1]);
                    gum.setPrice(Double.parseDouble(menu[2]));
                    gum.setTypeOfSnack(menu[3]);
                    gum.setQuantity(5);
                    itemsMap.put(menu[0], gum);
                } else if (type.equals("candy")) {
                    Candy candy = new Candy();
                    candy.setSlotLocation(menu[0]);
                    candy.setBrandName(menu[1]);
                    candy.setPrice(Double.parseDouble(menu[2]));
                    candy.setTypeOfSnack(menu[3]);
                    candy.setQuantity(5);
                    itemsMap.put(menu[0], candy);
                } else if (type.equals("drink")) {
                    Drink drink = new Drink();
                    drink.setSlotLocation(menu[0]);
                    drink.setBrandName(menu[1]);
                    drink.setPrice(Double.parseDouble(menu[2]));
                    drink.setTypeOfSnack(menu[3]);
                    drink.setQuantity(5);
                    itemsMap.put(menu[0], drink);
                }


            }
            for (Map.Entry<String, Items> item : itemsMap.entrySet()){
                System.out.println(item.getValue());
            }
            } catch(FileNotFoundException e){
                System.out.println("invalid file");

            }

    }