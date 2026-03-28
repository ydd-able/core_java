package com.coder.thread;

import javax.swing.text.html.HTML;
import java.util.concurrent.TimeUnit;

/**
 * @author N1357
 * @date 2026/3/27
 * @project core_java
 */
public class TestJoin {
    static int x= 0;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            x= 100;
        });
        t1.start();
        t1.join(2200);//要不然就是t1线程执行完成死亡了，要不就是时间到了。

        System.out.println(x);

    }
}
