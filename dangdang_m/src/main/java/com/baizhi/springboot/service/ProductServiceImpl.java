package com.baizhi.springboot.service;

import com.baizhi.springboot.dao.ProductDao;
import com.baizhi.springboot.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class ProductServiceImpl implements ProductSerice {

    @Autowired
    private ProductDao pd;

    @Override
    public Map selectAll(int page, int rows) {
        int start = (page - 1) * rows;
        int count = pd.getCount();
        Map map = new HashMap();
        map.put("rows", pd.quarryAll(start, rows));
        map.put("total", count);
        System.out.println(map);
        return map;
    }

    @Override
    public void deleteByIds(int[] ids) {
        pd.deleteByIds(ids);
    }

    @Override
    public void updateOne(Product p) {
        pd.updateOne(p);
    }

    @Override
    public Product selectOne(int id) {
        return pd.quarryOne(id);
    }

    @Override
    public void insertOne(Product p) {
        pd.insertOne(p);
    }
}
