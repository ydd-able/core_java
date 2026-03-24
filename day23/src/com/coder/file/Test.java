package com.coder.file;

import java.io.File;
import java.io.IOException;

/**
 * @author N1357
 * @date 2026/3/21
 * @project core_java
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //磁盘上的文件夹。
       /* File file= new File("d:/aa/xx.txt");
        //创建一个新的文件
        //如果文件存在，则直接返回false，不会创建新的文件。
        try{
            boolean newFile = file.createNewFile();
            System.out.println("newFile = " + newFile);
        }catch (IOException e){
            e.printStackTrace();
        }*/
       //创建目录的方法。
        //如果目录不存在，则创建目录，如果目录存在，则不创建，返回false。
        //
        /*File dir = new File("d:/aa/cc");
        boolean mkdir = dir.mkdir();
        System.out.println("mkdir = " + mkdir);
*/
        //mkdirs创建多级目录。
        File dir = new File("d:/aa/yy/zz");
        boolean b = dir.mkdirs();
        System.out.println("b = " + b);


    }
}
