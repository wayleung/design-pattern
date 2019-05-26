package com.way.demo.callback;

/**
*食堂
*/
class Restaurant{
    /**
     * 打饭方法，前提是客户要告知服务员你的饭量，他会根据你的饭量给你“盛”饭
     * @param client 排队的客户
     * @return
     */
    public String dozenRice(Client client){
        return "盛了"+client.appetite();
    }

}