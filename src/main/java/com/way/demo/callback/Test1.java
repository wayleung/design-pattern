package com.way.demo.callback;






public class Test1 { //业务处理类，老王去打饭
    public static void main(String[] args) {
        WangGangDan laowang=new WangGangDan(); //王钢蛋以别名laowang去食堂要饭
        Restaurant waiter=new Restaurant(); 
        String dozenRice=waiter.dozenRice(laowang);
        System.out.println(dozenRice); //最后老王“盛了一车米饭”
        //但是通常我们打饭时不会告诉服务员我们叫什么，这样太麻烦了，那么可不可以只告诉服务员
        //饭量多少就给我们打饭呢？按常理来说我们去餐厅也只会要一次饭。
        //匿名内部类多用来实现回调，简便
        String dozenRice1=waiter.dozenRice(new Client(){ 
//            @Override
            public String appetite() {
                return "一锅米饭";
            }});
        System.out.println(dozenRice1); 
    }
}