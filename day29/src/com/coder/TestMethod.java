package com.coder;

import java.lang.reflect.Method;

/**
 * @author N1357
 * @date 2026/4/7
 * @project core_java
 */
public class TestMethod {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("com.coder.Student1");
        Method[] methods = aClass.getMethods();//获取本类的所有公共方法和父类的公共方法。
        methods = aClass.getDeclaredMethods();//获取本类的所有方法，不带父类。
        for (Method method : methods) {
            System.out.print(method.getModifiers()+" ");
            System.out.println(method.getName());
            //获取方法的返回值类型
            Class<?> returnType = method.getReturnType();
            System.out.println(returnType.getSimpleName());
            //方法的参数
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("\t"+parameterType.getSimpleName());
            }


        }
        //获取一个方法，然后调用。
        Object obj = aClass.getConstructor().newInstance();
        Method addMethod = aClass.getDeclaredMethod("add", int.class, int.class);
        Object result = addMethod.invoke(obj, 10, 20);
        System.out.println(result);


    }

}
