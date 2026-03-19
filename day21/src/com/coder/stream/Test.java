package com.coder.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author N1357
 * @date 2026/3/17
 * @project core_java
 */
//王者荣耀的游戏。
public class Test {
    public static void main(String[] args) {
        List<Hero> list = new ArrayList<>(3);
        list.add(new Hero("亚瑟",10000));
        list.add(new Hero("项羽",14000));
        list.add(new Hero("小乔",4000));
        list.add(new Hero("李元芳",4500));
        Stream<Hero> stream = list.stream();
        List<Hero> newList = stream.filter(hero -> hero.getBlood() < 5000).collect(Collectors.toList());
        newList.forEach(System.out::println);


    }
    public static void enhanced(List<Hero> list){

    }
}
