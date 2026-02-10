package com.coder.inner;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.test();
    }

}

class Outer {
    int x = 10;

    private void outerTest() {
        Inner inner = new Inner();
        inner.test();//需要创建内部类的对象来访问。
    }

    class Inner {
        int x = 100;
        int y = 20;
        public void test() {
            System.out.println(x+y);
            System.out.println(Outer.this.x);
        }
    }
}
