package com.coder.homework;

import java.lang.reflect.Method;

/**
 * @author N1357
 * @date 2026/4/7
 * @project core_java
 */
public class Test04 {
    public static void main(String[] args) {
    }
}


class Utils{
    public static Object invokeMethod(String className,String methodName,Object[] args,Class<?>...params){
        try{
            Class<?> aClass = Class.forName(className);
            Object object = aClass.getConstructor().newInstance();
            Method method = aClass.getDeclaredMethod(methodName,params);
            method.setAccessible(true);
            return method.invoke(object,args);

        }catch(Exception e){
            e.printStackTrace();
        }
        return null;

    }

    public static Object setProperty(String className, String fieldName, Object value) {
        try {
            Class<?> clazz = Class.forName(className);
            Object obj = clazz.getDeclaredConstructor().newInstance();

            // 拼接 set 方法名：name → setName
            String setMethodName = "set" + Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1);

            Method setMethod = clazz.getDeclaredMethod(setMethodName, value.getClass());
            setMethod.setAccessible(true);
            setMethod.invoke(obj, value);

            return obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static Object setProperties(String className, String[] fieldNames, Object[] values) {
        try {
            if (fieldNames == null || values == null || fieldNames.length != values.length) {
                throw new IllegalArgumentException("属性数组和值数组长度不一致");
            }

            Class<?> clazz = Class.forName(className);
            Object obj = clazz.getDeclaredConstructor().newInstance();

            for (int i = 0; i < fieldNames.length; i++) {
                String fieldName = fieldNames[i];
                Object value = values[i];

                String setMethodName = "set" + Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1);
                Method setMethod = clazz.getDeclaredMethod(setMethodName, value.getClass());
                setMethod.setAccessible(true);
                setMethod.invoke(obj, value);
            }

            return obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}