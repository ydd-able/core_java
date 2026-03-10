package com.coder.homework1;

/**
 * @author N1357
 * @date 2026/3/10
 * @project core_java
 */
//2、获取用户操作系统名称，使用switch和枚举类型判断，如果是window操作系统，
// 给用户推荐IE浏览器，如果是Linux系统，给用户推荐Chrome浏览器
public class Test1 {
    public static void main(String[] args) {
        String property = System.getProperty("os.name");
        System.out.println(property);
        property = property.substring(0,property.indexOf(" ")).toUpperCase();
        //System.out.println(property);
        switch (SystemEnum.valueOf(property)){
            case WINDOWS:
                System.out.println("推荐使用IE浏览器");
                break;
            case LINUX:
                System.out.println("推荐使用Chrome浏览器");
                break;
            case MAC:
                System.out.println("推荐使用360浏览器");



        }


    }
}
