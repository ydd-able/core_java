package com.coder.reen;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author N1357
 * @date 2026/3/30
 * @project core_java
 */
public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Thread t1 = new Thread(()->{
           try {
               lock.lock();
               System.out.println("线程1获取到锁");
           }finally {
               lock.unlock();
           }
        });
        t1.start();
        Thread t2 = new Thread(()->{
            try {
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try{
                //lock.lock();//不可被打断
                lock.lockInterruptibly();//线程可以被打断。
                System.out.println("线程2获取到锁");
            } catch (InterruptedException e) {
                System.out.println("线程2被中断");
                return;
            }
            try{
                System.out.println("线程2获取到锁");
            }
            finally {
                lock.unlock();
            }
        });
        t2.start();
        TimeUnit.MILLISECONDS.sleep(1000);
        if(t2.isAlive()){
            System.out.println("执行线程中断");
            t2.interrupt();
        }else{
            System.out.println("线程2执行完成");
        }
    }
}
