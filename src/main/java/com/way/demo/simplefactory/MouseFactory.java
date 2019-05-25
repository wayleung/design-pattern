package com.way.demo.simplefactory;

public class MouseFactory {

    public Object getMouse(Class<? extends Mouse> clazz){
        Object obj = null;
        try {
            obj =  Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  obj;
    }
}
