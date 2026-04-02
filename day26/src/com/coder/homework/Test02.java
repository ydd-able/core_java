package com.coder.homework;

import java.util.concurrent.TimeUnit;

/**
 * @author N1357
 * @date 2026/3/30
 * @project core_java
 */
//编写多线程应用程序，模拟多个人通过一个山洞的模拟。这个山洞每次只能通过一个人，进入山洞时，
//显示一下进洞人的名字，每个人通过山洞的时间为5秒，3个人准备过此山洞，出山洞时显示一下每次通过山洞人的姓名。
public class Test02 {
    public static void main(String[] args) {
        PassCave cave = new PassCave();
        new Thread(cave::pass,"李白").start();
        new Thread(cave::pass,"杜甫").start();
        new Thread(cave::pass,"白居易").start();
    }


}

class PassCave {
    public synchronized void pass() {//加锁，一个一个过
        System.out.println(Thread.currentThread().getName() + "进入山洞");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "走出山洞");
    }

}
