package com.coder.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author N1357
 * @date 2026/3/20
 * @project core_java
 */
public class TestCollectToCollection {
    public static void main(String[] args) {
      toCollection();
    }
    public static void toCollection(){
        ArrayList<String> collect = Stream.of("abc","ddd","xx")
                .collect(Collectors.toCollection(ArrayList::new));
        collect.forEach(System.out::println);

    }

    public static void toMap() {
        List<Emp> list = Arrays.asList(
                new Emp("李白", 22, 12000),
                new Emp("杜甫", 28, 12000),
                new Emp("白居易", 25, 11000),
                new Emp("李贺", 24, 8000));
        Map<String, Emp> map = list.stream().filter(e -> e.getSal() >= 10000).collect(Collectors.toMap(Emp::getName, e -> e));
        map.forEach((k,v)-> System.out.println(k+"\t"+v));


    }

    public static void toSet() {
        Set<Integer> set = Stream.of(1, 2, 3, 4, 5, 6, 7)
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toSet());
        set.forEach(System.out::println);
    }

    public static void toList() {
        List<Emp> list = Arrays.asList(
                new Emp("李白", 22, 12000),
                new Emp("杜甫", 28, 12000),
                new Emp("白居易", 25, 11000),
                new Emp("李贺", 24, 8000));
        //转成list
        List<Emp> newList = list.stream().filter(e -> e.getName().startsWith("李")).collect(Collectors.toList());
        newList.forEach(System.out::println);
    }

}
