package com.coder.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

/**
 * @author N1357
 * @date 2026/3/17
 * @project core_java
 */
public class Test3 {
    public static void main(String[] args) {
        String[] names = {"李白","杜甫","白居易"};
        Integer[] ages = {25,26,23};
        BiFunction<String ,Integer,Student> biFunction = Student::new;
        List<Student> list = createStudent(3,names,ages,biFunction);

        list.sort((o1, o2) -> Integer.compare(o1.getAge(),o2.getAge()));
        list.forEach(System.out::println);



    }
    public static List<Student> createStudent(int x, String[] name, Integer[] age,BiFunction<String , Integer , Student> function){
        List<Student> list = new ArrayList<>(x);
        for (int i = 0; i < x; i++) {
            Student student = function.apply(name[i], age[i]);
            list.add(student);

        }
        return list;
    }
}
