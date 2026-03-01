package com.coder.obj;

/**
 * @author N1357
 * @date 2026/3/1
 * @project core_java
 */
public class Teachers implements Cloneable {
    private String name;
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Teachers obj = (Teachers) super.clone();
        obj.student = (Student) this.getStudent().clone();
        return obj;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
