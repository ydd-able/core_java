package com.coder.thread;

/**
 * @author N1357
 * @date 2026/3/26
 * @project core_java
 */
public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        //同步运行
      /*  FileUtil.readFile();
        System.out.println("运行主程序");*/
        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    FileUtil.readFile();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        t.start();
        System.out.println("运行主程序");
    }
}
