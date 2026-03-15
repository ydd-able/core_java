package com.coder.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author N1357
 * @date 2026/3/13
 * @project core_java
 */
//HashTable是线程安全的。
public class TestTreeMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(100,"语文");
        map.put(90,"数学");
        map.put(95,"地理");
        map.put(70,"政治");
        System.out.println(map);

        Hashtable<Integer,String> table = new Hashtable<>();

    }
}
