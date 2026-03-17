package com.coder.lambda4;

import java.util.function.Function;

/**
 * @author N1357
 * @date 2026/3/16
 * @project core_java
 */
public class TestFunction {
    public static void main(String[] args) {
        Function<Double,Double> function = (x)->(int)(x*100+0.5)/100D;//四舍五入。
        System.out.println(keep(3.1455,function));
    }
    public static double keep(double x, Function<Double,Double> function){
        return function.apply(x);
    }

}
