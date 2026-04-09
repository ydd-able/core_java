package com.coder.homework2;

/**
 * @author N1357
 * @since 2026/4/9
 */
public class UserServiceImpl implements UserService {
    @Override
    public void saveUser() {
        System.out.println("用户保存成功");
    }

    @Override
    public void deleteUser() {
        System.out.println("用户删除成功");
    }
}
