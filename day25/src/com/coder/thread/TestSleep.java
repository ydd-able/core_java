package com.coder.thread;

import javax.swing.plaf.TableHeaderUI;

/**
 * @author N1357
 * @date 2026/3/27
 * @project core_java
 */
public class TestSleep {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            System.out.println("子线程开始");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("子线程结束");
        });
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(500);
        System.out.println(t1.getState());


    }
}
