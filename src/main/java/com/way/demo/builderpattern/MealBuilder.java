package com.way.demo.builderpattern;

public abstract class MealBuilder {
    private Meal meal = new Meal();

    public abstract void buildDrink();

    public abstract void buildFood();

    public Meal getMeal() {
        return meal;
    }
}
