//package com.example.springbootdemo.account.controller;
//
//import com.example.springbootdemo.account.model.DAccount;
//import com.example.springbootdemo.account.service.DAccountService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
///**
// * Created by berno579@gmail.com on 2021/06/14
// * Github : http://github.com/bee0113
// */
//@Controller
//public class DAccountController {
//
//    @Autowired
//    private DAccountService dAccountService;
//
//    // 메인 페이지
//    @GetMapping(value = {"/", "/home"})
//    public String home() {
//        return "/demo/demoHome";
//    }
//
//    // 회원가입 페이지
//    @GetMapping("/account/signup")
//    public String dispSignup() {
//        return "/demo/demoSignup";
//    }
//
//    // 회원가입 처리
//    @PostMapping("/account/signupProc")
//    public String execSignup(DAccount dAccount) {
//        dAccountService.joinUser(dAccount);
//
//        return "redirect:/account/login";
//    }
//
//    // 로그인 페이지
//    @GetMapping("/account/login")
//    public String dispLogin() {
//        return "/demo/demoLogin";
//    }
//
//    // 로그인 결과 페이지
//    @GetMapping("/account/login/result")
//    public String dispLoginResult() {
//        return "/demo/loginSuccess";
//    }
//
//    // 로그아웃 결과 페이지
//    @GetMapping("/account/logout/result")
//    public String dispLogout() {
//        return "/demo/logout";
//    }
//
//
//    // 접근 거부 페이지
//    @GetMapping("/account/denied")
//    public String dispDenied() {
//        return "/demo/denied";
//    }
//
//    // 내 정보 페이지
//    @GetMapping("/account/info")
//    public String dispMyInfo() {
//        return "/demo/myinfo";
//    }
//
//    // 어드민 페이지
//    @GetMapping("/admin")
//    public String dispAdmin() {
//        return "/demo/admin";
//    }
//
//}
