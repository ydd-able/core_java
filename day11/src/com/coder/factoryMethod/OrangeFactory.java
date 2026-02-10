package com.coder.factoryMethod;

public class OrangeFactory implements Factory{

    @Override
    public Fruit getFruit() {
        return new Orange();
    }
}
