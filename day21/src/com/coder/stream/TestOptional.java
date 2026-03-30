package com.coder.stream;

import java.util.Optional;

/**
 * @author N1357
 * @date 2026/3/17
 * @project core_java
 */
public class TestOptional {
    public static void main(String[] args) {
      /*  Optional<String> optional = Optional.empty();
        System.out.println(optional.get());*/
        //Optional<String> optional  = Optional.ofNullable(getValue());
        //optional.orElseGet(()->"hi");
        Student student = null;
        Optional<Student> optional1 = Optional.ofNullable(student);
        Student student1 = optional1.orElse(new Student("李白", "男"));
        System.out.println(student1);
        Student student2 = optional1.orElseGet(() -> new Student("李白", "男"));
        System.out.println(student2);






       /* boolean b = optional.isPresent();
        if(b){
            System.out.println(optional.get());
        }else{
            System.out.println("不存在");
        }*/


    }

    public static String getValue() {
        double d = Math.random();
        return d > 0.5 ? "hello" : null;
    }


}
