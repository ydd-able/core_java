package com.coder.homework1;

/**
 * @author N1357
 * @since 2026/4/9
 */
public class Student {
    @Value(value = "李白")
    private String name;
    @Value("男")
    private String gender;
    @Value("20")
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
