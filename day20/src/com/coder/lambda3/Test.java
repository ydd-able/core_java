package com.coder.lambda3;

/**
 * @author N1357
 * @date 2026/3/16
 * @project core_java
 */
public class Test {
    public static void main(String[] args) {
      /*  MyInter inter = ()->System.out.println("hello");
*/
        /*MyInter1 inter1 = ()->{
            System.out.println("hello");
            System.out.println("her");
        };*/
        //有一个参数，没有返回值。
       /* MyInter2<String> inter2 = System.out::println;
        inter2.test("123");*/
        MyInter3 inter3 = Math::abs;
        MyInter4 inter4 = (x,y)->{
            return (int)Math.pow(x,y);//x的y次方。
        };


    }
}
interface MyInter{
    void test();
}
interface MyInter1{
    void test();
}
interface MyInter2<T>{
    void test(T t);
}
interface MyInter3{
    Integer abs(Integer x);
}
interface MyInter4{
    int pow(int x ,int y);
}

