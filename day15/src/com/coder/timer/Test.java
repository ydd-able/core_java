package com.coder.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author N1357
 * @date 2026/3/10
 * @project core_java
 */
public class Test {
    public static void main(String[] args) {
       Timer timer = new Timer();

      /* timer.schedule(new Task(),0,1000*60*60*24);*/


    }
}
//定时器任务。
class Task extends TimerTask{
    @Override
    public void run() {
        System.out.println("hello");
    }
}
