package com.coder.sync;

import java.util.concurrent.TimeUnit;

/**
 * @author N1357
 * @date 2026/3/29
 * @project core_java
 */
public class TestWaitNotify {
    static final Object LOCK = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            synchronized (LOCK) {
                System.out.println("线程1执行");
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("线程1继续执行。");
            }
        });

        t1.start();


        Thread t2 = new Thread(() -> {
            synchronized (LOCK) {
                System.out.println("线程2执行");
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("线程2继续执行。");
            }
        });
        t2.start();

        //主线程休眠
        TimeUnit.SECONDS.sleep(1);
        System.out.println("主线程唤醒其他线程");
        synchronized(LOCK){
            LOCK.notifyAll();
        }



    }
}
