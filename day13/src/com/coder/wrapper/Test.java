package com.coder.wrapper;

/**
 * @author N1357
 * @date 2026/3/1
 * @project core_java
 */
//int的包装类是Integer
//char的包装类是Character
//除了以上两种，其他的包装类都是把基本数据类型的首字母进行大写处理。

//将基本数据类型和字符串进行转换可以用valueOf()方法;
//将字符串转成包装类，调用valueOf()方法。
public class Test {
    public static void main(String[] args) {
      /*  int x = 100;
        Integer y = x;// Integer.valueOf(x);//自动封箱：将基本数据类型转成包装类。
        System.out.println(y + 100);
        int z = y;//y.intValue();//自动拆箱：将包装类转换成基本数据类型。
        System.out.println(y + 100);//
        Object obj  = 100;
        */
       /* String str = "123";
        Integer x = Integer.valueOf(str);
        System.out.println(x);
*//*
        String str = "123.23d1";
        Double d = Double.valueOf(str);
        double x = d.doubleValue();//xxxValue()方法。将包装类转成基本数据类型。

*/
        /*String str = "123,23e1";
        double d = Double.parseDouble(str);//把字符串转换成基本数据类型。parsexxx()方法。
        String str1 = "123";
        int x = Integer.parseInt(str1);
        long l = Long.parseLong(str1);*/
        //包装类转成String.
        Integer x = 100;
        String y = x.toString();//或者String.valueOf(x);String.valueOf()可以把任意数据类型转换为字符串。
        int compare = Integer.compare(10,20);//比大小，前面小为负，后面小为正。
        System.out.println(compare);
        String s = Integer.toBinaryString(10);
        System.out.println(s);
        //Integer有缓存处理IntegerCache,128到127之间，在此范围内，使用==判断，超过此范围，应该用equals来判断。
        char c = 'a';
        boolean lowerCase = Character.isLowerCase(c);//判断是否是小写字母。
        System.out.println(lowerCase);
        boolean upperCase = Character.isUpperCase(c);//判断是否是大写字母。
        System.out.println(upperCase);
        boolean letter = Character.isLetter(c);//判断是否是字母。
        System.out.println(letter);
        boolean digit = Character.isDigit(c);//判断是否为数字。
        System.out.println(digit);








    }
}
