package com.coder.homework;

import com.coder.Student1;
import com.coder.test.Student;

import java.lang.reflect.Field;
import java.util.ResourceBundle;

/**
 * @author N1357
 * @date 2026/4/7
 * @project core_java
 */
public class Test02 {
    public static void main(String[] args) throws Exception {
        ResourceBundle bundle = ResourceBundle.getBundle("value");
        Class<?> aClass = Class.forName("com.coder.test.Student");
        Object object = aClass.getConstructor().newInstance();
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            String value = bundle.getString(name);
            if(field.getType().getSimpleName().equals("String")){
                field.set(object,value);
            }else if(field.getType().getSimpleName().equals("int")){
                field.set(object,Integer.parseInt(value));

            }
        }
        Student student = (Student) object;
        System.out.println(student);

    }
}
