package com.coder;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author N1357
 * @since 2026/4/8
 */
public class TestGetMethodAnnotation {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<Team> teamClass = Team.class;
        Method method = teamClass.getDeclaredMethod("test");
      /*  Annotation[] annotations = method.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        */
        Anno4 anno4 = method.getDeclaredAnnotation(Anno4.class);
        String value = anno4.value();//读取到配置的值。
        System.out.println(value);


    }
}
