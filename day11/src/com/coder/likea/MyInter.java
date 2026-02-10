package com.coder.likea;

//接口格式:[访问修饰符]interface 接口名{}
public interface MyInter {
    int X = 10;//公有的静态常量。

    void test();//公有的抽象方法。
}

interface MyInter1 {
    void test1();
}

interface MyInter2 extends MyInter, MyInter1 {
    void test2();
}

class MyImpl1 implements MyInter2 {
    public void test() {
    }

    public void test1() {
    }

    public void test2() {
    }
}

class MyImpl implements MyInter {
    public void test() {

    }
}

class MyImpl2 implements MyInter {
    public void test() {

    }
}

class MyImpl3 implements MyInter, MyInter1 {
    @Override
    public void test() {

    }

    @Override
    public void test1() {

    }
}

class F {
    public void test(){

    }
}

class S extends F implements MyInter, MyInter1 {
    @Override
    public void test() {

    }

    @Override
    public void test1() {

    }
}