package com.coder;

/**
 * @author N1357
 * @date 2026/4/5
 * @project core_java
 */
//哪些类型可以有class对象。
//接口也可以有class对象。
public class TestClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.coder.Student1");//通过包名。
        Class<?> clazz2 = Student1.class;//

        Student1 student = new Student1();
        Class<?>  clazz3 = student.getClass();//通过new一个类。

        Class<Status> statusClass = Status.class;
        Class<Integer> integerClass = int.class;



    }
    public void test() throws ClassNotFoundException {
       Student1 student = new Student1();
        ClassLoader loader = student.getClass().getClassLoader();//类的装载器
        Class<?> clazz = loader.loadClass("com.coder.Student1");

        int[] x = {1,2,3};
        Class<?extends int[]> aClass = x.getClass();
    }
}
enum Status{

}