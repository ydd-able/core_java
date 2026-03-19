package com.coder.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author N1357
 * @date 2026/3/17
 * @project core_java
 */
public class CreateTest {
    public static void main(String[] args) {
        /*Stream<String> stream = Stream.of("AA3","BB","CC");
        stream.filter(x->x.length()==3).forEach(System.out::println);
*//*
        Stream<Integer> stream = Stream.iterate(0,x->x+2);
        stream.limit(10).forEach(System.out::println);
*/

        Stream<Double> stream = Stream.generate(Math::random);
        stream.forEach(System.out::println);




    }
}
