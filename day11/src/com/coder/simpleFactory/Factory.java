package com.coder.simpleFactory;

public class Factory {
    //里氏代换原则
    public static Fruit getFruit(String s) {
        if ("apple".equals(s)) {

            return new Apple();
        } else if ("banana".equals(s)) {

            return new Banana();
        } else if ("orange".equals(s)) {
            return new Orange();
        } else {
            return null;
        }
    }
}
