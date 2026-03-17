package com.coder.lambda;

import java.util.function.Consumer;

/**
 * @author N1357
 * @date 2026/3/17
 * @project core_java
 */
public class Test4 {
    public static void main(String[] args) {

    }
}
class XX{
    public void test1(String str){


    }
    public void test2(String str){
        Consumer<String> consumer = this::test1;//调用自己类中的方法。
        consumer.accept("我累了");

    }
}
