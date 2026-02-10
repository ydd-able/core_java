package com.coder.homework3;

public class Women implements Person{
    @Override
    public void eat() {
        System.out.println("女人在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("女人在睡觉");
    }

    @Override
    public void speak() {
        System.out.println("女人在说话");
    }
}
