package com.coder.collection;

import java.util.ArrayList;

/**
 * @author N1357
 * @date 2026/3/7
 * @project core_java
 */
public class TestRemove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("AAA");
        list.add("AAA");
        list.add("AAA");
        for (String s : list) {
            if(s.equals("AAA")){
                list.remove(s);
            }

        }
    }
}
