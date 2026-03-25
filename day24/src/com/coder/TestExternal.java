package com.coder;

import java.io.*;

/**
 * @author N1357
 * @date 2026/3/25
 * @project core_java
 */
public class TestExternal {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*Emp emp = new Emp();
        emp.setName("李白");
        emp.setGender("男");
        emp.setAge(20);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/aa/emp.yyy"));
        oos.writeObject(emp);
        oos.close();*/
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/aa/emp.yyy"));
        Emp emp = (Emp)ois.readObject();
        System.out.println(emp);


    }
}
