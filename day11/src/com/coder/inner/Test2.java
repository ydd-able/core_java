package com.coder.inner;

public class Test2 {

}

class OuterLocal {
    private int x = 10;

    private void test2() {

    }

    public void test() {
        final class InnerLocal {//用final定义防止其他类继承。
            public void test1() {
                System.out.println(x);
                test2();
            }

        }


    }
}
