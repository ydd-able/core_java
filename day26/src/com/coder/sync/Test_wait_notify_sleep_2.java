package com.coder.sync;

import java.util.concurrent.TimeUnit;

/**
 * @author N1357
 * @date 2026/3/29
 * @project core_java
 */
public class Test_wait_notify_sleep_2 {
    static final Object LOCK = new Object();
    static boolean b = false;//杜甫的工作条件。
    static boolean a = false;//杜甫的工作条件

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            synchronized (LOCK) {
                System.out.println("是否拿到工资。" + b);
                while (!b) {
                    System.out.println(getName() + "没有工资,不工作，睡觉");
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("是否拿到工资。" + b);
                if (b) {
                    System.out.println(getName() + "拿到工资,开始工作");
                }
            }
        }, "员工李白").start();

        new Thread(() -> {
            synchronized (LOCK) {
                System.out.println("是否拿到工资。" + a);
                while (!a) {
                    System.out.println(getName() + "没有工资,不工作，睡觉");
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("是否拿到工资。" + a);
                if (a) {
                    System.out.println(getName() + "拿到工资,开始工作");
                }
            }
        }, "员工杜甫").start();
        //创建四个其他员工
       /* for (int i = 0; i < 4; i++) {
            new Thread(() -> {
                synchronized (LOCK) {
                    System.out.println(getName() + "开始工作");//李白的线程是sleep，它们进不去。
                }
            }, "其他人" + i).start();
        }*/
        TimeUnit.SECONDS.sleep(1);
        new Thread(() -> {
            synchronized (LOCK) {
                a = true;
                b = true;
                System.out.println("老板送工资了");
                LOCK.notifyAll();//激活wait（）.
            }
        }).start();
    }

    public static String getName() {
        return Thread.currentThread().getName();
    }
}
