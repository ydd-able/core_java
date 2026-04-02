package com.coder.reen;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author N1357
 * @date 2026/3/30
 * @project core_java
 */
public class Test {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        //创建变量index,赋值为1，加锁，关锁，启动线程。
        new Thread(()->{
            int index = 1;
            try{
                reentrantLock.lock();
                System.out.println("最开始加锁");
                while(true){
                    try {
                        reentrantLock.lock();
                        System.out.println("第" + (++index) + "次加锁");
                        if(index == 10){
                            break;
                        }
                    }finally {
                        reentrantLock.unlock();
                        System.out.println("第"+index+"次解锁");
                    }
                }
            }finally {
                reentrantLock.unlock();
                System.out.println("最后解锁");
            }
        }).start();

        new Thread(()->{
            try{
                reentrantLock.lock();
                for (int i = 0; i < 3; i++) {
                    System.out.println("线程任务:"+Thread.currentThread().getName());
                }
            }finally {
                reentrantLock.unlock();
                System.out.println("最后解锁");
            }
        }).start();
    }
}
