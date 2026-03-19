package com.coder.stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author N1357
 * @date 2026/3/18
 * @project core_java
 */
public class TestStream4 {
    public static void main(String[] args) {
        max1();
        maxLength();
        count();
    }

    public static void max1() {
        List<Integer> list = Arrays.asList(12, 23, 34, 45, 56, 67);
        Stream<Integer> stream = list.stream().filter(x -> x % 2 == 1);
        Optional<Integer> max = stream.max(Integer::compare);
        if (max.isPresent()) {
            System.out.println(max.get());
        }
    }
    //获取字符串中长度最长的数据。
    public static void maxLength(){
        List<String> list = Arrays.asList("AA","BBB","CC","DDDD","E");
        Stream<String> stream = list.stream();
        Optional<String> max = stream.max(Comparator.comparingInt(String::length));
        System.out.println(max.get());
    }
    public static void count(){
        List<Hero> list = new ArrayList<>();
        list.add(new Hero("亚瑟",10000));
        list.add(new Hero("项羽",14000));
        list.add(new Hero("项羽",14000));
        list.add(new Hero("米莱迪",5000));
        long count = list.stream().count();
        System.out.println(count);

    }
}
