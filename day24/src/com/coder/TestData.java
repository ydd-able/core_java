package com.coder;

import java.io.*;

/**
 * @author N1357
 * @date 2026/3/25
 * @project core_java
 */
public class TestData {
    public static void main(String[] args) throws IOException {
      /*  DataOutputStream dos = new DataOutputStream(new FileOutputStream("d:/aa/x.xx"));
        Student student = new Student();
        student.setName("李白");
        student.setAge(20);
        dos.writeUTF(student.getName());
        dos.writeInt(student.getAge());
        dos.close();*/
        DataInputStream dis = new DataInputStream(new FileInputStream("d:/aa/x.xx"));
        String name = dis.readUTF();
        int age = dis.readInt();
        System.out.println(name+"\t"+age);
        dis.close();


    }



}
