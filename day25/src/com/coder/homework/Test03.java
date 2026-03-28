package com.coder.homework;

import java.io.*;
import java.text.DecimalFormat;

/**
 * @author N1357
 * @date 2026/3/27
 * @project core_java
 */
public class Test03 {
    public static void main(String[] args) {
        new Thread(new FileCopyThread
                (new File("d:/aa/x.mp3"),new File("d:/aa/y.mp3"))).start();
        new Thread(new FileCopyThread
                (new File("d:/aa/x1.mp3"),new File("d:/aa/y1.mp3"))).start();
        new Thread(new FileCopyThread
                (new File("d:/aa/x2.mp3"),new File("d:/aa/y2.mp3"))).start();

    }
}
class FileCopyThread implements Runnable{
    private File src;
    private File dest;
    public FileCopyThread(File src , File dest){
        this.src = src;
        this.src = dest;
    }
    @Override
    public void run() {
        try {
            FileUtil.copyFile(src,dest);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
//文件复制
class FileUtil{
    public static void main(String[] args) throws FileNotFoundException {
        copyFile(new File("d:/aa/hello.txt"),new File("d:/aa/y.txt"));
    }
    public static void copyFile(File src,File dest) throws FileNotFoundException {
        if (!src.exists()) {
            throw new FileNotFoundException("源文件不存在");
        }
        byte[] b = new byte[1024];
        int x;
        double d = 0;
        DecimalFormat format = new DecimalFormat("##.##");
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
            while((x = bis.read(b))!=-1){
                bos.write(b,0,x);
                d+=x;
                double y = d/src.length();
                if(y!=1){
                    System.out.println("复制文件"+src.getName()+"进度:"+format.format(y*100)+"%");
                }
                System.out.println(src.getName()+"复制完成");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
