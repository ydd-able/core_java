package com.coder.homework;

/**
 * @author N1357
 * @date 2026/3/30
 * @project core_java
 */
//两个线程，一个生产超级兵，一个攻击防御塔，要求按顺序执行，生产小兵的线程必须先执行。
public class Test03 {
    static final Object LOCK = new Object();//定义锁
    static boolean b = false;
    public static void main(String[] args) {
        Thread g = new Thread(() -> {
            synchronized (LOCK) {
                while (!b) {
                    System.out.println("没有超级兵产生");
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(Thread.currentThread().getName()+"攻击防御塔");
            }
        }, "攻击防御塔线程");
        Thread s = new Thread(() -> {
            synchronized (LOCK) {
                System.out.println(Thread.currentThread().getName() + "生产超级兵");
                b = true;
                LOCK.notify();
            }
        }, "生产超级兵线程");
        g.start();
        s.start();
    }
}
