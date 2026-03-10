package com.coder.system;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

/**
 * @author N1357
 * @date 2026/3/10
 * @project core_java
 */
public class Test {
    public static void main(String[] args) throws IOException {
       /* System.currentTimeMillis();//获取1970-01-01 00：00：00到现在的毫秒数。
        String java_home= System.getenv("JAVA_HOME");//获取指定环境变量
        System.out.println(java_home);
*/
       /* Properties properties = System.getProperties();
        properties.store(new FileWriter("D:/properties.txt"),"testSystem");//获取系统所有属性。
        String s = System.getProperty("os.name");
        System.out.println(s);
        String country = System.getProperty("user.country");
        System.out.println(country);*/
        int[] x = {1,2,3,4,5,6};
        int[] y = {10,20,30,40,50};
        System.arraycopy(x,0,y,1,3);//从源数组指定索引位置复制给定长度到目标数组的索引位。
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
    }
}
