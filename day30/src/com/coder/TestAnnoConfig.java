package com.coder;

import java.lang.reflect.Field;

/**
 * @author N1357
 * @since 2026/4/9
 */
@Config(
        className = "com.coder.School",
        propertyName = "address",
        propertyValue = "北京西直门大街"
)
public class TestAnnoConfig {
    public static void main(String[] args) throws Exception {

        //通过反射得到注解中的内容
        Class<TestAnnoConfig> aClass = TestAnnoConfig.class;
        Config annotation = aClass.getAnnotation(Config.class);
        String className = annotation.className();
        String propertyName = annotation.propertyName();
        String propertyValue = annotation.propertyValue();


        Class<?> x = Class.forName(className);
        Object obj = x.getDeclaredConstructor().newInstance();
        Field field = x.getDeclaredField(propertyName);
        field.setAccessible(true);
        field.set(obj,propertyValue);
        System.out.println(obj);



    }
}
