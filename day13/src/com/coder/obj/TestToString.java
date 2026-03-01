package com.coder.obj;

import java.util.Arrays;

/**
 * @author N1357
 * @date 2026/3/1
 * @project core_java
 */
//native方法：他是Java和其他语言协作的时候来使用的，底层不是Java实现，是由c,c++实现。
//native是一个关键字，修饰的方法，只说明，不实现。

public class TestToString {
    public static void main(String[] args) {
        Student student = new Student("李白","男",22);
        Student student1 = new Student("李商隐","男",24);
        Student student2 = new Student("李清照","男",25);
        Student[] students = new Student[3];
        students[0] = student;
        students[1] = student1;
        students[2] = student2;
        System.out.println(students);//默认打印toString方法。
        System.out.println(Arrays.toString(students));

    }
}
