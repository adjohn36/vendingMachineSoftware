package com.techelevator;

import com.techelevator.view.Menu;
import com.techelevator.Inventory;
import com.techelevator.VendingMachine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Member;
import java.util.Scanner;

public class VendingMachineCLI {
	public VendingMachine vendingMachine = new VendingMachine();


	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT};
	private final String PURCHASE_OPTION_DISPLAY_CURRENT_MONEY_PROVIDED = "Current Money Provided: ";//
	private static final String PURCHASE_OPTION_FEED_MONEY = "Feed Money";//
	private static final String PURCHASE_OPTION_SELECT_PRODUCT = "Select Product";//
	private static final String PURCHASE_OPTION_FINISH_TRANSACTION = "Finish Transaction";//
	private static final String[] PURCHASE_OPTIONS = {PURCHASE_OPTION_FEED_MONEY, PURCHASE_OPTION_SELECT_PRODUCT, PURCHASE_OPTION_FINISH_TRANSACTION};
	private static final String MAIN_MENU_ITEM_LIST = "Display vending machine list";
	private Menu menu;


	public Inventory inventory = new Inventory();



	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}


	public void run() {
		vendingMachine.welcomeMessage();
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				inventory.scanInventory();
				System.out.println();

			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				System.out.println(PURCHASE_OPTIONS);
				while (true) {
					String purchase = (String) menu.getChoiceFromOptions(PURCHASE_OPTIONS);

					if (choice.equals(PURCHASE_OPTION_FEED_MONEY)) {

							 System.out.println("Insert Money: ");
							 vendingMachine.addMoney();




							}

							System.out.println(PURCHASE_OPTION_DISPLAY_CURRENT_MONEY_PROVIDED);
						}
					}
				}

			}


		public static void main (String[]args){
			Menu menu = new Menu(System.in, System.out);
			VendingMachineCLI cli = new VendingMachineCLI(menu);
			cli.run();
		}



	}

