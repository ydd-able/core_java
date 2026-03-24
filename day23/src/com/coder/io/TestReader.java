package com.coder.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author N1357
 * @date 2026/3/23
 * @project core_java
 */
public class TestReader {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("d:/aa/buffer.txt");
        //文件的读取。
        //int read = reader.read();//每次读取一个字符返回一个读取到的字符。
     /*   int read;
        while((read=reader.read())!=-1){
            System.out.print((char)read);
        }*/
        char[] chars = new char[1024];
        int read = reader.read(chars);
        String str = new String(chars);
        System.out.println(str);



    }
}
