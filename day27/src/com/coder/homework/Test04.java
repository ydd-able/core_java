package com.coder.homework;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author N1357
 * @date 2026/4/2
 * @project core_java
 */
public class Test04 {
    private static int tickets = 10;

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        for (int i = 1; i <= 30; i++) {
            String name = "旅客"+i;
            threadPool.submit(()->{
               buyTicket(name);
            });
        }
        threadPool.shutdown();
    }
    public synchronized static void buyTicket(String name){
        if(tickets>0){
            System.out.println(name+"已成功买票，还剩"+(--tickets)+"张");
        }else{
            System.out.println(name + "抢票失败，票已卖完");
        }
    }
}
