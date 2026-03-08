package com.coder.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @author N1357
 * @date 2026/3/6
 * @project core_java
 */
public class TestIterator {
    public static void main(String[] args) {
        //固定一个集合的大小，不可以添加数据,也不可以删除。
        List<String> list = new ArrayList<>();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        ListIterator<String> iterator = list.listIterator();
        iterator.add("EEE");
        System.out.println(list);
        for(;iterator.hasNext();){
            System.out.println(iterator.next());

        }
    }
}
