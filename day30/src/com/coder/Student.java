package com.coder;


public class Student {
    private String name;
    private String age;

    /**
     * 计算成绩的方法
     * @param x 成绩数组
     * @return 总成绩
     */
    @Deprecated
    public int calcScore(int[] x){
        int sum = 0;
        for (int x1 : x) {
            sum+=x1;

        }
        return sum;
    }
    @Override//放在方法前面，如果这个方法并不是覆盖类方法，则编译时会检查报错。
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
    public static void test(){

    }
}
