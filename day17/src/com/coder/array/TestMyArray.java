package com.coder.array;

public class TestMyArray {
    public static void main(String[] args) {
        MyArray array = new MyArray(4);
        array.add(123);
        array.add(456);
        array.add("sss");
        array.add(101112);
        array.add(0,"XXXX");
        array.add(3,"YYYY");
        array.remove(0);
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
