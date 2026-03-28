package com.coder.thread;

/**
 * @author N1357
 * @date 2026/3/26
 * @project core_java
 */
public class Test03 {
    public static void main(String[] args) {
      /*  System.out.println("主线程开始");
        MyRunnableImpl impl = new MyRunnableImpl();
        Thread thread = new Thread(impl);
        thread.start();
        System.out.println("主线程结束");*/
        Runnable r = () -> {
            while (true) {
                System.out.println("hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t = new Thread(r, "线程1");

    }

    class MyRunnableImpl implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }
}