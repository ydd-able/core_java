package com.coder.string;

/**
 * @author N1357
 * @date 2026/3/2
 * @project core_java
 */
public class TestMethod {
    public static void main(String[] args) {
        String str = "abcabc";
        String s = str.replace("ab","HELLO");//可以对单个字符或者字符序列进行替换，前后要一致。
        System.out.println(str);
        System.out.println(s);


      /*  String str = "abc";
        boolean a = str.contains("a");//查看字符串里是否包含给定字符，如果有，就返回真。
        System.out.println(a);
        boolean ab = str.startsWith("ab");
        System.out.println(ab);
        boolean c= str.endsWith("c");//以c为结尾。
        System.out.println(c);
*/


      /*  String str = "abcdefg";
        String s = str.substring(3);//对字符串进行截取，从指定索引位置一直截取到最后。
        String s1 = str.substring(3,5);//对字符串进行截取，从指定位置开始，截取到结束位置（不包含结束位置).
        System.out.println(s1);
        System.out.println(s);
        String str2 = "   asdgfdgl   ";
        System.out.println(str2.trim());//去掉前后空格。*/

      /*  String s = str.toUpperCase();
        System.out.println(s);

        for (int i = 0; i < str.length()-1; i++) {
            char c = str.charAt(i);
            System.out.print(c+"\t");


        }*/
      /*  String str = "abcdefg";
        String str1 = "AbcDEFg";
        System.out.println(str.equals(str1));//判断两个字符串中的字面量值是否相等。
        System.out.println(str.equalsIgnoreCase(str1));//忽略大小写判断是否相等。
        System.out.println(str.indexOf('c'));//第一次出现的索引位置，找不到的话返回-1.
        System.out.println(str.lastIndexOf('e'));//查找给定值最后一次出现的位置。*/





    }
}
