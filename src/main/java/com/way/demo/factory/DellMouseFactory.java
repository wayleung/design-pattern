package com.way.demo.factory;

public class DellMouseFactory implements MouseFactory{

    public Mouse getMouse() {
        return new DellMouse();
    }
}
