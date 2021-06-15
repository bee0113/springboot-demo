package com.example.springbootdemo.account.controller;

import com.example.springbootdemo.account.model.Account;
import com.example.springbootdemo.account.repository.DAccountMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by berno579@gmail.com on 2021/06/14
 * Github : http://github.com/bee0113
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("api/public")
public class PublicRestApiController {

    private final DAccountMapper dAccountMapper;

    @GetMapping("test1")
    public String test1() {
        return "API Test 1";
    }

    @GetMapping("test2")
    public String test2() {
        return "API Test 2";
    }

    @GetMapping("users")
    public List<Account> allUsers(){
        return this.dAccountMapper.findAll();
    }

}

