package com.coder.reen;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author N1357
 * @date 2026/3/31
 * @project core_java
 */
//手动可重入高级锁
//ReentrantLock是非公平锁。
//
public class Test03 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(true);//变为公平锁
        Fair fair = new Fair(lock);
        new Thread(fair, "t1").start();
        new Thread(fair, "t2").start();
    }

}

class Fair implements Runnable {
    private Integer num = 0;
    private ReentrantLock lock;

    public Fair(ReentrantLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (num <= 100) {
            lock.lock();
            try {
                num++;
                System.out.println(Thread.currentThread().getName()+"执行任务：" + num);
            } finally {
                lock.unlock();
            }
        }
    }
}