package com.coder.singleTon;

public class TestSingle {
    public static void main(String[] args) {
       SingleTon2 single = SingleTon2.getInstance();
       SingleTon2 single1 = SingleTon2.getInstance();
        System.out.println(single ==single1);
        Runtime runtime;
    }
}
