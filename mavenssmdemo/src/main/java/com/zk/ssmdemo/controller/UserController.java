package com.zk.ssmdemo.controller;

import com.zk.ssmdemo.entity.User;
import com.zk.ssmdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/showUser")
    public String showUser(@RequestParam(value = "id")int id, Model model){
        System.out.println("id:"+id);
        User user = userService.getById(id);
        model.addAttribute("user",user);
        return "showUser";
    }

}
