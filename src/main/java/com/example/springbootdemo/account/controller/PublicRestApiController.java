package com.example.springbootdemo.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by berno579@gmail.com on 2021/06/14
 * Github : http://github.com/bee0113
 */
@RestController
@RequestMapping("api/public")
public class PublicRestApiController {

    public PublicRestApiController() {
    }

    @GetMapping("test1")
    public String test1() {
        return "API Test 1";
    }

    @GetMapping("test2")
    public String test2() {
        return "API Test 2";
    }

}

