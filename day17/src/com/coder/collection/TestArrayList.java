package com.coder.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author N1357
 * @date 2026/3/6
 * @project core_java
 */
public class TestArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10);
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        //集合的循环遍历。
      /*  for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }*/
        /*for (String s : list){
            System.out.println(s);
        }*/
       /* Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        for(Iterator<String> iterator = list.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
        //32
    }
}
