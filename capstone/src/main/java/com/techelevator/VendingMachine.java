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


    private Menu menu;

    public Double getFeedMoneyDollarAmount() {
        return feedMoneyDollarAmount;
    }

    public void setFeedMoneyDollarAmount(Double feedMoneyDollarAmount) {
        this.feedMoneyDollarAmount = feedMoneyDollarAmount;
    }

    public VendingMachine() {

    }

    private Scanner feedMoneyScanner = new Scanner(System.in);


    //feed money
    public double addMoney() {
        System.out.println("Please enter a dollar amount: ");
        String feedMoneyAmount = feedMoneyScanner.nextLine();
        Double feedMoneyDollarAmount = Double.parseDouble(feedMoneyAmount);
        balance = balance + feedMoneyDollarAmount;
        try {
            Double.parseDouble(feedMoneyAmount);
        }catch (NumberFormatException e){
            if (feedMoneyAmount.isBlank()){
                return -1;
            }else{
                System.out.println("Please enter a dollar amount: ");
            }
        }

        System.out.println("Current Money Provided: " + balance);
        return balance;
    }

    public void getChange() {

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
        public void welcomeMessage(){
            System.out.println("Hello, I'm the Vendo-Matic 800.  What can I do for you?");
        }
        public void exitMessage(){
        System.out.println("Thank you for using the Vendo-Matic 800.  Good bye!");
    }


}
