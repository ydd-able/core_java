package com.coder.homework3;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author N1357
 * @date 2026/3/15
 * @project core_java
 */
public class Com {
    public void doProcess(Order order) {
        Queue<String> defaultProcess = order.getDefaultProcess();
        Queue<String> completedProcess = order.getCompletedProcess();
        if (completedProcess == null) {
            completedProcess = new ArrayDeque<>();
        }
        String peek = defaultProcess.peek();
        if (!peek.equals("已全部完成")) {
            String process = defaultProcess.poll();
            completedProcess.offer(process);
        }

    }
}
