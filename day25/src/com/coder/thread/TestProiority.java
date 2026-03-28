package com.coder.thread;

/**
 * @author N1357
 * @date 2026/3/27
 * @project core_java
 */
//线程优先级会提示调度器优先调度该线程。
public class TestProiority {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            int x = 0;
            while (true) {
                System.out.println(Thread.currentThread().getName() + ":" + x++);

            }
        }, "线程2");


        Thread t2 = new Thread(() -> {
            int x = 0;
            while (true) {
                System.out.println("\t\t\t" + Thread.currentThread().getName() + ":" + x++);

            }
        }, "线程2");
        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
    }

}
