package com.coder.link;

import java.util.LinkedList;

/**
 * @author N1357
 * @date 2026/3/10
 * @project core_java
 */
public class TestLInkList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.addFirst("DDD");
        list.addLast("XXX");
        list.add(2,"YYY");
        for (String s : list) {
            System.out.println(s);
        }



    }
}
