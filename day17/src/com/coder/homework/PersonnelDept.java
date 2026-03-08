package com.coder.homework;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.List;

/**
 * @author N1357
 * @date 2026/3/8
 * @project core_java
 */
public class PersonnelDept {
    public void fire(List<Staff>list,String location){
        for(Iterator<Staff> iterator= list.iterator();iterator.hasNext();){
            Staff staff = iterator.next();
            if(staff.getLocation().equals(location)){
                iterator.remove();
            }
        }
    }
    public void addSal(List<Staff>list,long month){
        for(Iterator<Staff> iterator= list.iterator();iterator.hasNext();){
            Staff staff = iterator.next();
            long workMonth = ChronoUnit.MONTHS.between(staff.getHireDate(), LocalDate.now());
            if(workMonth>=month){
                staff.setSal((int)(staff.getSal()*1.1));
            }
        }
    }

}
