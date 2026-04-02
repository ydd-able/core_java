package com.coder.homework;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author N1357
 * @date 2026/4/2
 * @project core_java
 */
public class Test03 {
    static Thread t1;
    static Thread t2;
    static Thread t3;

    static int state = 0;

    public static void main(String[] args) {

        t1 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                while (state != 0) {
                    LockSupport.park();
                }
                System.out.println("购买产品下单");
                state = 1;
                LockSupport.unpark(t2);
            }
        });
        t2 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                while (state != 1) {
                    LockSupport.park();
                }
                System.out.println("用户微信支付");
                state = 2;
                LockSupport.unpark(t3);
            }
        });
        t3 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                while (state != 2) {
                    LockSupport.park();
                }
                System.out.println("完成用户积分");
                state = 0;
                LockSupport.unpark(t1);

            }
        });
        t1.start();
        t2.start();
        t3.start();
    }


}



