package com.coder.io;

import java.io.*;

/**
 * @author N1357
 * @date 2026/3/23
 * @project core_java
 */
public class TestBufferedReader {
    public static void main(String[] args) throws IOException {
       /* FileReader reader = new FileReader("d:/aa/buffer.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String str;
        while ((str = bufferedReader.readLine())!=null){
            System.out.println(str);
        }*/
        copyBuffer("d:/aa/buffer.txt","d:/aa/buffer2.txt");

    }
    public static void copy(File srcFile, File destFile) throws IOException {
        FileReader reader = new FileReader(srcFile);
        FileWriter writer = new FileWriter(destFile);
        int c;
        char[] chars = new char[1024];
        while((c = reader.read(chars))!=-1){
            writer.write(chars,0,c);


        }
        reader.close();
        writer.close();

    }
    public static void copyBuffer(String srcFile,String destFile) throws IOException {
        FileReader reader = new FileReader(srcFile);
        FileWriter writer = new FileWriter(destFile);
        BufferedReader bufferedReader = new BufferedReader(reader);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        String str;
        while((str = bufferedReader.readLine())!=null){
            bufferedWriter.write(str);
            bufferedWriter.newLine();//换行。
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
    public static void copyFile(String srcFile, String destFile){
        try {
            FileReader reader = new FileReader(srcFile);
            FileWriter writer = new FileWriter(destFile);
            reader.transferTo(writer);//对文件的复制操作。
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
