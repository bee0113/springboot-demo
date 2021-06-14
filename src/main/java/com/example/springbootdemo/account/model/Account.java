package com.example.springbootdemo.account.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by berno579@gmail.com on 2021/06/15
 * Github : http://github.com/bee0113
 */
@Getter
@Setter
@Alias("Account")
public class Account {
    private Long id;

    private String username;

    private String password;

    private int active;

    private String roles = "";

    private String permissions = "";

    public Account(String username, String password, String roles, String permissions) {
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.permissions = permissions;

        this.active = 1;
    }

    protected Account() {
    }

    public List<String> getRoleList() {
        if (this.roles.length() > 0) {
            return Arrays.asList(this.roles.split(","));
        }

        return new ArrayList<>();
    }

    public List<String> getPermissionList() {
        if (this.permissions.length() > 0) {
            return Arrays.asList(this.permissions.split(","));
        }

        return new ArrayList<>();
    }
}
