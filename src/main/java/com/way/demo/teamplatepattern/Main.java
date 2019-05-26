package com.way.demo.teamplatepattern;

public class Main {
    public static void main(String[] args) {
        Restaurant waiter = new Restaurant();
        waiter.addRiceForCustomer(new Customer() {

            @Override
            public void before() {
                System.out.println("喊服务员");
            }

            @Override
            public void after() {
                super.after();
            }

            @Override
            public void addRice() {
                System.out.println("盛了一锅米饭");
            }
        });
    }
}
