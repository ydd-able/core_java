package com.coder.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author N1357
 * @date 2026/3/14
 * @project core_java
 */
public class Test {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(123);//向队列中添加元素。
        queue.offer(345);//向队列中添加元素。
        Integer i = queue.remove();//删除队头
        Integer element = queue.element();//取队头元素。
        System.out.println(i);
        System.out.println(queue);

    }
}
