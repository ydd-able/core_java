package com.coder.supermarket;

/**
 * @author N1357
 * @since 2026/4/10
 */
public class IDUtil {
    private static long id = 1;
    public static String getId(){
        return String.valueOf(id++);
    }
}
