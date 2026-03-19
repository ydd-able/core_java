package com.coder.stream;

/**
 * @author N1357
 * @date 2026/3/18
 * @project core_java
 */
public class Student {
    private String name;
    private String gender;

    public Student(String name, String gender) {
        System.out.println("执行了student构造方法");
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
