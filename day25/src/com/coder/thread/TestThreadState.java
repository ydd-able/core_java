package com.coder.thread;

/**
 * @author N1357
 * @date 2026/3/26
 * @project core_java
 */
public class TestThreadState {
    public static void main(String[] args) throws InterruptedException {
        //NEW线程创建，并没有调用start运行。
      /*  Thread t1 = new Thread(()-> System.out.println("线程1"));
        System.out.println(t1.getState());

        Thread t2 = new Thread(()->{while(true){}});
        t2.start();
        System.out.println(t2.getState());*/

        //TimedWaiting
       /* Thread t4 = new Thread(()->{
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t4.start();
        Thread.sleep(50);
        System.out.println(t4.getState());*/

        //WAITING
     /*   System.out.println("主线程");
        Thread t1 = new Thread(()-> System.out.println("线程1"));
        Thread t2 = new Thread(()-> System.out.println("线程2"));
        Thread t3 = new Thread(()-> System.out.println("线程3"));
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("主线程结束");*/
        Thread t4 = new Thread(()->{
            synchronized (TestThreadState.class){
                try {
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });
        t4.start();
        Thread.sleep(50);
        System.out.println(t4.getState());


        //阻塞状态。
        Thread t6 = new Thread(()->{
            synchronized (TestThreadState.class){
                try {
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t6.start();
        Thread.sleep(50);
        System.out.println(t6.getState());





    }
}
