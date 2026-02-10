package com.coder.homework3;

public class Man implements Person{
    @Override
    public void eat() {
        System.out.println("男人在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("男人在睡觉");
    }

    @Override
    public void speak() {
        System.out.println("男人在说话");
    }
}
