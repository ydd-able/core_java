package com.coder.homework;

import java.util.Random;

/**
 * @author N1357
 * @date 2026/3/27
 * @project core_java
 */

//使用多线程模拟龟兔赛跑场景，一共要跑100米，乌龟每次跑1到3米，
//兔子每次跑3到5米，兔子跑超过70米后，中间休息2毫秒，看最后比赛结果
public class Test02 {
    public static void main(String[] args) {
        RunThread r1 = new RunThread(1,3);//乌龟的
        RunThread r2 = new RunThread(3,5);
        Thread t1 =  new Thread(r1,"乌龟");
        Thread t2 =  new Thread(r2,"兔子");
        t1.start();
        t2.start();
    }

}
class RunThread implements Runnable{
    private int min;
    private  int max;
    private Random random;
    private boolean isRest;
    public RunThread(int min,int max){
        this.min = min;
        this.max = max;
        random = new Random();

    }
    @Override
    public void run() {
        int length = 0;
        String name = Thread.currentThread().getName();
        while(length<=100){
            int i = random.nextInt(max - min + 1) + min;
            length+=i;
            if(name.equals("兔子")){
                if(length>=70&&!isRest){
                    try {
                        System.out.println("兔子跑了70米，休息一会儿");
                        isRest = true;
                        Thread.sleep(2);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            System.out.println(name+"跑到"+length+"米");
        }
    }
}