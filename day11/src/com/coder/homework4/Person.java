package com.coder.homework4;

public abstract class Person {
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public abstract void speak();
}
