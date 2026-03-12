package com.coder.compare;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author N1357
 * @date 2026/3/11
 * @project core_java
 */
public class TestStudent {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>(new Com());
        set.add(new Student("李白",178));
        set.add(new Student("杜甫",185));
        set.add(new Student("白居易",173));
        set.add(new Student("李商隐",182));
        System.out.println(set);


    }
}
class Com implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getHeight(),o2.getHeight());
    }
}
