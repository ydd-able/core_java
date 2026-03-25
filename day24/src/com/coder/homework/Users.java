package com.coder.homework;

import java.io.Serializable;

/**
 * @author N1357
 * @date 2026/3/25
 * @project core_java
 */
public class Users implements Serializable {
    private static final long serialVersionUID = 6169695082559639371L;
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
