package com.coder.homework4;

public class YangRopeFactory extends Factory{
    @Override
    public Person createPerson() {
        return new Man();
    }
}
