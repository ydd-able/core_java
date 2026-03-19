package com.coder.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author N1357
 * @date 2026/3/18
 * @project core_java
 */
public class TestStream3 {
    public static void main(String[] args) {
        List<Hero> list = new ArrayList<>();
        list.add(new Hero("亚瑟",10000));
        list.add(new Hero("项羽",14000));
        list.add(new Hero("项羽",14000));
        list.add(new Hero("米莱迪",5000));
        list.stream().filter(hero->hero.getName().length()==2)
                //.limit(2)//限制长度。
                //skip(2)//跳过2个元素。
                .distinct()//去重操作。
                .forEach(System.out::println);

    }
}
