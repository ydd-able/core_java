package com.coder.homework;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author N1357
 * @date 2026/4/1
 * @project core_java
 */
//现有三个线程，一个线程实现“购买商品下单”，一个线程实现“使用微信付款”，一个线程实现“个人帐户积分”
//，三个线程必须按顺序依次执行，用户要完成三次买购商品的操作，请使用可重入锁ReentrantLock完成上述操作
public class Test02 {
    static final ReentrantLock lock = new ReentrantLock();
    static final Condition orderCondition = lock.newCondition();
    static final Condition payCondition = lock.newCondition();
    static final Condition scoreCondition = lock.newCondition();

    static int state = 0;

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            new Thread(() -> {
                lock.lock();
                try {
                    while (state != 0) {
                        orderCondition.await();
                    }
                    System.out.println("购买产品下单");
                    state = 1;
                    payCondition.signal();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock();
                }
            }).start();
            new Thread(() -> {
                lock.lock();
                try {
                    while (state != 1) {
                        payCondition.await();
                    }
                    System.out.println("用户微信支付");
                    state = 2;
                    scoreCondition.signal();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock();
                }
            }).start();
            new Thread(() -> {
                lock.lock();
                try {
                    while (state != 2) {
                        scoreCondition.await();
                    }
                    System.out.println("完成用户积分");
                    state = 0;
                    orderCondition.signal();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock();
                }
            }).start();


        }

    }
}
