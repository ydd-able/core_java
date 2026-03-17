package com.coder.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author N1357
 * @date 2026/3/17
 * @project core_java
 */
//10个100以内的随机数。
public class Test2 {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> new Random().nextInt(100);
        List<Integer> list = createNum(10,supplier);
        list.forEach(System.out::println);
        System.out.println("____");

        Predicate<Integer> predicate = x-> x%2==0;
        List<Integer> newList = filter(list,predicate);
        newList.forEach(System.out::println);



    }
    public static List<Integer> createNum(int x ,Supplier<Integer> supplier){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            list.add(supplier.get());
        }
        return list;
    }



//向一个集合中加入10个100以内的随机数。
    public static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate){
            List<Integer> newList = new ArrayList<>();
        for (Integer x : list) {
            boolean b = predicate.test(x);
            if(b){
                newList.add(x);
            }

        }
        return newList;
    }
}
