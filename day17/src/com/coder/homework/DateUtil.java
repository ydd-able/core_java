package com.coder.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author N1357
 * @date 2026/3/8
 * @project core_java
 */
public class DateUtil {
    public static LocalDate parse(String str) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(str,formatter);
    }
}
