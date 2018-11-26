package com.baizhi.springboot.dao;

import com.baizhi.springboot.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {
    public List<Product> quarryAll(@Param("start") int start,
                                   @Param("rows") int rows);

    public Product quarryOne(int id);

    public void updateOne(Product p);

    public int getCount();

    public void deleteByIds(int[] ids);

    public void insertOne(Product p);
}
