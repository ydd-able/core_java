package com.coder.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author N1357
 * @date 2026/3/19
 * @project core_java
 */
public class TestFlatMap {
    public static void main(String[] args) {
        String str = "a,b,c,d,e";
        String str1 = "m,n,j";
        List<String> list = Arrays.asList(str, str1);
        Stream<String> stringStream = list.stream().flatMap(TestFlatMap::f);
        stringStream.forEach(System.out::println);


    }
    public static Stream<String> f(String str){
        String[] strs = str.split(",");
        Stream<String> stream = Arrays.stream(strs);
        return stream;
    }
}
