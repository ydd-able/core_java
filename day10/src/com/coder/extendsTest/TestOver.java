package com.coder.extendsTest;

public class TestOver {
    public static void main(String[] args) {
        S s = new S();
        s.showName();
        S1 s1 = new S1();
        s1.set();
        s.showName();
    }
}

class F {
    static String name = "父类的属性";//子类和父类共享一个静态变量。
}

class S extends F {
    //String name = "子类的属性";//子类属性会把父类的属性覆盖。

    public void showName() {
        //System.out.println(super.name + "\t" + this.name);
        System.out.println(name);
    }
}

class S1 extends F {
    public void set() {
        name = "新子类的属性";
    }
}
//如果父类中有一个静态变量，则被所有子类共享，
// 其中一个子类修改了值，其他子类访问也是修改之后的值。
// 如果子类自己写了一个同名的静态变量，则子类中访问的是自己的变量，不是父类的。