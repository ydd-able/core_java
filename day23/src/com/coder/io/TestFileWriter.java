package com.coder.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author N1357
 * @date 2026/3/23
 * @project core_java
 */
public class TestFileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("d:/aa/hello.txt");
       // writer.write("国");
      /*  char[] chars = {'中','国','人'};
        writer.write(chars,0,2);*/
        String str= "我是中国人";
        writer.write(str,2,3);
        writer.close();
    }
}
