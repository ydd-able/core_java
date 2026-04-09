package com.coder;

import java.lang.reflect.Field;
import java.util.ResourceBundle;

/**
 * @author N1357
 * @since 2026/4/9
 */
public class TestRef {
    public static void main(String[] args) throws Exception {
        ResourceBundle bundle = ResourceBundle.getBundle("config");
        String className = bundle.getString("class.name");
        String propertyName = bundle.getString("property.name");
        String propertyValue = bundle.getString("property.value");
        System.out.println(propertyValue);

        Class<?> aClass = Class.forName(className);
        Object obj = aClass.getDeclaredConstructor().newInstance();
        Field field = aClass.getDeclaredField(propertyName);
        field.setAccessible(true);
        field.set(obj,propertyValue);
        System.out.println(obj);


    }
}
