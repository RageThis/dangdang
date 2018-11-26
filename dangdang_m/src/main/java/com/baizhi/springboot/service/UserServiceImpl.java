package com.baizhi.springboot.service;

import com.baizhi.springboot.dao.UserDao;
import com.baizhi.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class UserServiceImpl implements UserServicce {

    @Autowired
    private UserDao ud;

    @Override
    public boolean login(User u) {
        Map map = new HashMap();
        if (ud.selectOne(u) != null) {
            return true;
        } else {
            return false;
        }
    }
}
