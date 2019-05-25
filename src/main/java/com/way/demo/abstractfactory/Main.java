package com.way.demo.abstractfactory;

public class Main {
    public static void main(String[] args) {
        PcFactory dellFactory = new DellFactory();
        Keybord dellkeyBoard = dellFactory.getKeyBoard();
        Mouse dellmouse = dellFactory.getMouse();
        dellkeyBoard.info();
        dellmouse.info();


        PcFactory hpFactory = new HpFactory();
        Keybord hpkeyBoard = hpFactory.getKeyBoard();
        Mouse hpmouse = hpFactory.getMouse();
        hpkeyBoard.info();
        hpmouse.info();
    }
}
