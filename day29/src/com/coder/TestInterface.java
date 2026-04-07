package com.coder;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author N1357
 * @date 2026/4/7
 * @project core_java
 */
public class TestInterface {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.coder.UserServiceImpl");
      /*  Type[] genericInterfaces = aClass.getGenericInterfaces();
        for (Type genericInterface : genericInterfaces) {
            if(genericInterface instanceof ParameterizedType){
                ParameterizedType parameterizedType = (ParameterizedType) genericInterface;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println(actualTypeArgument.getTypeName());
                }
            }
        }
*/

       /* Class<?>[] interfaces = aClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }*/
        //获取父类。
        Class<?> superclass = aClass.getSuperclass();
        System.out.println(superclass.getName());
        Type genericSuperclass = aClass.getGenericSuperclass();
        if(genericSuperclass instanceof ParameterizedType){
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println(actualTypeArgument.getTypeName());
            }

        }
    }
}
