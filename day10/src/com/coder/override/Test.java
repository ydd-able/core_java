package com.coder.override;
//方法的重写。
//方法名必须相同。
//参数列表必须相同。
public class Test {
    public static void main(String[] args) {
        S s = new S();
        s.test();
    }
}
class F{
    public void test(){
        System.out.println("父类的方法");
    }
}
class S extends F{
    @Override//子类的访问修饰符要大于等于子类的访问修饰符，且父类的方法不能是private。
    public void test(){
        System.out.println("子类的方法");
    }
}
//方法的返回值类型要小于等于父类的。
