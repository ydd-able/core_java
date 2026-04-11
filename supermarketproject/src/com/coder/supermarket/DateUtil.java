package com.coder.supermarket;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * @author N1357
 * @since 2026/4/10
 */

public class DateUtil {
    private  static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public  static String  format(Date date){
        return sdf.format(date);
    }
}
