package com.example.springbootdemo.account.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

/**
 * Created by berno579@gmail.com on 2021/06/14
 * Github : http://github.com/bee0113
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Alias("DAccount")
public class DAccount {


    // 계정ID
    private Long accountId;

    // 사용자 아이디
    private String accountUserId;

    // 사용자 이름
    private String accountUserNm;

    // 사용자 이메일
    private String accountEmail;

    // 사용자 패스워드
    private String accountPassword;

    // 개발자구분 - 예비(P), 경력(C)
    private String devCheck;

    // 인가 구분
    private String role;

    // 계정 활성
    private int active;

    // 가입날짜 사용자 가입날짜
    private String createDt;

    // 수정날짜 사용자 정보 수정 날짜
    private String updateDt;
}
