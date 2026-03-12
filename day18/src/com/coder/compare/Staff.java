package com.coder.compare;

import java.util.Objects;

/**
 * @author N1357
 * @date 2026/3/11
 * @project core_java
 */
public class Staff implements Comparable<Staff> {
    private String name;
    private Integer age;
    private String gender;

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Staff() {
    }

    public Staff( String gender,Integer age, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Staff staff = (Staff) object;
        return Objects.equals(name, staff.name) && Objects.equals(age, staff.age) && Objects.equals(gender, staff.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    @Override
    public int compareTo(Staff o) {
        //按照哪个属性进行排序。
        return Integer.compare(this.age,o.age);

    }
}
