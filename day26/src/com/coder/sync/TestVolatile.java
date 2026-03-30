package com.coder.sync;

import java.util.concurrent.TimeUnit;

/**
 * @author N1357
 * @date 2026/3/29
 * @project core_java
 */
//
public class TestVolatile {
    volatile static boolean b = true;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            while(b){
                System.out.println("t1线程正在执行");
            }
        });
        t1.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("主线程将b的值改为false，停止t1线程");
        b = false;
    }
}
