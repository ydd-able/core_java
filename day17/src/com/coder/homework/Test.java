package com.coder.homework;

import java.util.List;

/**
 * @author N1357
 * @date 2026/3/8
 * @project core_java
 */
public class Test {
    public static void main(String[] args) {
        //DataBase.showStaffInfo();
        AccountDept accountDept = new AccountDept();
        List<Staff> list = DataBase.getList();
        //财务部门操作。
      /*  int c = accountDept.sum(list,"C");
        int t = accountDept.sum(list,"T");
        System.out.println("研发部门工资总额:"+c);
        System.out.println("测试部门工资总额:"+t);
        double dc = accountDept.avg(list,"C");
        System.out.println("研发部门平均工资:"+dc);
        double dt = accountDept.avg(list,"T");
        System.out.println("测试部门平均工资:"+dt);*/
        //人事部门操作
       /* PersonnelDept dept = new PersonnelDept();
        dept.fire(list,"上海市");
        DataBase.showStaffInfo();*/
        PersonnelDept dept = new PersonnelDept();
        dept.addSal(list,70);
        DataBase.showStaffInfo();
    }
}
