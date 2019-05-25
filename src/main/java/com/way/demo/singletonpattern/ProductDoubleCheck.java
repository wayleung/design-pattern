package com.way.demo.singletonpattern;

//double check Lazy 线程安全且高效
public class ProductDoubleCheck {

    //volatile 防止指令重排 因为=new  不是一个原子性操作
    private volatile static ProductDoubleCheck productDoubleCheck;
    //让构造函数私有
    private ProductDoubleCheck(){

    }

    public static ProductDoubleCheck getInstance(){
        if(productDoubleCheck==null){
            synchronized (ProductDoubleCheck.class){
                if (productDoubleCheck==null){
                    productDoubleCheck = new ProductDoubleCheck();
                }
            }
        }
        return productDoubleCheck;
    }
}
