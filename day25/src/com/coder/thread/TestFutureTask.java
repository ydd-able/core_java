package com.coder.thread;

import java.util.concurrent.*;

/**
 * @author N1357
 * @date 2026/3/26
 * @project core_java
 */
public class TestFutureTask {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
       // Future<Integer>
        FutureTask<Integer> task = new FutureTask<>( () -> {
           int sum = 0;
            for (int i = 1; i <=100; i++) {
                sum+=i;
            }
            Thread.sleep(3000);
            return sum;
        });
        new Thread(task).start();
     /*   Thread.sleep(2000);
        task.cancel(true);
        System.out.println(task.isCancelled());
        System.out.println(task.isDone());*/



      /*  new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println((int)(Math.random()*10));
            }
        },"线程2").start();*/



        Integer x = task.get(2000, TimeUnit.MILLISECONDS);
        System.out.println(x);
    }
}
