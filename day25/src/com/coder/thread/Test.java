package com.coder.thread;

/**
 * @author N1357
 * @date 2026/3/26
 * @project core_java
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("主方法执行");
        MyThread m = new MyThread();
        m.setName("线程一");
        MyThread m1 = new MyThread();
        m1.setName("线程二");
        MyThread m2 = new MyThread();
        m2.setName("线程三");
        m.start();
        m1.start();
        m2.start();
        System.out.println("主方法执行结束");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 100; i >0 ; i--) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }

}
