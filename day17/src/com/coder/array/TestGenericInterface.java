package com.coder.array;

/**
 * @author N1357
 * @date 2026/3/6
 * @project core_java
 */
public class TestGenericInterface {
    public static void main(String[] args) {
       /* GenericInterface<String> x = new Impl();
        x.showValue("hello");*/
        GenericInterface<Integer> y = new Impl1<>();
        y.showValue(123);
    }
}
