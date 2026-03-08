package com.coder.array;

/**
 * @author N1357
 * @date 2026/3/6
 * @project core_java
 */
public class TestGenericMethod {
    public static void main(String[] args) {
        Student student = new Student("李白","男");
        GenericMethod method = new GenericMethod();
        method.method1(student);
        System.out.println("________________");
        method.method2(student);
    }
}
