package com.example.speedsters1_0;

import java.util.ArrayList;
//import Item, Meal, Restaurant

interface CustomerInterface {
	Object PaymentInfo = null;
	ArrayList Favorites = null;
	
//	void addFavorite(Item x);
//	void addFavorite(Meal x);
//	void addFavorite(Reataurant x);
//	void updatePaymentInfo(Payment paymentInfo);
	
}
public class Customer extends Account implements CustomerInterface{

	//Constructor
	public Customer() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}	
//
//	@Override
//	public Object updatePaymentInfo(Payment paymentInfo) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void addFavorite(Item x) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void addFavorite(Meal x) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void addFavorite(Reataurant x) {
//		// TODO Auto-generated method stub
//
//	}

}
