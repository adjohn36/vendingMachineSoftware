package com.techelevator;


import com.techelevator.view.Menu;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine {


    //call inventory
    //TODO add a inventory property here - vending machine has an inventory
    public Inventory inventory = new Inventory();
    private String type;
    public Gum gum = new Gum();
    private Double balance = 0.00;
    public Double feedMoneyDollarAmount = 0.00;

    public Double getFeedMoneyDollarAmount() {
        return feedMoneyDollarAmount;
    }

    public void setFeedMoneyDollarAmount(Double feedMoneyDollarAmount) {
        this.feedMoneyDollarAmount = feedMoneyDollarAmount;
    }

    public VendingMachine() {
        inventory.scanInventory();
    }

    public Scanner feedMoneyScanner = new Scanner(System.in);


    //feed money
    public Double addMoney() {
        String feedMoneyAmount = feedMoneyScanner.nextLine();
        Double feedMoneyDollarAmount = Double.parseDouble(feedMoneyAmount);
        while (feedMoneyScanner.hasNextLine()) {
            return feedMoneyDollarAmount;


        }
        return feedMoneyDollarAmount;

    }
        //dispense food - print out message


        public void eatMessage () {

            if (type.equals("gum")) {
                System.out.println("Chew Chew, Yum!");

            } else if (type.equals("chip")) {
                System.out.println("Crunch Crunch, Yum!");

            } else if (type.equals("candy")) {
                System.out.println("Munch Munch, Yum!");
            } else if (type.equals("drink")) {
                System.out.println("Glug Glug, Yum!");

            }
        }


        //dispense change


}
