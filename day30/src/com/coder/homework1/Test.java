package com.coder.homework1;

import java.lang.reflect.Field;

/**
 * @author N1357
 * @since 2026/4/9
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Class<Student> studentClass = Student.class;
        Student student = studentClass.getDeclaredConstructor().newInstance();
        Field[] fields = studentClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Value annotation = field.getAnnotation(Value.class);
            String value = annotation.value();
            if (field.getType().getSimpleName().equals("int")) {
                field.set(student, Integer.parseInt(value));
            } else
                field.set(student, value);
        }
        System.out.println(student);

    }
}
