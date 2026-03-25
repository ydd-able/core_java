package com.coder;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author N1357
 * @date 2026/3/24
 * @project core_java
 */
public class TestInputOutput {
    public static void main(String[] args) throws IOException {
        //一个汉字，GBK2个字节，UTF-8 3个字节。
        FileInputStream fis = new FileInputStream("d:/aa/hello.txt");
        //把字节流转换为字符流。
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
         BufferedReader bufferedReader = new BufferedReader(isr);
         String read;
        while((read=bufferedReader.readLine())!=null){
            System.out.println(read);
        }
        fis.close();

    }
}
