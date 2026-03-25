package com.coder.homework;

/**
 * @author N1357
 * @date 2026/3/25
 * @project core_java
 */
public class Teacher {
    private String name;
    private String gender;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
