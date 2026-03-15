package com.coder.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author N1357
 * @date 2026/3/13
 * @project core_java
 */
public class Test1 {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < 12; i++) {
            map.put(i,i);
        }
        System.out.println(map);

    }
}
