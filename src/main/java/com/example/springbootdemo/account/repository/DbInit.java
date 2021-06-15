//package com.example.springbootdemo.account.repository;
//
//import com.example.springbootdemo.account.model.Account;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.Arrays;
//import java.util.List;
//
//@RequiredArgsConstructor
//@Service
//public class DbInit implements CommandLineRunner {
//
//    private final DAccountMapper dAccountMapper;
//    private final PasswordEncoder passwordEncoder;
//
//    @Override
//    public void run(String... args) throws Exception {
//        // delete all
//        this.dAccountMapper.deleteAll();
//
//        // create users
//        Account user = new Account(1L,"user", passwordEncoder.encode("user123"), "USER", "");
//        Account admin = new Account(2L,"admin", passwordEncoder.encode("admin123"), "ADMIN", "ACCESS_TEST1,ACCESS_TEST2");
//        Account manager = new Account(3L,"manager", passwordEncoder.encode("manager123"), "MANAGER", "ACCESS_TEST1");
//
//        List<Account> users = Arrays.asList(user, admin, manager);
//
//        // save to db
//        this.dAccountMapper.saveAll(users);
//
//
//    }
//}
