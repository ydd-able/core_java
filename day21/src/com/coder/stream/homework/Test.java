package com.coder.stream.homework;

import java.util.List;

/**
 * @author N1357
 * @date 2026/3/18
 * @project core_java
 */
public class Test {
    public static void main(String[] args) {
        List<Staff> list = DataBase.getStaffList();
        PersonDept dept = new PersonDept();
        dept.isOver(list);
        dept.checkGender(list);
        dept.checkSalAndHireDate(list);
        dept.count(list);
        dept.maxSal(list);
        dept.minAge(list);
        dept.getFirstLetter(list);





    }
}
