package com.baizhi.springboot.controller;

import com.baizhi.springboot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService cs;

    @RequestMapping("/getAll")
    public @ResponseBody
    Map getAll() {
        return cs.quarryAllcg();
    }
}
