package com.way.demo.builderpattern;

public class MealBBuilder extends MealBuilder{
    public void buildDrink() {
//        System.out.println("sprit");
        getMeal().setDrink("sprit");
    }

    public void buildFood() {
//        System.out.println("chips");
        getMeal().setFood("chips");
    }
}
