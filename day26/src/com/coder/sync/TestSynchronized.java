package com.coder.sync;

/**
 * @author N1357
 * @date 2026/3/29
 * @project core_java
 */
public class TestSynchronized {
     final static Object obj = new Object();
     static int x = 0;

    public static void main(String[] args) {
        synchronized (obj){
            x++;
        }
    }
}
