package com.coder.sync;

/**
 * @author N1357
 * @date 2026/3/28
 * @project core_java
 */
public class Test {
    static int x = 0;
    final static Object obj1 = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (obj1) {
                    x++;
                }

            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (obj1) {
                    x--;
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(x);

    }
}

class NumberObj{
    private int x ;
    public void increment(){
        //加锁
        synchronized(this){
            x++;
        }
    }
    public synchronized void decrement(){
            x--;
    }
    public synchronized int getNumber(){
        return x;
    }
}
