package com.coder.final_test;

import java.util.Random;

public class Test{
    final int i = 10;
    final int[] a = {12,23,34,45};//无法修改a。
    public static void main(String[] args) {
        final Student student = new Student();//引用类型不可以修改。
        Random random = new Random();
        int i = random.nextInt(10);
        System.out.println(i);

    }
}
final class F{}
//当一个类被定义成final时，不允许被继承。
//final里面的所有方法，都是隐式的final，不会产生子类，也不会覆盖方法，所以不需要在final类中为方法
//加关键字。
//final类可以重载。
//final定义常量:修饰引用类型:无法更改引用所指向的对象。引用的对象属性可以修改。
// 修饰基本数据类型。

class Student{
    private String name;
    private String gender;

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
}
