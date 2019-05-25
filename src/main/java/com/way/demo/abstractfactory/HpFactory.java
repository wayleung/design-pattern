package com.way.demo.abstractfactory;

public class HpFactory implements PcFactory {
    public Mouse getMouse() {
        return new HpMouse();
    }

    public Keybord getKeyBoard() {
        return new HpKeyboard();
    }
}
