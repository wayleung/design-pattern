package com.way.demo.builderpattern;

public class MealABuilder extends MealBuilder{
    public void buildDrink() {
//        System.out.println("coke");
        getMeal().setDrink("coke");
    }

    public void buildFood() {
//        System.out.println("chicken");
        getMeal().setFood("chicken");
    }


}
