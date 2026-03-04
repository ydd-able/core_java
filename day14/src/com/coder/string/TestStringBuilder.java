package com.coder.string;

/**
 * @author N1357
 * @date 2026/3/3
 * @project core_java
 */
//API与StringBuffer几乎相同。
//StringBuffer的方法，都有synchronized修饰，是线程安全的。
//StringBuilder的方法，没有syschronized修饰，非线程安全。如果是单线程操作字符串相关处理，StringBuilder的效率最高。

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("abc");
        builder.append("bbb").reverse();

    }
}
