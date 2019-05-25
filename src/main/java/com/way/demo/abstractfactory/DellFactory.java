package com.way.demo.abstractfactory;

public class DellFactory implements PcFactory {
    public Mouse getMouse() {
        return new DellMouse();
    }

    public Keybord getKeyBoard() {
        return new DellKeyboard();
    }
}
