package com.coder.factoryMethod;

public class AppleFactory implements Factory{
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
