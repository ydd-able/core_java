package com.coder.staticoverride;

public class Test {
    public static void main(String[] args) {
       /* F.test();
        S.test();*/
        F f = new S();
        f.test();
    }
}
class F{
    public static void test(){
        System.out.println("父类的静态方法");
    }
}
class S extends F{
    public static void test(){
        System.out.println("子类的静态方法");
    }
}