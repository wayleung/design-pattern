package com.way.demo.builderpattern;

public class Main {
    public static void main(String[] args) {
        Director director =  new Director();

        MealBuilder mealABuilder = new MealABuilder();

        director.construct(mealABuilder);

        Meal mealA = mealABuilder.getMeal();

        System.out.println(mealA);



        MealBuilder mealBBuilder = new MealBBuilder();

        director.construct(mealBBuilder);

        Meal mealB = mealBBuilder.getMeal();

        System.out.println(mealB);
//
//        MealABuilder mealABuilder = new MealABuilder();
//        MealBBuilder mealBBuilder = new MealBBuilder();
//
//        director.setMealBuilder(mealABuilder);
//
//        director.construct();
//
//
//        director.setMealBuilder(mealBBuilder);
//
//        director.construct();

    }
}
