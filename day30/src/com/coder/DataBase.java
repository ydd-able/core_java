package com.coder;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author N1357
 * @since 2026/4/8
 */
@AnnoDoc
public class DataBase {
    @AnnoDoc
    public void test(){

    }
    public static void main(String[] args) throws NoSuchMethodException {
       /* Class<DataBase> dataBaseClass = DataBase.class;
        Annotation[] annotations = dataBaseClass.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }*/
        Class<Sub> subClass = Sub.class;
        Annotation[] annotations = subClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
       /* Method test = subClass.getMethod("test");
        System.out.println("test = " + test);
        Annotation[] annotations = test.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }*/


    }
}

class Sub extends DataBase {
}
