package com.coder.array;

/**
 * @author N1357
 * @date 2026/3/6
 * @project core_java
 */
public class TestGenericClass {
    public static void main(String[] args) {
        GenericClass<Integer> c = new GenericClass<>(123);
        System.out.println(c.getValue());
        c.setValue(456);
        System.out.println(c.getValue());
    }
}
