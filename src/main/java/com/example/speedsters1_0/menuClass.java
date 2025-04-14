/*package com.example.speedsters1_0;

shelving this for rn
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//need to write a meal class to perform some of the actions just a blueprint for now
public class MenuClass implements menu {
    private List<Object> mealList;

    // Constructor
    public MenuClass() {
        this.mealList = new ArrayList<>();
    }
    //adds meal to list
    @Override
    public void addMeal(Object meal) {
        mealList.add(meal);

    }
    //deletes meal from list
    @Override
    public void deleteMeal(Object meal) {
        if(mealList.contains(meal)){
            mealList.remove(meal);
        }
        else {
            System.out.println("No meal found");
        }
    }
    //changes things about the meal, not sure if its just the name or if it will be more
    @Override
    public void changeMeal(Object meal) {
        if(mealList.contains(meal)){
            for(int i = 0; i < mealList.size(); i++){
                Object currentMeal = mealList[i];
                if(currentMeal.equals(meal)){
                    //im not sure what to put here yet
                }
            }
            //checks for meal in array then changes its price to a new one
            @Override
            public void changePrice(Object meal, int newPrice) {
                if(mealList.contains(meal)){
                    for(int i = 0; i < mealList.size(); i++){
                        Object currentMeal = mealList[i];
                        if(currentMeal.equals(meal)){
                            currentMeal.price = newPrice;
                        }
                    }
                } else{
                    System.out.println("Meal not found")
                }
            }
        }
 */