package com.baizhi.springboot.service;

import com.baizhi.springboot.entity.Product;

import java.util.Map;

public interface ProductSerice {
    public Map selectAll(int page, int rows);

    public void deleteByIds(int[] ids);

    public void updateOne(Product p);

    public Product selectOne(int id);

    public void insertOne(Product p);
}
