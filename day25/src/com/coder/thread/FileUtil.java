package com.coder.thread;

import java.util.Random;

/**
 * @author N1357
 * @date 2026/3/26
 * @project core_java
 */
public class FileUtil {
    public static void readFile() throws InterruptedException {
        int t = new Random().nextInt(2000);
        Thread.sleep(t);//让当前线程进行休眠。
        System.out.println("文件读取成功，耗费"+t+"ms ");
    }
}
