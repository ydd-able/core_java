package com.coder.array;

/**
 * @author N1357
 * @date 2026/3/6
 * @project core_java
 */
public interface GenericInterface<T> {
    void showValue(T value);
}
class  Impl implements GenericInterface<String>{
    @Override
    public void showValue(String value){
        System.out.println(value);

    }
}
class Impl1<T> implements GenericInterface<T>{
    @Override
    public void showValue(T value){
        System.out.println(value);

    }
}
