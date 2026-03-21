package com.coder.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author N1357
 * @date 2026/3/21
 * @project core_java
 */
public class TestJoining {
    public static void main(String[] args) {
        List<Employer> list = Arrays.asList(
                new Employer("李白",25,"研发部","男"),
                new Employer("杜甫",28,"研发部","女"),
                new Employer("陆游",27,"研发部","女"),
                new Employer("白居易",35,"测试部","男"),
                new Employer("李商隐",28,"测试部","女")
        );
        //将所有员工的姓名拼接成一个字符
        //joining无参，直接拼接。
       /* String collect = list.stream().map(Employer::getName).collect(Collectors.joining());
        System.out.println("collect = " + collect);
*/
       /* String str = list.stream().map(Employer::getName).collect(Collectors.joining("_"));
        System.out.println("str = " + str);*/

        //三个参数。连接符号，前缀，后缀。
        String collect = list.stream().map(Employer::getName).collect(
                Collectors.joining("_", "|", "|")
        );
        System.out.println(collect);


    }
}
