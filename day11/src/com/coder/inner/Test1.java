package com.coder.inner;

public class Test1 {
    public static void main(String[] args) {
        OuterStatic.test1();
        OuterStatic.InnerStatic innerStatic = new OuterStatic.InnerStatic();

    }
}

class OuterStatic {
    private int x = 10;

    public static void test1() {

    }

    static class InnerStatic { //不能直接访问外部类的非静态方法。
        private static int y = 20;//可以创建静态的变量和静态的方法。

        public void test() {
            test1();
            OuterStatic outer = new OuterStatic();
            System.out.println(outer.x);
        }
    }
}

