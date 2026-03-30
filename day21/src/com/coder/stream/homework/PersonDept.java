package com.coder.stream.homework;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author N1357
 * @date 2026/3/18
 * @project core_java
 */
public class PersonDept {
    public void isOver(List<Staff> staffList) {
        boolean b = staffList.stream()
                .filter(s -> s.getDept().equals("产品部"))
                .allMatch(s -> s.getSal() >= 10000);
        System.out.println("b = " + b);

    }

    public void checkGender(List<Staff> staffList) {
        boolean b = staffList.stream().filter(s -> s.getDept().equals("研发部"))
                .allMatch(s -> s.getGender().equals("男"));
        System.out.println(b);

    }

    public void checkSalAndHireDate(List<Staff> staffList) {
        staffList.stream().filter(s -> s.getDept().equals("研发部"))
                .filter(s -> s.getSal() >= 10000)
                .filter(staff -> {
                    LocalDate now = LocalDate.now();
                    LocalDate hireDate = staff.getHireDate();
                    long year = ChronoUnit.YEARS.between(hireDate, now);
                    return year >= 5;
                }).forEach(System.out::println);
    }
    public void count(List<Staff> staffList){
        long count = staffList.stream()
                .filter(s -> !s.getDept().equals("项目部")).count();
        System.out.println("count = " + count);
    }
    public void maxSal(List<Staff> staffList){
        Optional<Staff> max = staffList.stream().filter(staff -> {
            LocalDate now = LocalDate.now();
            LocalDate hireDate = staff.getHireDate();
            long year = ChronoUnit.YEARS.between(hireDate, now);
            return year >= 5;
        }).max(Comparator.comparingInt(Staff::getSal));
        System.out.println(max.get().getSal());
    }
    public void minAge(List<Staff> staffList){
        Optional<Staff> min = staffList.stream().filter(s -> s.getDept().equals("研发部"))
                .min(Comparator.comparingInt(Staff::getAge));
        System.out.println(min);

    }
    public void getFirstLetter(List<Staff> staffList){
        Optional<Staff> staff = staffList.stream().filter(s -> s.getDept().equals("研发部"))
                .findAny();
        String no = staff.get().getNo();
        System.out.println(no.charAt(0));


    }



}
