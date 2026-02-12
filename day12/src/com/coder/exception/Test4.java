package com.coder.exception;

import java.io.FileNotFoundException;

//父类抛出异常，子类可以不抛出任何异常。也可以抛出相同异常。
public class Test4 {

}
class F{
    public void test() throws FileNotFoundException {

    }
}
class S extends F{
    public void test(){

    }
}