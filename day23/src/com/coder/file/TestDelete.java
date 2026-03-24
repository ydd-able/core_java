package com.coder.file;

import java.io.File;
import java.io.IOException;

/**
 * @author N1357
 * @date 2026/3/21
 * @project core_java
 */
public class TestDelete {
    public static void main(String[] args) throws IOException {
        //File file = new File("d:/aa/hello1.txt");
        File tempFile = File.createTempFile("order", ".txt");
        tempFile.deleteOnExit();
        System.out.println(tempFile.getAbsoluteFile());



    }
}
