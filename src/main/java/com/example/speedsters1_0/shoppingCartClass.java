package com.example.speedsters1_0;

import java.util.ArrayList;
import java.util.List;
public class ShoppingCart implements shoppingCart {
    private List<Object> cart;
    //need some way to store past orders

    public ShoppingCartClass() {
        this.cart = new ArrayList<>();
    }
    @Override
    public void addItem(Object item) {
        cart.add(item);
    }
    //for now it only checks one but maybe change for later to check all or multiple at a time
    // need to write item class to be able to get all the variables to display
    @Override
    public void checkFoodInfo(Object item) {
        if(cart.contains(item)){
            System.out.println(item + " price: " + item.price);
            System.out.println(item + " calories: " + item.calories);
            //example of variables can add more
        } else {
            System.out.println("No item found")
        }
    }

    @Override
    public void removeItem(Object item) {
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
