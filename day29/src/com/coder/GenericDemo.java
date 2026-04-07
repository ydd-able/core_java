package com.coder;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author N1357
 * @date 2026/4/7
 * @project core_java
 */
public class GenericDemo {
    public static void main(String[] args) throws Exception {
        //getMethodParameter();
        getMethodReturn();
    }
    public static void getMethodReturn() throws Exception{
        Class<MyDemo> myDemoClass = MyDemo.class;
        Method getScore = myDemoClass.getDeclaredMethod("getScore");
        Type genericReturnType = getScore.getGenericReturnType();
        if(genericReturnType instanceof ParameterizedType){
            ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println(actualTypeArgument.getTypeName());
            }
        }



    }
    public static void getMethodParameter() throws Exception{
        Class<MyDemo> myDemoClass = MyDemo.class;
        Method method = myDemoClass.getDeclaredMethod("filter",List.class);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        for (Type genericParameterType : genericParameterTypes) {
            if(genericParameterType instanceof ParameterizedType){
                ParameterizedType parameterizedType = (ParameterizedType) genericParameterType;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println(actualTypeArgument.getTypeName());
                }
            }
        }


    }
    public static void getField() throws Exception {
        Class<MyDemo> myDemoClass = MyDemo.class;
        Field listField = myDemoClass.getDeclaredField("list");
        //Class<?> type = listField.getType();
        //System.out.println(type.getName());
        Type genericType = listField.getGenericType();
        System.out.println(genericType.getTypeName());
        //判断获取到的Type是不是参数化类型(泛型)
        if(genericType instanceof ParameterizedType){
            System.out.println("参数化类型");
        }

    }

}

class MyDemo {
    //成员变量带有泛型
    private List<String> list = new ArrayList<>();
    private int x ;


    //方法参数带有泛型。
    public void filter(List<String> list) {

    }

    //方法返回值带有泛型。
    public Map<String, Double> getScore() {
        return null;
    }
}
