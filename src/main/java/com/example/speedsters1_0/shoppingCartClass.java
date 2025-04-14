package com.example.speedsters1_0;

import java.util.ArrayList;
public class ShoppingCart implements shoppingCart {
    private ArrayList<Item> cart;
    //need some way to store past orders

    public ShoppingCartClass() {
        this.cart = new ArrayList<>();
    }
    @Override
    public void addItem(Item item) {
        cart.add(item);
    }
    //for now it only checks one but maybe change for later to check all or multiple at a time
    // need to write item class to be able to get all the variables to dis
    @Override
    public void checkFoodInfo(Item item) {
        if(cart.contains(item)){
            System.out.println(item.itemName + " price: " + item.itemPrice);
            System.out.println(item.itemName + " description: " + item.foodDescription);
            //example of variables can add more
        } else {
            System.out.println("No item found")
        }
    }

    @Override
    public void removeItem(Item item) {
        if(cart.contains(item)){
            cart.remove(item);
        }
        else {
            System.out.println("No item found");
        }
    }
    //need some way to store and save past orders for this method
    @Override
    public void checkPastOrders() {

    }

}
