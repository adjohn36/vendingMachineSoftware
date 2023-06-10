package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Inventory {


    private String inventoryFile = "vendingmachine.csv";
    private File inventoryList = new File(inventoryFile);
    private Scanner inventoryMenu;//

    public Scanner getInventoryMenu() {//
        return inventoryMenu;
    }


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