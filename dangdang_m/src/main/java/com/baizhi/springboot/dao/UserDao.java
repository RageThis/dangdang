package com.baizhi.springboot.dao;

import com.baizhi.springboot.entity.User;

public interface UserDao {
    public User selectOne(User u);
}
