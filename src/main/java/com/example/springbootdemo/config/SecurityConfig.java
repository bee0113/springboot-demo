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

    /* database authentication을 사용하기위해 DaoAuthenticationProvider를 정의 */
    @Bean
    DaoAuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();

        daoAuthenticationProvider.setPasswordEncoder(getPasswordEncoder());
        daoAuthenticationProvider.setUserDetailsService(this.userPrincipalDetailsService);

        return daoAuthenticationProvider;
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**", "/js/**", "/images/**", "/font/**"); // 인증 무시
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // HttpSecurity 작성시 반드시 순서 고려 -> 위에서 부터 permitAll 인 경우 하위 접근제한자들이 작동하지 않음
        http
                .authorizeRequests()
//                .anyRequest().authenticated()
                .antMatchers("/index.html").permitAll()
                .antMatchers("/profile/**").authenticated()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/manager/**").hasAnyRole("ADMIN", "MANAGER")
                .antMatchers("/api/public/test1").hasAuthority("ACCESS_TEST1") // 해당 리소스에 명시된 authority 소유한 사용자만 접근 가능
                .antMatchers("/api/public/test2").hasAuthority("ACCESS_TEST2")
                .and()
                .httpBasic();
//                .cors().disable()      // cors 비활성화
//                .csrf().disable()      // csrf 비활성화
//                .formLogin().disable() //기본 로그인 페이지 없애기
//                .headers().frameOptions().disable();


        /* 실제 사용 */
//        http
//            .csrf()
//                .disable() // csrf 비활성화
//            .authorizeRequests() // 페이지 인증 해제
//                .antMatchers("/"
//                        , "/resources/**"
//                        , "/nAccount/**"
//                        , "/board/**"
//                        ).permitAll()
//                .antMatchers("/survey/list"
//                        ,"/survey/main"
//                        ).hasRole("USER")
//                .anyRequest() // 위 지정한 URL 이외 모든 URL
//                .authenticated() // 인증된 사용자만 접근 가능
//            .and()
//            .formLogin()
//                .loginPage("/nAccount/login") // 로그인이 수행 될 페이지
////                .loginProcessingUrl("/nAccount/loginProc") // <form action> 일 경우 사용
//                .defaultSuccessUrl("/") // 로그인 성공 시 이동 페이지
////                .failureUrl() // 로그인 실패 시 보여주는 화면
//                .usernameParameter("accountUserId")
//                .passwordParameter("accountPassword");
//
    }

    // 패스워드 암호화
    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
