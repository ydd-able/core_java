package com.coder.obj;

/**
 * @auther N1357
 * @date 2026/2/25
 * @project core_java
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(A.class.getSuperclass().getName());
    }
}
class A{

}
class B extends A{

}