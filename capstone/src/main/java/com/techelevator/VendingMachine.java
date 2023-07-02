package com.techelevator;


import com.techelevator.view.Menu;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Scanner;
import com.techelevator.Items;



public class VendingMachine {


    //call inventory
    //TODO add a inventory property here - vending machine has an inventory

    private String type;
    public Gum gum = new Gum();
    public Chip chip = new Chip();
    public Candy candy = new Candy();
    public Drink drink = new Drink();
    public double balance;
    public double feedMoneyDollarAmount;
    public Items items = new Items();


    private Menu menu;
    public double getBalance(double balance){
        balance = balance + feedMoneyDollarAmount;
        return balance;
    }

    public double getFeedMoneyDollarAmount() {
        return feedMoneyDollarAmount;
    }

    public void setFeedMoneyDollarAmount(Double feedMoneyDollarAmount) {
        this.feedMoneyDollarAmount = feedMoneyDollarAmount;
    }

    public VendingMachine() {

    }

    private Scanner feedMoneyScanner = new Scanner(System.in);
    private Scanner purchaseChoiceScanner = new Scanner(System.in);


    //feed money
    public double addMoney() {
        System.out.println("Please enter a dollar amount: ");
        String feedMoneyAmount = feedMoneyScanner.nextLine();
        double feedMoneyDollarAmount = Double.parseDouble(feedMoneyAmount);
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
                items.getTypeOfSnack();
            if (items.getTypeOfSnack().equals("Gum")) {
                System.out.println(gum.purchaseGumDisplayMessage);

            } else if (items.getTypeOfSnack().equals("Chip")) {
                System.out.println(chip.purchaseChipDisplayMessage);

            } else if (items.getTypeOfSnack().equals("Candy")) {
                System.out.println(candy.purchaseCandyDisplayMessage);
            } else if (items.getTypeOfSnack().equals("Drink")) {
                System.out.println(drink.purchaseDrinkDisplayMessage);

            }else {
                exitMessage();
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
