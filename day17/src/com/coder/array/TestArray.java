package com.coder.array;

/**
 * @author N1357
 * @date 2026/3/6
 * @project core_java
 */
//泛型不可以协变。为了解决这个问题，设计出固定上边界的通配符。
//虽然使用extends关键字，也可以实现接口。
public class TestArray {
    public static void main(String[] args) {
      MyArray<MyInter1> array = new MyArray<>();
      array.add(new MyImpl2());
      array.add(new MyImpl2());
      array.add(new MyImpl2());
      test(array);
    }
    public static void test(MyArray<? super MyImpl1> array){
        for(int i = 0; i<array.size();i++){
            System.out.println(array.get(i));
        }
    }
}
interface MyInter1{

}
class MyImpl1 implements MyInter1{};
class MyImpl2 implements MyInter1{};
class X{

}
class Y extends X{};
class Z extends X{};
