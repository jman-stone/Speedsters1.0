package com.example.speedsters1_0;

import java.util.ArrayList;
//import Item, Meal, Restaurant

interface CustomerInterface {
	Payment PaymentInfo;
	ArrayList<Item> favoriteItems;
	ArrayList<Restaurant> favoriteRestaraunts;
	
	void addFavorite(Item x);

	void addFavorite(Restaurant x);
	void removeFavorite(Item x);
	void removeFavorite(Restaurant x);
	void updatePaymentInfo(Payment paymentInfo);
	
}
public class Customer extends Account implements CustomerInterface{
	Payment paymentInfo;
	ArrayList<Item> favoriteItems;
	ArrayList<Restaurant> favoriteRestaraunts;
	//Constructor
	//fill out payment later
	public Customer() {
		this.paymentInfo = Payment();
		this.favoriteItems = new ArrayList<>();
		this.favoriteRestaraunts = new ArrayList<>();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}	

	@Override
	public Payment updatePaymentInfo(Payment paymentInfo) {
		this.paymentInfo = paymentInfo;
		return paymentInfo;
	}

	@Override
	public void addFavorite(Item x) {
		favoriteItems.add(x);

	}

	@Override
	public void addFavorite(Restaurant x) {
		favoriteRestaraunts.add(x);
	}
	@Override
	public void removeFavorite(Item x){
		favoriteItems.remove(x);
	}
	@Override
	public void removeFavorite(Restaurant x){
		favoriteRestaraunts.remove(x);
	}

}
