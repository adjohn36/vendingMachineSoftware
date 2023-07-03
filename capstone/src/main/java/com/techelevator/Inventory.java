package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.*;

public class Inventory {

    private VendingMachine vendingMachine = new VendingMachine();


    private String inventoryFile = "vendingmachine.csv";
    private File inventoryList = new File(inventoryFile);
    private List<Items> items = new ArrayList<>();

    private Map<String, Items> itemsMap = new TreeMap<>();

    public Map<String, Items> getItemsMap() {
        return itemsMap;
    }

    private Scanner purchaseChoiceScanner = new Scanner(System.in);

    public String type;
    public double balance = vendingMachine.getBalance();

    public void transaction(){
        scanInventory();
        System.out.println("Current Money Provided: " + balance);



        System.out.println("Please enter a Slot Location to purchase: ");
        String purchaseChoice = purchaseChoiceScanner.nextLine().toUpperCase(Locale.ROOT);
        if (itemsMap.containsKey(purchaseChoice)) {
            Items item = new Items();
            item.setSlotLocation(itemsMap.get(purchaseChoice).getSlotLocation());
            item.setQuantity(itemsMap.get(purchaseChoice).getQuantity());
            item.setBrandName(itemsMap.get(purchaseChoice).getBrandName());
            item.setPrice(itemsMap.get(purchaseChoice).getPrice());
            item.setTypeOfSnack(itemsMap.get(purchaseChoice).getTypeOfSnack());
            System.out.println(itemsMap.get(purchaseChoice));
            double change = balance - item.getPrice();
            if (balance >= item.getPrice()) {
                System.out.println("Thank you for your purchase");
                if (item.getTypeOfSnack().equals("Gum")) {
                    System.out.println("Chew Chew, Yum!");
                }
                if (item.getTypeOfSnack().equals("Chip")) {
                    System.out.println("Crunch Crunch, Yum!");
                }
                if (itemsMap.get(purchaseChoice).getTypeOfSnack().equals("Candy")) {
                    System.out.println("Munch Munch, Yum!");
                }
                if (itemsMap.get(purchaseChoice).getTypeOfSnack().equals("Drink")) {
                    System.out.println("Glug Glug, Yum!");
                }
                System.out.println("Your change is: " + change);
            }
            else{
                System.out.println("Insufficient funds.  Please insert money to complete transaction.");
            }

        }


    }


    public void scanInventory() {
        try (Scanner inventoryScanner = new Scanner(inventoryList)) {
            while (inventoryScanner.hasNextLine()) {
                String list = inventoryScanner.nextLine();
                String[] menu = list.split("\\|");
                String type = menu[3].toLowerCase();
                if (type.equals("chip")) {
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
            for (Map.Entry<String, Items> item : itemsMap.entrySet()) {
                System.out.println(item.getValue());
            }

        } catch (FileNotFoundException e) {
            System.out.println("invalid file");

        }
    }
}