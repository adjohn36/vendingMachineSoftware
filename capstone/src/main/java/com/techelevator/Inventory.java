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
    private Drink drink = new Drink();
    private Candy candy = new Candy();
    private Chip chip = new Chip();
    private Gum gum = new Gum();


    public void scanInventory() {
        try (Scanner inventoryMenu = new Scanner(inventoryList)) {
            while (inventoryMenu.hasNextLine()) {
                String list = inventoryMenu.nextLine();
                String[] menu = list.split("\\|");
                String type = menu[3].toLowerCase();
 //               if()
   //             item.setSlotLocation(menu[0]);
     //           item.setBrandName(menu[1]);
       //         item.setPrice(Double.parseDouble(menu[2]));
         //       item.setTypeOfSnack(menu[3]);
           //     item.setQuantity(5);
             //   items.add(item);
                for(Items item : items) {
                    System.out.println(item.getSlotLocation() + " " + item.getBrandName() + " " + item.getPrice() + " " + item.getTypeOfSnack() + " " + item.getQuantity());
                }
                }


            } catch(FileNotFoundException e){
                System.out.println("invalid file");


            }

    }
}