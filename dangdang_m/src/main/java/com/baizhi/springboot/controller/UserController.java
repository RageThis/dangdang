package com.baizhi.springboot.controller;

import com.baizhi.springboot.entity.User;
import com.baizhi.springboot.service.UserServicce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserServicce us;

    @RequestMapping("/login")
    public String login(User u, HttpSession session, String code) {
        System.out.println("***************");
        System.out.println(code + "***" + u);
        String s = (String) session.getAttribute("code");
        if (code.equals(s)) {
            if (us.login(u)) {
                return "redirect:main/main.jsp";
            } else {
                return "index";
            }
        } else {
            return "index";
        }
    }
}
