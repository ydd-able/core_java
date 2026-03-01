package com.coder.obj;

/**
 * @auther N1357
 * @date 2026/2/25
 * @project core_java
 */
public class TestObj1 {
    public static void main(String[] args) {
        Object obj = new Object();
        Student student = new Student("张三","男",22);
        Student student1 = new Student("张三","男",22);
        Student student2 = new Student("张三","男",22);
        

        System.out.println(student.equals(student1));


    }
}
