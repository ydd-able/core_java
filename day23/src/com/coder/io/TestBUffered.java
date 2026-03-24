package com.coder.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author N1357
 * @date 2026/3/23
 * @project core_java
 */
public class TestBUffered {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("d:/aa/buffer.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);//缓存更大，可以指定缓冲区大小。
        bufferedWriter.write("hello buffer");
        bufferedWriter.newLine();//换行
        bufferedWriter.close();
    }
}
