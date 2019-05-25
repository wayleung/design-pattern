package com.way.demo.builderpattern;

public class Director {
    public void construct(MealBuilder mealBuilder) {

        mealBuilder.buildDrink();
        mealBuilder.buildFood();
    }


}
