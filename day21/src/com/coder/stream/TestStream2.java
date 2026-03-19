package com.coder.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author N1357
 * @date 2026/3/18
 * @project core_java
 */
public class TestStream2 {
    public static void main(String[] args) {
      /*  Stream<Integer> stream = Stream.of(5,8,21,32,19);
        stream.filter(x->x>20).forEach(System.out::println);

*/
        List<Hero> list = new ArrayList<>();
        list.add(new Hero("亚瑟",10000));
        list.add(new Hero("项羽",10000));
        list.add(new Hero("项羽",14000));
        list.add(new Hero("米莱迪",5000));
       /* list.stream().filter(hero -> hero.getName().length()==2&&hero.getBlood()<=12000)
                .forEach(System.out::println);*/
        doFilter(hero -> hero.getName().length()==2,list);


    }
    public static void doFilter(Predicate<Hero> predicate,List<Hero> list){
        list.stream().filter(predicate).forEach(System.out::println);




    }
}
