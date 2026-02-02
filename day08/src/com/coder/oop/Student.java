package com.coder.oop;

public class Student {
    private String name;
    private String gender;
    private int age;
    Student(){//构造方法。可以有return,表示方法结束，不能有返回值。
       name = "张三";
       gender = "男";
       age = 20;

        }

    public void showInfo(){
        System.out.println(name + "\t"+gender+"\t"+age);


        //作用:完成对象的初始化工作。


    }
}
