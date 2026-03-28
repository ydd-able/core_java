package com.coder.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author N1357
 * @date 2026/3/27
 * @project core_java
 */
public class ThreadUtil {
    public static void sleep(long second) throws InterruptedException {
        TimeUnit.SECONDS.sleep(second);
    }
}
