package com.coder.homework1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author N1357
 * @date 2026/3/23
 * @project core_java
 */
public class DateUtil {
    public static String format(long timestamp) {
        Date date = new Date(timestamp);
        ZonedDateTime zonedDateTime = date.toInstant().atZone(ZoneId.systemDefault());
        LocalDateTime dateTime = zonedDateTime.toLocalDateTime();
        return dateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));


    }
}
