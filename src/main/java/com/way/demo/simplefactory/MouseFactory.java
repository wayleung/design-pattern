package com.way.demo.simplefactory;

public class MouseFactory {

    //简单实现
    public Mouse getMouse(int type){
        if(type==1){
            return new DellMouse();
        }else{
            return new HpMouse();
        }
    }



    //反射实现
    public Mouse getMouse(Class<? extends Mouse> clazz){
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
        return (Mouse) obj;
    }
}
