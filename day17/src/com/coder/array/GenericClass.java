package com.coder.array;

/**
 * @author N1357
 * @date 2026/3/6
 * @project core_java
 */
public class GenericClass<T>{
    private T value;

    public GenericClass() {
    }

    public GenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
