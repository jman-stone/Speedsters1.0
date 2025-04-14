package com.example.speedsters1_0;

import java.util.ArrayList;

	public interface RestaurantInterface {

		String name;
		String cuisineType;
		double lowPrice;
		double highPrice;
		String priceRange = lowPrice + " - " + highPrice;
		ArrayList<Meal> menu;
		double waitTime;

		String updateName(String x);

		String updateCuisine(String cuisine);

		String updatePriceRange(double lowPrice, double highPrice);

		double updateWaitTime(double waitTime);

		void addToMenu(Meal x);

		void removeFromMenu(Meal x);

		Item newItem(String itemName, float price);

		Meal newMeal(Item nextItem);

	}
    public class Restaurant implements RestaurantInterface{
	private String name;
	private String cuisineType;
	private double lowPrice;
	private double highPrice;
	private double waitTime;
	ArrayList<Meal> menu;


	//Constructor
	public Restaurant(String name, String cuisineType, double lowPrice, double highPrice, double waitTime) {
        this.name = name;
        this.cuisineType = cuisineType;
        this.lowPrice = lowPrice;
        this.highPrice = highPrice;
		this.waitTime = waitTime;
        this.menu = new ArrayList<>();
	}

	public String updateName(String newName){
		this.name = newName;
		return name;
	}

	@Override
	public String updateCuisine(String cuisine) {
		this.cuisineType = cuisine;
		return cuisineType;
	}

	@Override
	public String updatePriceRange(double lowPrice, double highPrice) {
        this.lowPrice = lowPrice;
        this.highPrice = highPrice;
		this.priceRange = lowPrice + " - " + highPrice;
		return priceRange;
	}

	@Override
	public double updateWaitTime(double waitTime) {
		this.waitTime = waitTime;
		return waitTime;
	}

	@Override
	public void addToMenu(ArrayList<Meal> menu, Meal meal) {
		menu.add(meal);

	}

	@Override
	public void removeFromMenu(ArrayList<Meal> menu, Meal meal) {
		menu.remove(meal);
	}

	@Override
	public Item newItem(String name, float price) {
		Item newItem = new Item(name, price);
		return newItem;
	}

	@Override
	public Meal newMeal(Item nextItem) {
		Meal meal = new Meal();
		meal.addItem(nextItem);
		return meal;
	}

}
