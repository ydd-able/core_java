package com.coder.reen;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author N1357
 * @date 2026/4/1
 * @project core_java
 */
public class TestPool {
    public static void main(String[] args) {
        //核心线程数2个，最多3个，有一个救急线程。
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,3,10,
                TimeUnit.SECONDS, new LinkedBlockingDeque<>(2));


    }
}
