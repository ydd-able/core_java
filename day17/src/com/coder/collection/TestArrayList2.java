package com.coder.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author N1357
 * @date 2026/3/7
 * @project core_java
 */
public class TestArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(345);
        list.add(1,342);
       /* System.out.println(list.size());//返回集合中元素的个数。
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(234);
        list1.add(123);
        list.addAll(1,list1);
        System.out.println(list);
        list.remove(Integer.valueOf(123));
        System.out.println(list);
        list.remove(1);
        list.remove(Integer.valueOf(111));//删除第一个出现的元素。
        */
        Object[] objects = list.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }
        int i = list.indexOf(111);
        int j = list.lastIndexOf(222);
        System.out.println(i+','+j);




    }
}
