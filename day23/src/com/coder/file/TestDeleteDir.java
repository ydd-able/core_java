package com.coder.file;

import java.io.File;

/**
 * @author N1357
 * @date 2026/3/22
 * @project core_java
 */
public class TestDeleteDir {
    public static void main(String[] args) {
       /* File dir = new File("d:/aa/yy");
        //获取目录下的所有文件。
        File[] files = dir.listFiles();
        for (File file : files) {
            file.delete();
        }
        boolean b = dir.delete();
        System.out.println("b = " + b);
*/
     /*   boolean mkdir = dir.mkdir();
        boolean b = dir.delete();
        System.out.println("b = " + b);*/
        File dir = new File("d:/aa/cc/bb");
        deleteDir(dir);


    }

    public static void deleteDir(File dir) {
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isFile()) {//判断是否是文件  //file.idDirectory()判断是不是目录。
                    file.delete();
                } else {
                    deleteDir(file);//递归完成删除。
                }
            }
        }
        boolean b = dir.delete();
    }
}
