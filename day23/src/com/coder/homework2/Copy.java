package com.coder.homework2;

import java.io.*;

/**
 * @author N1357
 * @date 2026/3/23
 * @project core_java
 */
public class Copy {
    public static void main(String[] args) {
        copyDir(new File("d:/aa"),new File("d:/xx"));


    }
    public static void copyDir(File srcDir,File destDir){
       destDir.mkdirs();
        File[] files = srcDir.listFiles();
        for (File file : files) {
            if(file.isFile()){
                copyFile(file,new File(destDir,file.getName()));
            }else{
                copyDir(file,new File(destDir,file.getName()));//递归调用。
            }
        }
    }


    public static void copyFile(File srcFile, File destFile) {
        try (
                FileReader reader = new FileReader(srcFile);
                FileWriter writer = new FileWriter(destFile);
        ) {
            reader.transferTo(writer);//复制。
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
