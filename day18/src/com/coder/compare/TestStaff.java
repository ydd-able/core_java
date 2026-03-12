package com.coder.compare;

import java.util.TreeSet;

/**
 * @author N1357
 * @date 2026/3/11
 * @project core_java
 */
public class TestStaff {
    public static void main(String[] args) {
        TreeSet<Staff> set = new TreeSet<>();
        set.add(new Staff("李白",25,"男"));
        set.add(new Staff("杜甫",22,"女"));
        set.add(new Staff("白居易",28,"男"));
        set.add(new Staff("李商隐",24,"男"));
        System.out.println(set);

    }
}
