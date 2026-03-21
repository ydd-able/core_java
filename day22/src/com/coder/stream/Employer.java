package com.coder.stream;

/**
 * @author N1357
 * @date 2026/3/21
 * @project core_java
 */
public class Employer {
    private String name;
    private Integer age;
    private String dept;
    private String gender;

    public Employer(String name, Integer age, String dept, String gender) {
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dept='" + dept + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
