package com.coder.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author N1357
 * @date 2026/3/18
 * @project core_java
 */
public class TestStream1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,23,31,56,43,42);
        list.stream().filter(x->x%6==0).forEach(System.out::println);
        //匹配第一个。
        Optional<Integer> first = list.stream().filter(x -> x > 25).findFirst();
        System.out.println(first.orElse(100));
        //查找任意一个
        Optional<Integer> any = list.stream().filter(x->x>24).findAny();
        boolean b = list.stream().anyMatch(x -> x > 25);
        System.out.println("b = " + b);



    }
}
