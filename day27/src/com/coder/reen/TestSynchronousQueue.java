package com.coder.reen;

import java.util.concurrent.SynchronousQueue;

/**
 * @author N1357
 * @date 2026/4/1
 * @project core_java
 */
public class TestSynchronousQueue {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        new Thread(()->{
            for (int i = 1; i <= 10; i++) {
                System.out.println("开始执行生产："+i);
                try {
                    queue.put(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("消费一个产品"+i);
                try {
                    queue.take();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();


    }
}
