package com.coder.string;

/**
 * @author N1357
 * @date 2026/3/3
 * @project core_java
 */
public class TestStringBuffer {
    public static void main(String[] args) {
     /*   StringBuffer stringBuffer = new StringBuffer("abc");

        stringBuffer.append("xxx");
        System.out.println(stringBuffer);
        String x = stringBuffer.toString();//把stringBuffer对象改为
        System.out.println(x);
*/
        StringBuffer str = new StringBuffer("abc");//比String速度更快
        long t1 = System.currentTimeMillis();
        System.out.println(t1);
        for (int i = 0; i < 100000; i++) {
            str.append("bbb");

        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);

    }

}
