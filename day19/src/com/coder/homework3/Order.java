package com.coder.homework3;

import java.util.Queue;

/**
 * @author N1357
 * @date 2026/3/15
 * @project core_java
 */
public class Order {
    private String no;
    private Queue<String> defaultProcess;//默认流程
    private Queue<String> completedProcess;//已完成的流程。

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Queue<String> getDefaultProcess() {
        return defaultProcess;
    }

    public void setDefaultProcess(Queue<String> defaultProcess) {
        this.defaultProcess = defaultProcess;
    }

    public Queue<String> getCompletedProcess() {
        return completedProcess;
    }

    public void setCompletedProcess(Queue<String> completedProcess) {
        this.completedProcess = completedProcess;
    }
}
