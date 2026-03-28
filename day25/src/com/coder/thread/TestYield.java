package com.coder.thread;

/**
 * @author N1357
 * @date 2026/3/27
 * @project core_java
 */
public class TestYield {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
           int x= 0;
           while(true){
               System.out.println("线程1:"+x++);
           }
        });
        Thread t2 = new Thread(()->{
           int x= 0;
           while(true){
               Thread.yield();
               System.out.println("\t\t\t线程2:"+x++);
           }
        });
        t1.start();
        t2.start();
    }
}
