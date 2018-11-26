package com.baizhi.springboot.controller;

import com.baizhi.springboot.entity.Product;
import com.baizhi.springboot.service.ProductSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class ProductController {

    @Autowired
    private ProductSerice ps;

    @RequestMapping("/selectAll")
    public @ResponseBody
    Map selectAll(int page, int rows) {
        System.out.println("***********test***********");
        return ps.selectAll(page, rows);
    }

    @RequestMapping("/deleteByIds")
    public @ResponseBody
    boolean deleteByIds(int[] ids) {
        try {
            ps.deleteByIds(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @RequestMapping("/insert")
    public @ResponseBody
    boolean insert(Product p) {
        try {
            ps.insertOne(p);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @RequestMapping("/selectOne")
    public @ResponseBody
    Product selectOne(int id) {
        System.out.println(id);
        return ps.selectOne(id);
    }

    @RequestMapping("/update")
    public @ResponseBody
    boolean update(Product p) {
        try {
            ps.updateOne(p);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
