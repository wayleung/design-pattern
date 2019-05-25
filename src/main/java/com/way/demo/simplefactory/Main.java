package com.way.demo.simplefactory;

public class Main {
    public static void main(String[] args) {
        MouseFactory mouseFactory = new MouseFactory();
        DellMouse dellMouse = (DellMouse) mouseFactory.getMouse(DellMouse.class);
        dellMouse.info();
    }
}
