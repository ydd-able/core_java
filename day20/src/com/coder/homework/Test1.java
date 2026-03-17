package com.coder.homework;

import java.util.function.BinaryOperator;

/**
 * @author N1357
 * @date 2026/3/17
 * @project core_java
 */
public class Test1 {
    public static void main(String[] args) {
        BinaryOperator<Integer> operator = Integer::sum;
        operate(10,20,operator);

    }
    public static void operate(Integer x , Integer y,BinaryOperator<Integer> operator){
        Integer apply = operator.apply(x, y);
        System.out.println("apply = " + apply);

    }
}
