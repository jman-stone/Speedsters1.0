package com.example.speedsters1_0;

public interface ShoppingCartInterface {
    void addItem(Item item);

    //for now it only checks one but maybe change for later to check all or multiple at a time
    // need to write item class to be able to get all the variables to dis
    void checkFoodInfo(Item item);

    void removeItem(Item item);

    //void addItem(Object item);
    //void checkFoodInfo(Object item);
    //void removeItem(Object item);
    void checkPastOrders();
    void placeOrder();
}
