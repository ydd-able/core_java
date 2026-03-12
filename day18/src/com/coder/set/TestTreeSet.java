package com.coder.set;

import java.util.TreeSet;

/**
 * @author N1357
 * @date 2026/3/11
 * @project core_java
 */
public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set  = new TreeSet<>();//底层是二叉树。
        set.add(100);
        set.add(80);
        set.add(93);
        set.add(56);
        set.add(24);
        set.add(45);
        System.out.println(set);//采用中序遍历，将数据读取出来。所以对于TreeSet来讲，不管放入什么元素顺序，读取出来都是升序排列。


    }
}
