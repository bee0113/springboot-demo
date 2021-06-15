package com.example.springbootdemo.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by berno579@gmail.com on 2021/06/14
 * Github : http://github.com/bee0113
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("index")
    public String index() {
        return "index";
    }

    @GetMapping("login")
    public String login(){
        return "/demo/demoLogin";
    }
}
