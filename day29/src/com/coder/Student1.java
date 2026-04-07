package com.coder;

/**
 * @author N1357
 * @date 2026/4/5
 * @project core_java
 */
public class Student1 extends Stu {
    private String name;
    private int age;
    String gender;
    protected String address;
    public int number;

    public Student1() {
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public int add(int x,int y){
        return x+y;
    }
}
