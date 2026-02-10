package com.coder.factoryMethod;

public class BananaFactory implements Factory{

    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
