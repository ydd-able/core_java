package com.coder.array;

/**
 * @author N1357
 * @date 2026/3/6
 * @project core_java
 */
public class GenericMethod {
    public <T> void method1(T t){
        System.out.println(t.toString());
    }
    public <T> T  method2(T t){
        System.out.println(t.getClass().getName());
        return t;
    }
}
class Student{
    private String name;
    private String gender;

    public Student(String gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

