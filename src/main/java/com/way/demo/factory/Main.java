package com.way.demo.factory;

public class Main {
    public static void main(String[] args) {
        MouseFactory dellMouseFactory = new DellMouseFactory();
        Mouse dellmouse = dellMouseFactory.getMouse();
        dellmouse.info();

        MouseFactory hpMouseFactory = new HpMouseFactory();
        Mouse hpmouse = hpMouseFactory.getMouse();
        hpmouse.info();
    }
}
