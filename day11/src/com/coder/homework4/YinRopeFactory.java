package com.coder.homework4;

public class YinRopeFactory extends Factory {
    @Override
    public Person createPerson() {
        return new woman();
    }
}
