package com.coder;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author N1357
 * @date 2026/4/7
 * @project core_java
 */
public class TestField {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("com.coder.Student1");
        //获取public修饰的属性。
        Field[] fields = aClass.getFields();//读取所有公有的属性，从父类继承的也包括。
        //获取所有的private default protected public修饰的属性。
        //不读取父类的属性。
       /* fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getModifiers());
            System.out.println(field.getName());
        }*/
        Field name = aClass.getDeclaredField("name");
        System.out.println(name.getName()+"\t"+name.getType().getSimpleName());

        //通过反射机制为对象赋值。
        Object obj = aClass.getDeclaredConstructor().newInstance();
        name.setAccessible(true);
        name.set(obj,"李白");
        Student1 student = (Student1)obj;
        System.out.println(student);

    }
}
