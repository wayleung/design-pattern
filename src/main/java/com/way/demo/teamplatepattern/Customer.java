package com.way.demo.teamplatepattern;

public abstract class Customer {

    public void teamplateMethod(){
        before();
        addRice();
        after();
    }

    public void before() {
    }

    public void after() {
        System.out.println("拿到饭 拿筷子 吃饭");
    }

    public abstract void addRice();


}
