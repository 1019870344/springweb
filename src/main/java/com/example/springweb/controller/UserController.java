package com.example.springweb.controller;

import com.example.springweb.entity.User;
import com.example.springweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index (){
        return "test";
    }

    @RequestMapping("/select")
    public String selectByPrimaryKey(Model model) {
        User user = userService.selectByPrimaryKey(4);
        model.addAttribute("name",user);
        return "test";
    }
}
