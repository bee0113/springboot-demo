package com.example.springbootdemo.account.repository;

import com.example.springbootdemo.account.model.Account;

/**
 * Created by berno579@gmail.com on 2021/06/14
 * Github : http://github.com/bee0113
 */
public interface DAccountMapper {

    Account findByUsername(String username);
}
