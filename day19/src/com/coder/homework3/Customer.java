package com.coder.homework3;

import java.util.Queue;

/**
 * @author N1357
 * @date 2026/3/15
 * @project core_java
 */
public class Customer {
    public void search(Order order){
        Queue<String> defaultProcess = order.getDefaultProcess();
        System.out.println(defaultProcess.peek());

    }
}
