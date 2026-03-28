package com.coder.thread;

import javax.print.attribute.standard.RequestingUserName;

/**
 * @author N1357
 * @date 2026/3/27
 * @project core_java
 */
public class TestAPI {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            while(true){}
        });
        t1.start();//只能调用一次
        System.out.println(t1.getState());

        //run方法：新线程启动后自动调用的方法。在构造thread对象时，传递Runnable参数。

    }
}
