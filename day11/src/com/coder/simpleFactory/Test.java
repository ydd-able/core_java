package com.coder.simpleFactory;

public class Test {
    public static void main(String[] args) {
        Fruit fruit = Factory.getFruit("banana");
        if(fruit!=null) {
            fruit.plant();
            fruit.grow();
            fruit.harvest();
        }else{
            System.out.println("没有这种水果");
        }
    }
}
