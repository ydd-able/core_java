package com.coder.homework;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author N1357
 * @date 2026/4/1
 * @project core_java
 */
//1.使用ReentrantLock可重入锁，完成：两个线程，一个生产超级兵，
// 一个攻击防御塔，要求按顺序执行，生产小兵的线程必须先执行。
public class Test01 {
    //两个线程公用一把锁，
   static final  ReentrantLock lock = new ReentrantLock();//不能换锁。
    static Condition condition = lock.newCondition();
    static boolean isProduce = false;
    public static void main(String[] args) {
        //先生产超级兵。
        new Thread(() -> {
            lock.lock();
            try {
                System.out.println("生产超级兵");
                isProduce = true;
                condition.signal();//唤醒
            } finally {
                lock.unlock();
            }
        }).start();

        //攻击防御塔。
        new Thread(() -> {
            lock.lock();
            try {
                while (!isProduce) {
                    condition.await();//等待生产。
                }
                System.out.println("超级兵攻击防御塔");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }).start();
    }
}
