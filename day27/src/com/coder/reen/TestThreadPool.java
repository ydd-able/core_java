package com.coder.reen;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author N1357
 * @date 2026/4/1
 * @project core_java
 */
public class TestThreadPool {
    public static void main(String[] args) {
       testSchedule();

    }
    public static void testSchedule(){
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        //反复执行
       /* executorService.scheduleAtFixedRate(()->{
            System.out.println("hello schedule");
        },1,1,TimeUnit.SECONDS);*/
        executorService.schedule(()->{
            System.out.println("ydd永远的神");
            executorService.shutdown();
        },1,TimeUnit.SECONDS);
    }
    public static void scheduled(){
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        executorService.schedule(()->{
            System.out.println("任务1");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },1,TimeUnit.SECONDS);
        executorService.schedule(()->{
            System.out.println("任务2");
        },1,TimeUnit.SECONDS);
        executorService.shutdown();

    }
    public static void cached(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.execute(()-> System.out.println(Thread.currentThread().getName()+"：执行任务"));
        }
        executorService.shutdown();

    }
    public static void single() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            executorService.execute(()->{
                System.out.println(Thread.currentThread().getName()+":执行任务");
            });
        }
        executorService.shutdown();
    }

    public static void fixed() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 20; i++) {
            executorService.execute(()->{
                try{
                    TimeUnit.MILLISECONDS.sleep(300);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+":执行任务");
            });
        }
    }
}
