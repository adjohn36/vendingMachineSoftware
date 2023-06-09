package com.techelevator;

import java.util.Map;

public class VendingMachine {
    private Map menu;

    public Map getMenu() {
        return menu;
    }

    public void setMenu(Map menu) {
        this.menu = menu;
    }

    public VendingMachine(Map menu){
        this.menu = menu;
    }

}
