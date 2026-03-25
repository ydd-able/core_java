package com.coder;

import java.io.*;

/**
 * @author N1357
 * @date 2026/3/24
 * @project core_java
 */
public class TestCopy {
    public static void main(String[] args) {

    }
    public static void copy(File srcFile,File destFile) throws IOException {
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte[] bytes = new byte[1024];
        int x ;
        while((x= bis.read(bytes))!=-1){
            bos.write(bytes,0,x);
        }
        bis.close();
        bos.close();

    }
}
