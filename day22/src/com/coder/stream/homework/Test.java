package com.coder.stream.homework;

import java.util.*;

/**
 * @author N1357
 * @date 2026/3/21
 * @project core_java
 */
public class Test {
    public static void main(String[] args) {
        List<Staff> list = DataBase.getStaffList();
        //公司设立部门。
       /* List<Staff> list = DataBase.getStaffList();
        Stream<String> distinct = list.stream().map(Staff::getDept).distinct();
        List<String> deptList = distinct.collect(Collectors.toList());
        deptList.forEach(System.out::println);*/

        //获取入职信息最早的员工信息。
       /* Optional<Staff> min = list.stream().min(Comparator.comparing(Staff::getHireDate));
        System.out.println(min.get());
*/
        //计算研发部门的总工资书和平均工资数。
        /*int sum = list.stream().filter(s -> s.getDept().equals("研发部"))
                .mapToInt(Staff::getSal).sum();
        System.out.println(sum);

        OptionalDouble average = list.stream().filter(s -> s.getDept().equals("研发部"))
                .mapToInt(Staff::getSal).average();
        System.out.println(average.getAsDouble());*/

        //获取所有姓李的员工，计算人数。
      /*  long count = list.stream().filter(s -> s.getName().startsWith("李")).count();
        System.out.println(count);
*/
        //把所有员工进行升序排列，年龄相同，按工资升序排列。
       /* Stream<Staff> sorted = list.stream().sorted(Comparator.comparingInt(Staff::getAge).thenComparing(Staff::getSal));
        sorted.forEach(System.out::println);
        */
        //将所有员工按照入职日期降序排列。
        /*list.stream().sorted(Comparator.comparing(Staff::getHireDate).reversed())
                .forEach(System.out::println);
*/
        //将员工按照姓名长度进行分组，2个字符的一组，3个字符的一组。
       /* Map<String, List<Staff>> collect = list.stream().collect(Collectors.groupingBy(s -> {
            if (s.getName().length() == 2) {
                return "两个字符";
            } else {
                return "三个字符";
            }
        }));
        collect.forEach((k,v)->{
            System.out.println("字符数:"+k);
            v.forEach(System.out::println);
        });

*/
        //将所有产品部门工资不足10000的员工，加薪1000元
       /* list.stream().filter(s->s.getDept().equals("产品部"))
                .filter(s->s.getSal()<10000)
                .map(s->{s.setSal(s.getSal()+1000);return s;})
                .forEach(System.out::println);
        */
        //返回所有员工的编号，按字母顺序升序排列。
        //list.stream().map(Staff::getNo).sorted().forEach(System.out::println);

        //获取所有员工的姓名，得到一个字符串数组。
        Object[] objects = list.stream().map(Staff::getName).toArray();
        for (Object object : objects) {
            System.out.println(object);
        }

    }
}
