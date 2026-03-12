package com.coder.util;
import java.util.*;

/**
 * @author N1357
 * @date 2026/3/11
 * @project core_java
 */
public class Test {
    public static void main(String[] args) {
     /*   Student student = new Student("李白", 178);
        Student student1 = new Student("李白", 188);
        Student student2 = new Student("李白", 175);
        Student student3 = new Student("李白", 182);
        List<Student> list = new ArrayList<>(4);
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return Integer.compare(o1.getHeight(), o2.getHeight());
                    }
                }
        );//匿名内部类。
        System.out.println(list);*/
        List<Integer> list  = new ArrayList<>();
        list.add(25);
        list.add(46);
        list.add(32);
        list.add(10);
        list.add(98);
        list.add(98);
        Collections.replaceAll(list,98,1200);
        int i = Collections.frequency(list,1200);//元素出现的频率。
        System.out.println(i);





      /*  System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);//洗牌，打乱顺序。
        System.out.println(list);
        Collections.swap(list,0,4);//交换两个索引位置的元素。
        */





    }

}
