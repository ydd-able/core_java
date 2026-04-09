package com.coder.dynamicProxy;

/**
 * @author N1357
 * @since 2026/4/9
 */
public class UserServiceImpl implements UserService{
    @Override
    public void saveUser() {
        System.out.println("保存用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }
}
