package com.coder.objArray;

public class Teacher {
    public void sign(Student[] student) {
        for (Student student1 : student) {
            String gender = student1.getGender();
            if (gender.equals("男")) {
                System.out.println(student1.getName() + "到");
            } else {
                System.out.println(student1.getName() + "到");
            }
        }
    }
}
