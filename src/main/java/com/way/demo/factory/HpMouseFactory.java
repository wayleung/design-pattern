package com.way.demo.factory;

public class HpMouseFactory implements MouseFactory{

    public Mouse getMouse() {
        return new HpMouse();
    }
}
