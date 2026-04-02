package com.coder.reen;

import java.util.concurrent.locks.LockSupport;

/**
 * @author N1357
 * @date 2026/4/1
 * @project core_java
 */
public class TestLockSupport {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            LockSupport.park();
            System.out.println("攻击防御塔");
        });
         Thread t2 = new Thread(()->{
            System.out.println("生产超级兵");
            LockSupport.unpark(t1);//让t1拿到许可证。

        });



    }
}
