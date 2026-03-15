package com.coder.recursion;

/**
 * @author N1357
 * @date 2026/3/14
 * @project core_java
 */
public class Test {
    public static void main(String[] args) {
        int sum = recursion(1,3);
        System.out.println("sum = " + sum);
        
    }
    public static int recursion(int begin,int end){
        if(begin == end){
            return end;
        }else{
            return begin+recursion(begin+1,end);
        }
    }
}
