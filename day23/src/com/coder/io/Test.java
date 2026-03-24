package com.coder.io;

import java.io.*;

/**
 * @author N1357
 * @date 2026/3/22
 * @project core_java
 */
public class Test {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter writer = new FileWriter("d:/aa/hello.txt");
            for (int i = 0; i < 10000; i++) {
                writer.write(i + "\t");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
      /*  writer.write("欢迎使用Java系统");
        writer.flush();
        writer.close();//close之后不能再对流进行操作。*/


    }

}
//不管是读文件，还是写文件，操作步骤。
//打开流
//读、写，关闭流。
