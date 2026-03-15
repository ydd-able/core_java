package com.coder.queue;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

/**
 * @author N1357
 * @date 2026/3/15
 * @project core_java
 */
//在使用到栈类型的时候，推荐使用deque,而不是stack。

public class TestDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(123);
        deque.addLast(456);
        deque.add(789);
        deque.addFirst(123);
        deque.offerFirst(3233);
        deque.getFirst();

        System.out.println(deque);



    }
}
