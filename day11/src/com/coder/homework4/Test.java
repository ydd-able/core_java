package com.coder.homework4;

public class Test {
    public static void main(String[] args) {
        Factory factory = new YinRopeFactory();
        Person woman = factory.createPerson();
        woman.eat();
        woman.sleep();
        woman.speak();

        Factory factory1 = new YangRopeFactory();
        Person man = factory1.createPerson();
        man.speak();
        man.sleep();
        man.eat();
    }
}