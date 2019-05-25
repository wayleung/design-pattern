package com.way.demo.simplefactory;

public class Main {
    public static void main(String[] args) {
        MouseFactory mouseFactory = new MouseFactory();
        Mouse dellMouse =  mouseFactory.getMouse(DellMouse.class);
        dellMouse.info();
    }
}
