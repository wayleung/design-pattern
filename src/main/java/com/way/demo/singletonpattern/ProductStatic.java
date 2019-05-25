package com.way.demo.singletonpattern;

//Lazy 线程安全
public class ProductStatic {
    private static class ProductStaticHolder{
        private static final ProductStatic INSTANCE =  new ProductStatic();
    }

    private ProductStatic(){

    }

    public static ProductStatic getInstance(){
        return ProductStaticHolder.INSTANCE;
    }
}
