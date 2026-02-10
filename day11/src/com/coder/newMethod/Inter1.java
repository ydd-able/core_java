package com.coder.newMethod;

public interface Inter1 {
    void eat();
    default void sleep(){
        System.out.println("在床上睡觉");
    }
    static void showName(){
        System.out.println("我是中国人");//接口名调用。
    }
    private void test(){
        System.out.println("这是一段有用的代码");
    }

}
class Person1 implements Inter1{
    @Override
    public void eat() {
        System.out.println("吃米饭");
    }
}
class Person2 implements Inter1{
    @Override
    public void eat() {
        System.out.println("吃面条");
    }

}
