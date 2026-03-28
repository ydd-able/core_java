package com.coder.thread;

import static com.coder.thread.ThreadUtil.sleep;

/**
 * @author N1357
 * @date 2026/3/27
 * @project core_java
 */
public class TestDaemon {
    public static void main(String[] args) throws InterruptedException {
        Thread t1= new Thread(()->{
            while (true){
                System.out.println("守护线程执行......");
                try {
                    sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
       /* Thread t2 = new Thread(()->{
            while(true){
                    System.out.println("用户线程执行");

                boolean b= Thread.currentThread().isInterrupted();
                if(b){
                    System.out.println("用户线程结束");
                    break;
                }

            }
        },"t2");*/
        t1.setDaemon(true);
        t1.start();
        //t2.start();
        sleep(3);
        //t2.interrupt();;
        System.out.println("主线程结束");


    }
}
