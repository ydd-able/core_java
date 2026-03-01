package com.coder.obj;

/**
 * @author N1357
 * @date 2026/2/28
 * @project core_java
 */
//hashCode方法:哈希码（散列码）一种编码方式，在Java类中，每个对象都会有一个hashcode，Java通过hashcode来识别一个对象.
//如果没有重写，通常将内存地址转换为int数组进行返回。通过hashcode方法，获取到一个int值，这个值就是hash码
public class TestHashCode {
    public static void main(String[] args) {
       Student student = new Student("李白","男",22);
       System.out.println(student.hashCode());
       Student student1 = new Student("李白","男",22);
       System.out.println(student1.hashCode());//确定对象在hash表中的存储位置。
    }
}
