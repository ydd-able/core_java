package com.coder;

import java.io.*;

/**
 * @author N1357
 * @date 2026/3/24
 * @project core_java
 */
public class TestSeria {
    public static void main(String[] args) throws IOException {
        Student student = new Student("李白","男",22,"北京");
        FileOutputStream fos = new FileOutputStream("d:/aa/stu.xxx");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student);
        oos.close();
    }
    public static void t2() throws IOException, ClassNotFoundException {
        InputStream fis  = new FileInputStream("d:/aa/stu.xxx");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student = (Student) ois.readObject();
        System.out.println();
        ois.close();


    }
}
