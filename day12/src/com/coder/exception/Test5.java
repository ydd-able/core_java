package com.coder.exception;

import java.io.FileNotFoundException;

public class Test5 {
    public static void main(String[] args) {

    }
    public static void checkStudent(Student student) throws FileNotFoundException{
        if(student.getAge()<6||student.getAge()>12){
            throw new NullPointerException("年龄必须在6-12之间");
        }
        if(student.getName().length()<2){
            throw new FileNotFoundException("姓名必须是2位以上");
        }
    }
}
