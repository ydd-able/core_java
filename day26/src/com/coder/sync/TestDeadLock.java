package com.coder.sync;

/**
 * @author N1357
 * @date 2026/3/29
 * @project core_java
 */
public class TestDeadLock {
    public static void main(String[] args) {
            Object pen = new Object();
            Object paper = new Object();
            new Thread(() -> {
                synchronized (pen) {
                    System.out.println("t1线程拿到了笔");
                    synchronized (paper) {
                        System.out.println("t1线程拿到了纸");
                        System.out.println("t1可以写字了");
                    }
                }
            },"t1").start();

            new Thread(() -> {
                synchronized (paper) {
                    System.out.println("t2线程拿到了纸");
                    synchronized (pen) {
                        System.out.println("t2线程拿到了笔");
                        System.out.println("t2可以写字了");
                    }
                }
            },"t2").start();

        }

}
