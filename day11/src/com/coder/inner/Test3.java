package com.coder.inner;

public class Test3 {
    public static void main(String[] args) {
        AddInterface inter= new AddImpl();
        OuterAnony anony = new OuterAnony();
        anony.testAdd(inter,10,20);
    }
}

class OuterAnony {
    public void testAdd(AddInterface inter, int x, int y) {
            inter.add(x,y);
    }
}

interface AddInterface {
    void add(int x, int y);
}



class AddImpl implements AddInterface {
    @Override
    public void add(int x, int y) {
        System.out.println(x + y);
    }
}