package com.coder.extendsTest;
//子类不能继承父类的私有属性和方法。
public class Audi extends Car{
    public Audi(){
        System.out.println("子类构造方法调用");

    }
    public void abs(){
        System.out.println(color+"\t");
    }
}
