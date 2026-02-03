package com.coder.singleTon;
//懒汉式单例模式。
public class SingleTon2 {
    private SingleTon2(){};//私有构造方法，用private修饰，只能在类的内部被调用，外部无法通过new的关键字创建该类的对象。
    private static SingleTon2 singleton;
    public static SingleTon2 getInstance(){
        if(singleton==null){
            singleton = new SingleTon2();
        }
        return singleton;
    }


}
