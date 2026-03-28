package com.coder.homework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author N1357
 * @date 2026/3/27
 * @project core_java
 */

// 待解决的问题:使用2个线程，计算1+2+3...+1000的和
public class Test01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> task1 = new FutureTask<>(()->{
            int sum = 0;
            for (int i = 0; i <= 500; i++) {
                sum+=i;
            }
            return sum;//实现callable接口，要有返回值。
        });

        FutureTask<Integer> task2= new FutureTask<>(()->{
            int sum = 0;
            for (int i = 501; i <= 1000; i++) {
                sum+=i;
            }
            return sum;//实现callable接口，要有返回值。
        });
        Thread t1 = new Thread(task1);
        t1.start();
        Thread t2 = new Thread(task2);
        t2.start();
        Integer x= task1.get();
        Integer y = task2.get();
        System.out.println(x+y);



    }
}
