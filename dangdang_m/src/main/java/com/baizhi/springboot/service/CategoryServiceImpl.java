package com.baizhi.springboot.service;

import com.baizhi.springboot.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao cd;


    @Override
    public Map quarryAllcg() {
        Map map = new HashMap();

        map.put("list", cd.quarryAllcg());
        System.out.println(map + "*************");
        return map;
    }
}
