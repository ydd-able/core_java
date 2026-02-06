package com.coder.Poly;

public class Test {
    public static void main(String[] args) {
        WhiteHorse horse = new WhiteHorse();
        Person person = new Person();
        person.ride(horse);
    }
}
class Person{
    public void ride(Horse horse){
        if(horse instanceof WhiteHorse){//判断一个对象是否属于某个类，返回boolean类型的值，
            System.out.println("为马洗澡");
        }
        System.out.println("人骑马");
        horse.run();
    }
}
abstract class Horse {
    public abstract void run();
}

class WhiteHorse extends Horse {
    @Override
    public void run() {
        System.out.println("白马跑");
    }
}

class BlacjkHorse extends Horse {
    @Override
    public void run() {
        System.out.println("黑马跑");
    }
}

