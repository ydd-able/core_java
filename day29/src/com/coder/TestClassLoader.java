package com.coder;

/**
 * @author N1357
 * @date 2026/4/7
 * @project core_java
 */
public class TestClassLoader {
    public static void main(String[] args) {
        ClassLoader classLoader = TestClassLoader.class.getClassLoader();
        System.out.println(classLoader);
        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);


    }
}
