package com.coder.factoryMethod;

public class Test {
    public static void main(String[] args) {
        Factory factory = new AppleFactory();
        Fruit fruit = factory.getFruit();
        fruit.plant();
        fruit.grow();
        fruit.harvest();


    }
}
