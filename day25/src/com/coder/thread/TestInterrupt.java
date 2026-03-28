package com.coder.thread;

/**
 * @author N1357
 * @date 2026/3/27
 * @project core_java
 */
public class TestInterrupt {
    public static void main(String[] args) throws InterruptedException {
        testSleepApp();

       /* Thread t1 = new Thread(() -> {
            System.out.println("子线程开始");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("子线程休眠被唤醒");
                throw new RuntimeException(e);
            }
            System.out.println("子线程结束");
        });
        t1.start();
        Thread.sleep(100);
        t1.interrupt();
*/

    }
    public static void testSleepApp(){
        new Thread(()->{
            while(true){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }).start();
    }

}
