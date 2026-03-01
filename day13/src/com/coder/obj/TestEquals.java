package com.coder.obj;

/**
 * @author N1357
 * @date 2026/2/25
 * @project core_java
 */
public class TestEquals {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(20);
        Teacher teacher = new Teacher();
        teacher.setAge(20);
        teacher.setName("李白");
        System.out.println(person.equals(teacher));
        System.out.println(teacher.equals(person));
    }

}

class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person) {//不一定是同一个内存地址。
            Person person = (Person) obj;
            return this.age == person.age;
        }
        return false;
    }
}

class Teacher extends Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (obj instanceof Teacher) {
            Teacher teacher = (Teacher) obj;
            return this.name.equals(teacher.name);
        }
        return super.equals(obj);//调用父类的equals方法。
    }
}