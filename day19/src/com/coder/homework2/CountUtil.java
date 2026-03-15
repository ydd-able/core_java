package com.coder.homework2;

import java.util.*;

/**
 * @author N1357
 * @date 2026/3/15
 * @project core_java
 */
public class CountUtil {
    public static Map<String, Double> sum(List<Student> list) {
        Map<String, Double> map = new HashMap<>();
        for (Student student : list) {
            double sum = 0;
            Map<String, Double> scores = student.getScores();
            for (Map.Entry<String, Double> entry : scores.entrySet()) {
                sum += entry.getValue();
            }
            map.put(student.getName(), sum);
        }
        return map;
    }

    public static Map<String, Double> avg(List<Student> list) {
        int s = list.get(0).getScores().size();
        Map<String, Double> map = sum(list);
        Map<String, Double> avgMap = new HashMap<>();
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            avgMap.put(entry.getKey(), entry.getValue() * 1.0 / s);

        }
        return avgMap;

    }

    public static double sum(List<Student> list, String subject) {
        double sum = 0;
        for (Student student : list) {
            Map<String, Double> scores = student.getScores();
            for (Map.Entry<String, Double> entry : scores.entrySet()) {
                if (entry.getKey().equals(subject)) {
                    sum += entry.getValue();
                }
            }
        }
        return sum;
    }

    public static double avg(List<Student> list, String subject) {
        double sum = sum(list, subject);
        return sum / list.size();
    }

    public static int countNoPass(List<Student> list) {
        int count = 0;
        for (Student student : list) {
            Map<String, Double> scores = student.getScores();
            for (Map.Entry<String, Double> entry : scores.entrySet()) {
                if (entry.getValue() < 60) {
                    count++;
                    break;
                }
            }

        }
        return count;
    }

    public static void add10(List<Student> list) {
        for (Student student : list) {
            Map<String, Double> scores = student.getScores();
            for (Map.Entry<String, Double> entry : scores.entrySet()) {
                if (entry.getValue() < 60) {
                    scores.put(entry.getKey(), entry.getValue() * 1.1);
                }
            }

        }
    }

    public static void print(List<Student> list) {
        for (Student student : list) {
            System.out.println(student.getName());
            Map<String,Double> scores = student.getScores();
            for (Map.Entry<String, Double> entry : scores.entrySet()) {
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
            
        }
    }
}