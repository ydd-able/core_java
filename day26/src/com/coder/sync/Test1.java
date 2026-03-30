package com.coder.sync;

/**
 * @author N1357
 * @date 2026/3/29
 * @project core_java
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        NumberObj obj = new NumberObj();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                obj.increment();
            }
        });
        Thread t2= new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                obj.decrement();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(obj.getNumber());
    }
}
