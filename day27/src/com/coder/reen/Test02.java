package com.coder.reen;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author N1357
 * @date 2026/3/30
 * @project core_java
 */
public class Test02 {
    public static void main(String[] args)  {
        ReentrantLock lock = new ReentrantLock();
        Thread t1= new Thread(()->{
            System.out.println("尝试获取锁");
            //如果获取到锁，返回true,否则返回false
            boolean b = false;
            try {
                b = lock.tryLock(3, TimeUnit.SECONDS);//最长等待时间3秒钟。
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(!b){
                System.out.println("获取锁失败");
                return ;
            }
            try{
                System.out.println("已经拿到了锁");
                System.out.println("执行正常操作代码");
            }finally{
                lock.unlock();
            }
        });
        lock.lock();
        try {
            System.out.println("主线程获得锁");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally{
            lock.unlock();
        }
        t1.start();
    }
}
