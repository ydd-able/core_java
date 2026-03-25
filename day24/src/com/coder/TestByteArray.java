package com.coder;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

/**
 * @author N1357
 * @date 2026/3/25
 * @project core_java
 */
public class TestByteArray {
    public static void main(String[] args) {
        String  str = "abcdefg";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        int i = bais.read();
        System.out.println((char)i);

    }
}
