package com.coder.homework;

import java.util.List;

/**
 * @author N1357
 * @date 2026/3/8
 * @project core_java
 */
//按部门统计。
public class AccountDept {
    public int sum(List<Staff> list,String prefix){
        int sum = 0;
        for (Staff staff : list) {
            if(staff.getNum().startsWith(prefix)){
                sum+=staff.getSal();
            }

        }
        return sum;
    }
    public double avg(List<Staff> list , String prefix){
        int count = 0;
        for (Staff staff : list) {
            if(staff.getNum().startsWith(prefix)){
                count++;
            }
        }
        int sum = sum(list,prefix);
        return sum*1.0/count;//防止两边都是整数

    }
}
