package com.coder;

public class PolyTest {
    public static void main(String[] args) {
        F f = new S();
        S s = (S)f;
        s.test();//向下转型，需要强制转换。


    }
   /* public static void main(String[] args) {
        F f = new S();//向上转型。父类的引用指向了子类的对象。
        //编译的时候看左边，运行的时候看右边。
        f.test();//方法的运行看子类的结果，属性的调用看左边。
        System.out.println(f.name);
    }*/
}

class F {
    String name = "父类的属性";
    public void test() {
        System.out.println("父类的方法");
    }
}

class S extends F {
    String name = "子类的属性";
    public void test(){
        System.out.println("子类的方法");
    }

}
