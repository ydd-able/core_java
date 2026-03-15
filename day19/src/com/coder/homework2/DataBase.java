package com.coder.homework2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author N1357
 * @date 2026/3/15
 * @project core_java
 */
public class DataBase {
    private static List<Student> list;

    static {
        list = new ArrayList<>();
        String[] names = {"李白", "杜甫", "白居易", "李商隐"};
        String[] subjects = {"语文", "数学", "英语", "地理"};
        Double[][] scores = {{98.0, 70.0, 60.0, 95.0},
                {98.0, 80.0, 85.0, 90.0},
                {95.0, 85.0, 55.0, 80.0},
                {90.0, 50.0, 58.0, 70.0}};
        for (int i = 0; i < names.length; i++) {
            Student student = new Student();
            student.setName(names[i]);
            Map<String, Double> score = new HashMap<>();
            for (int j = 0; j < subjects.length; j++) {
                score.put(subjects[j], scores[i][j]);
            }
            student.setScores(score);
            list.add(student);
        }


    }
    public static List<Student> getList(){
        return list;
    }

}
