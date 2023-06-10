package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Inventory {


    String inventoryFile = "vendingmachine.csv";
    File inventoryList = new File(inventoryFile);

    public void scanInventory() {
        try (Scanner inventoryMenu = new Scanner(inventoryList)) {
            while (inventoryMenu.hasNextLine()) {
                String list = inventoryMenu.nextLine();
            }
            } catch(FileNotFoundException e){
                System.out.println("invalid file");


            }
    }
}