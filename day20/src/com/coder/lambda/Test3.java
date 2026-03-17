package com.coder.lambda;

import java.util.Arrays;
import java.util.function.Function;

/**
 * @author N1357
 * @date 2026/3/17
 * @project core_java
 */

public class Test3 {
    public static void main(String[] args) {
       /* Function<Integer,Integer[]> function = new Function<Integer, Integer[]>() {
            @Override
            public Integer[] apply(Integer x) {
                return new Integer[x];
            }
        }*/
        Function<Integer, Integer[]> function = Integer[]::new;
        Integer[] apply = function.apply(10);
        Arrays.fill(apply,10);
        System.out.println(Arrays.toString(apply));
        System.out.println(apply.length);

    }
}
