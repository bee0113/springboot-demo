package com.example.springbootdemo.account.repository;

import com.example.springbootdemo.account.model.Account;

import java.util.List;

/**
 * Created by berno579@gmail.com on 2021/06/14
 * Github : http://github.com/bee0113
 */
public interface DAccountMapper {

    Account findByUsername(String username);

    List<Account> findAll();

    void deleteAll();

    void saveAll(List<Account> users);
}
