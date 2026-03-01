package com.coder.obj;

/**
 * @author N1357
 * @date 2026/2/25
 * @project core_java
 */
public class Student implements Cloneable{
    private String name;
    private String gender;
    private int age;

    public Student() {
    }

    public Student(String name, String gender, int age) {
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

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(this == obj){//占用同一块地址。
            return true;
        }
        if(obj instanceof Student){
            Student student= (Student)obj;
            return this.name.equals(student.name)&& this.gender.equals(student.gender)&&this.age==student.age;


        }
        return false;

    }
//建议重写equals方法的时候也重写hashcode方法。
    @Override
    public int hashCode() {
        return name.hashCode()+gender.hashCode();
    }
   /* @Override
    public String toString(){
        return "Student[name"+name+",gender"+gender+",age"+age+"]";
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
