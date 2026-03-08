package com.coder.array;

public class TestMyArray {
    public static void main(String[] args) {
        MyArray<Integer> array = new MyArray<Integer>(4);//泛型。
        array.add(123);
        array.add(456);
        array.add(101112);
        for (int i = 0; i < array.size(); i++) {
            Integer x = array.get(i);
            x*=10;
            System.out.println(x);
        }
    }
}
