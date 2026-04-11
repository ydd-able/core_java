package com.coder.supermarket;

/**
 * @author N1357
 * @since 2026/4/10
 */
//校验年龄和手机号
public class ValidateUtil {
    public static boolean checkAge(String age) {
        return age.matches("[1-9]\\dd?|1[01]\\d|120");


    }

    public static boolean checkPhone(String phone) {
        return phone.matches("1[3-9]\\d{9}");
    }
}
