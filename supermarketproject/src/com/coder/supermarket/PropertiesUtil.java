package com.coder.supermarket;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * @author N1357
 * @since 2026/4/10
 */
//一个工具类，实现读取配置文件的操作
public class PropertiesUtil {
    public static String[] getAdmin() {
       ResourceBundle bundle = ResourceBundle.getBundle("db");
        try {
            String username = bundle.getString("username");
            String password = bundle.getString("password");
            return new String[] {username,password};
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new String[0];
    }
}
