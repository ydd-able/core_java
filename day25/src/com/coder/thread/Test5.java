package com.coder.thread;

/**
 * @author N1357
 * @date 2026/3/26
 * @project core_java
 */
//jps查看所有Java进程。
//jstack生成jvm当前时刻所有线程快照。
//jconsole：以图形界面方式查看java进程中的线程运行状态。
public class Test5 {
    public static void main(String[] args) {
        new Thread(()->{
            while(true){
                String s = new String();
            }
        },"线程1").start();
    }
}
