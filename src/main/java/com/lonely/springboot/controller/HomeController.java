package com.lonely.springboot.controller;

import com.lonely.springboot.pojo.Fast;
import com.lonely.springboot.pojo.TUser;
import com.lonely.springboot.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @author xyLonely
 * @date 2019/3/18 17:26
 */
@Controller
@ConfigurationProperties(prefix = "boot")
public class HomeController {

    @Autowired
    private TUserService tUserService;


    @RequestMapping("/login")
    public String login(Model model) {
        //System.out.println(name+sex);
        model.addAttribute("lonely","你好世界");
        return "index";
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public List<TUser> addUser(){
        return tUserService.getAll();
    }

    @RequestMapping("/fastjson")
    @ResponseBody
    public Fast fastjson(){
        Fast fast = new Fast();
        fast.setName("张鑫");
        fast.setSex("男");
        fast.setDate(new Date());
        return fast;
    }
}
