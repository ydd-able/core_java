package com.coder.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author N1357
 * @date 2026/3/20
 * @project core_java
 */
public class TestSorted {
    public static void main(String[] args) {
        List<Staff> list = Arrays.asList(
                new Staff("李白", 22, 10000),
                new Staff("杜甫", 28, 12000),
                new Staff("白居易", 25, 15000));
        list.stream().sorted().forEach(System.out::println);
        list.stream().filter(s->s.getSal()>=12000).sorted().forEach(System.out::println);


    }
}
