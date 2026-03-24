package com.coder.file;

import java.io.File;
import java.io.IOException;

/**
 * @author N1357
 * @date 2026/3/22
 * @project core_java
 */
public class TestFileOther {
    public static void main(String[] args) throws IOException {
        File file = new File("d:/aa/hello.txt");
        //获取文件名
     /*   String name = file.getName();
        System.out.println(name);
        //获取目录名
        String parent = file.getParent();
        System.out.println("parent = " + parent);
        //获取hello.txt所在目录
        File parentFile = file.getParentFile();//
        System.out.println(parentFile.getName());
        //获取文件大小
        long length = file.length();
        System.out.println("length = " + length);
        //测试应用程序队文件是否可执行。
        boolean b = file.canExecute();
        //测试应用程序对文件是否可读。
        boolean b1 = file.canRead();
        //测试应用程序对文件是否可写。
        boolean b2 = file.canWrite();
        System.out.println(b2);*/

        //获取文件路径：
       /* String path = file.getPath();
        System.out.println(path);
        //获取绝对路径。
        File absoluteFile = file.getAbsoluteFile();
        System.out.println("absoluteFile = " + absoluteFile);

        //精准获取绝对路径的方式，可去除在构造时给的相对路径的.标志。
        File canonicalFile = file.getCanonicalFile();
        System.out.println("canonicalFile = " + canonicalFile);
*/
        //获取文件最后修改时间。
       /* long l = file.lastModified();
        System.out.println(l);

        //获取磁盘空间
        long totalSpace = file.getTotalSpace();//字节。
        System.out.println("totalSpace = " + totalSpace);

        //可用磁盘空间
        long freeSpace = file.getFreeSpace();
        System.out.println("freeSpace = " + freeSpace);

        //获取JVM可用空间大小。
        long usableSpace = file.getUsableSpace();
        System.out.println("usableSpace = " + usableSpace);
*/

        //获取磁盘分区。
       /* File[] disks = File.listRoots();
        for (File disk : disks) {
            System.out.println("disk = " + disk);
        }*/
     /*   //对文件重命名，可以将文件命名到其他目录或者盘符下。
        boolean b = file.renameTo(new File("d:/aa/hi.txt"));
        System.out.println("b = " + b);

        //判断文件是否是隐藏文件
        boolean hidden = file.isHidden();
        System.out.println("hidden = " + hidden);*/




    }
}
