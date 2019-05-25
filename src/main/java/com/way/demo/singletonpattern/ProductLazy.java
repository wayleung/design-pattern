package com.way.demo.singletonpattern;

//懒汉 Lazy 线程安全
public class ProductLazy {
    private static ProductLazy productLazy;
    //让构造函数私有
    private ProductLazy(){

    }

    public static synchronized ProductLazy  getInstance(){
        if(productLazy==null){
            productLazy = new ProductLazy();
        }
        return productLazy;
    }
}
