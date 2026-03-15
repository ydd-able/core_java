package com.coder.homework2;

import java.util.Map;

/**
 * @author N1357
 * @date 2026/3/15
 * @project core_java
 */
public class Student {
    private String name;
    private Map<String, Double> scores;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Double> getScores() {
        return scores;
    }

    public void setScores(Map<String, Double> scores) {
        this.scores = scores;
    }
}
