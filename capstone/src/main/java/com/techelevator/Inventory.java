package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Inventory {


    private String inventoryFile = "vendingmachine.csv";
    private File inventoryList = new File(inventoryFile);
    private List <Items> items = new ArrayList<>();
    private Map<String, Items> itemsMap = new TreeMap<>();


    public void scanInventory() {
        try (Scanner inventoryMenu = new Scanner(inventoryList)) {
            while (inventoryMenu.hasNextLine()) {
                String list = inventoryMenu.nextLine();
                String[] menu = list.split("\\|");
                String type = menu[3].toLowerCase();
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
}