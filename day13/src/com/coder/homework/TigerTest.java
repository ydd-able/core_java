package com.coder.homework;

/**
 * @author N1357
 * @date 2026/3/1
 * @project core_java
 */
public class TigerTest {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(1.5,300);
        Tiger tiger1 = (Tiger)tiger.clone();
        tiger1.setHeight(1.75);
        System.out.println(tiger.equals(tiger1)?"通过检查":"没有通过检查");
        System.out.println(tiger1.toString());


    }
}
