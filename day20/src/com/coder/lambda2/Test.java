package com.coder.lambda2;

/**
 * @author N1357
 * @date 2026/3/16
 * @project core_java
 */
public class Test {
    public static void main(String[] args) {
        MathInterFace interFace = i->i*10;
        System.out.println(interFace.expand10(20));
    }
}
