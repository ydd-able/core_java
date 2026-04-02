package com.coder.homework;

/**
 * @author N1357
 * @date 2026/4/2
 * @project core_java
 */
import java.io.*;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 定时线程池执行三个调度任务
 */
public class Test05 {

    private static final String SOURCE_FILE = "C:\\test.txt";

    private static final String TARGET_FILE = "D:\\test.txt";

    private static final ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(3);

    public static void main(String[] args) {
        threadPool.schedule(Test05::copyFileTask, 2, TimeUnit.MINUTES);

        threadPool.schedule(Test05::showTimeTask, 30, TimeUnit.SECONDS);

        threadPool.schedule(Test05::readFileTask, 1, TimeUnit.MINUTES);
    }


    private static void copyFileTask() {
        System.out.println("\n===== 开始执行任务1：复制文件 =====");
        File source = new File(SOURCE_FILE);
        File target = new File(TARGET_FILE);

        try {
            Files.copy(source.toPath(), target.toPath());
            System.out.println("文件复制成功！源文件：" + SOURCE_FILE);
            System.out.println("目标路径：" + TARGET_FILE);
        } catch (IOException e) {
            System.err.println("文件复制失败：" + e.getMessage());
        }
    }


    private static void showTimeTask() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(new Date());
        System.out.println("当前系统时间：" + currentTime);
    }


    private static void readFileTask() {
        System.out.println("\n===== 开始执行任务3：读取文件 =====");
        File file = new File(TARGET_FILE);


        while (true) {
            if (file.exists()) {

                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;

                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }

                    threadPool.shutdown();
                    System.exit(0);
                } catch (IOException e) {
                    System.err.println("文件读取失败：" + e.getMessage());
                }
            } else {
                System.out.println("文件不存在，30秒后重新检测...");
                try {
                    TimeUnit.SECONDS.sleep(30);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
