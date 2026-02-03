package com.coder.singleTon;
//单例模式，保证一个类只能创建一个对象，自行实例化，并向整个系统提供这个对象。
public class Single {
    private Single(){
    }
    private static Single single = new Single();
    public static Single getInstance(){
        return single;
    }
}
