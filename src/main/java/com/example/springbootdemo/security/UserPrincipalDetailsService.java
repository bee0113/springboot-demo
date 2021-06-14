package com.example.springbootdemo.security;

import com.example.springbootdemo.account.model.Account;
import com.example.springbootdemo.account.repository.DAccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by berno579@gmail.com on 2021/06/15
 * Github : http://github.com/bee0113
 */
@Service
public class UserPrincipalDetailsService implements UserDetailsService {

    @Autowired
    private DAccountMapper dAccountMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = this.dAccountMapper.findByUsername(username);
        UserPrincipal userPrincipal = new UserPrincipal(account);

        return userPrincipal;
    }
}
