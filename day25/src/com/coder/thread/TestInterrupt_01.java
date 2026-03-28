package com.coder.thread;

import static com.coder.thread.ThreadUtil.sleep;

/**
 * @author N1357
 * @date 2026/3/27
 * @project core_java
 */
public class TestInterrupt_01 {
    public static void main(String[] args) throws InterruptedException {
      /*  Thread t1= new Thread(()->{
            try {
                System.out.println("子线程休眠");
                sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        sleep(1);
        t1.interrupt();
        System.out.println(t1.isInterrupted());*/
        Thread t2 = new Thread(()->{
            while(true){
                System.out.println("子线程执行循环");
                boolean b= Thread.currentThread().isInterrupted();
                if(b){
                    System.out.println("线程被打断");
                    break;
                }
            }
        });
        t2.start();
        sleep(1);
        t2.interrupt();

    }
}
