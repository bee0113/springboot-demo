package com.example.springbootdemo.config;//package com.spring.springbootmybatisproject.config;

import com.example.springbootdemo.security.UserPrincipalDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.userdetails.DaoAuthenticationConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserPrincipalDetailsService userPrincipalDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
//        auth
//                .inMemoryAuthentication()
//                .withUser("admin")
//                .password(getPasswordEncoder().encode("admin123"))
//                .roles("ADMIN").authorities("ACCESS_TEST1", "ACCESS_TEST2")
//                .and()
//                .withUser("user")
//                .password(getPasswordEncoder().encode("user123"))
//                .roles("USER")
//                .and()
//                .withUser("manager")
//                .password(getPasswordEncoder().encode("manager123"))
//                .roles("MANAGER").authorities("ACCESS_TEST1");
    }

    /* database authentication??? ?????????????????? DaoAuthenticationProvider??? ?????? */
    @Bean
    DaoAuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();

        daoAuthenticationProvider.setPasswordEncoder(getPasswordEncoder());
        daoAuthenticationProvider.setUserDetailsService(this.userPrincipalDetailsService);

        return daoAuthenticationProvider;
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**", "/js/**", "/images/**", "/font/**"); // ?????? ??????
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // HttpSecurity ????????? ????????? ?????? ?????? -> ????????? ?????? permitAll ??? ?????? ?????? ????????????????????? ???????????? ??????
        http
                .csrf().disable()
                .authorizeRequests()
                //.anyRequest().authenticated()
                    .antMatchers("/index").permitAll()
                    .antMatchers("/profile/**").authenticated()
                    .antMatchers("/admin/**").hasRole("ADMIN")
                    .antMatchers("/manager/**").hasAnyRole("ADMIN", "MANAGER")
                    .antMatchers("/api/public/test1").hasAuthority("ACCESS_TEST1")
                    .antMatchers("/api/public/test2").hasAuthority("ACCESS_TEST2")
                    .antMatchers("/api/public/users").hasRole("ADMIN")
                .and()
                .formLogin()
                    .loginProcessingUrl("/signin")
                    .loginPage("/login").permitAll()
                    .usernameParameter("txtUsername")
                    .passwordParameter("txtPassword")
                .and()
                .logout()
                    .logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login")
                .and()
                .rememberMe().tokenValiditySeconds(2592000).key("mySecretKey")
                .rememberMeParameter("checkRememberMe");



//                .cors().disable()      // cors ????????????
//                .csrf().disable()      // csrf ????????????
//                .formLogin().disable() //?????? ????????? ????????? ?????????
//                .headers().frameOptions().disable();


        /* ?????? ?????? */
//        http
//            .csrf()
//                .disable() // csrf ????????????
//            .authorizeRequests() // ????????? ?????? ??????
//                .antMatchers("/"
//                        , "/resources/**"
//                        , "/nAccount/**"
//                        , "/board/**"
//                        ).permitAll()
//                .antMatchers("/survey/list"
//                        ,"/survey/main"
//                        ).hasRole("USER")
//                .anyRequest() // ??? ????????? URL ?????? ?????? URL
//                .authenticated() // ????????? ???????????? ?????? ??????
//            .and()
//            .formLogin()
//                .loginPage("/nAccount/login") // ???????????? ?????? ??? ?????????
////                .loginProcessingUrl("/nAccount/loginProc") // <form action> ??? ?????? ??????
//                .defaultSuccessUrl("/") // ????????? ?????? ??? ?????? ?????????
////                .failureUrl() // ????????? ?????? ??? ???????????? ??????
//                .usernameParameter("accountUserId")
//                .passwordParameter("accountPassword");
//
    }

    // ???????????? ?????????
    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
