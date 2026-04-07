package com.coder.homework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author N1357
 * @date 2026/4/7
 * @project core_java
 */
public class Test03 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<String> list = new ArrayList<>();
        Class<? extends ArrayList> aClass = list.getClass();
        Method method = aClass.getDeclaredMethod("add", Object.class);
        method.invoke(list,12);
        System.out.println(list);



    }
}
