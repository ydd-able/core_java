package com.coder.homework;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author N1357
 * @date 2026/3/10
 * @project core_java
 */
//problem:1、实现每隔2秒钟，生成一个1000以内的随机整数，打印到屏幕上
public class Test1 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Random random = new Random();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(getRandom(random,1000));
            }
        },0,2000);

    }
    public static int getRandom(Random random,int bound){
        return random.nextInt(bound);
    }
}
