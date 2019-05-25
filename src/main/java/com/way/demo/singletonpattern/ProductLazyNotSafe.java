package com.way.demo.singletonpattern;

//懒汉 Lazy 线程非安全
public class ProductLazyNotSafe {
    private static ProductLazyNotSafe productLazy;
    //让构造函数私有
    private ProductLazyNotSafe(){

    }

    public static  ProductLazyNotSafe getInstance(){
        if(productLazy==null){
            productLazy = new ProductLazyNotSafe();
        }
        return productLazy;
    }
}
