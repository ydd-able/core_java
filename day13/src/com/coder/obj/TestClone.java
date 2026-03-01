package com.coder.obj;

/**
 * @author N1357
 * @date 2026/3/1
 * @project core_java
 */
//clone方法：由protected修饰，一个类要重写clone方法，需要将访问修饰符改成public,保证其他所有的类都能够访问这个类的clone方法。
//clone作用:创建出一个和当前类相同类型的对象，并且属性相同。得到一个当前对象的副本，两个对象指向不同的内存地址。
//代码必须要实现cloneable接口。
//重写clone方法，使用public修饰。
//要处理CloneNotSupportedException

public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        //浅拷贝
        Student student = new Student("李白", "男", 22);
        Teachers teacher = new Teachers();
        teacher.setName("白居易");
        teacher.setStudent(student);
        Teachers teacher1 = (Teachers)teacher.clone();
        teacher.setName("李贺");
        student.setName("杜甫");
        System.out.println(teacher);
        System.out.println(teacher1);
        System.out.println(System.identityHashCode(teacher.getStudent()));
        System.out.println(System.identityHashCode(teacher1.getStudent()));



       /* Student student = new Student("李白", "男", 22);
        Student student1 = (Student) student.clone();
        student.setName("杜甫");
        System.out.println(student);
        System.out.println(student1);*/
    }
}
