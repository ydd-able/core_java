package com.coder.lambda;

import java.util.function.BiFunction;

/**
 * @author N1357
 * @date 2026/3/17
 * @project core_java
 */
public class Test2 {
    public static void main(String[] args) {
        //Supplier<Teacher> supplier = Teacher::new;
        /*Function<String , Teacher> function = Teacher::new;
        System.out.println(function.apply("李白"));*/
        BiFunction<String,Integer,Teacher> function = Teacher::new;
        System.out.println(function.apply("李白",20));




    }

}
class Teacher{
    private String name;
    private Integer age;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
