package com.coder.stream;

import java.util.Objects;

/**
 * @author N1357
 * @date 2026/3/20
 * @project core_java
 */
public class Emp {
    private String name;
    private Integer age;
    private Integer sal;

    public Emp() {
    }

    public Emp(String name, Integer age, Integer sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
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

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Emp emp = (Emp) object;
        return Objects.equals(name, emp.name) && Objects.equals(age, emp.age) && Objects.equals(sal, emp.sal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sal);
    }
}
