package com.coder.objArray;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("李白", "男");
        Student student1 = new Student("李清照", "女");
        Student student2 = new Student("杜甫", "男");
        Teacher teacher = new Teacher();
        Student[] students = new Student[3];
        students[0] = student;
        students[1] = student1;
        students[2] = student2;
        teacher.sign(students);

    }
}
