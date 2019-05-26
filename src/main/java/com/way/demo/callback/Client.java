package com.way.demo.callback;

/**
 * 顾客，去食堂吃饭有个前提，要告诉服务员其饭量，才会给你盛饭
 * @author coder
 *
 */
interface Client{
    /**
     * 告诉服务员其饭量
     * @return 
     */
    public String appetite();
}