package com.way.demo.singletonpattern;

//饿汉  非Lazy 线程安全
public class Product {
    private static Product product = new Product();

    //让构造函数私有
    private Product(){

    }

    public static Product getInstance(){
        return product;
    }
}
