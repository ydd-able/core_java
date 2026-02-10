package com.coder.homework3;

public class Test {
    public static void main(String[] args) {
        Person man = PersonFactory.createPerson("man");
        man.eat();
        man.sleep();
        man.speak();
        Person women = PersonFactory.createPerson("women");
        women.speak();
        women.sleep();
        women.eat();

    }
}
