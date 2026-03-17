package com.coder.lambda2;

/**
 * @author N1357
 * @date 2026/3/16
 * @project core_java
 */
@FunctionalInterface//验证是否是函数式接口。
//函数式接口只有一个抽象方法。
public interface MathInterFace {
    Integer expand10(Integer i);
    default Integer abs(Integer i){
        return Math.abs(i);
    }
}
