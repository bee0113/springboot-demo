package com.example.springbootdemo.config;//package com.spring.springbootmybatisproject.config;
//
//import interceptor.AuthCheckInterceptor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class MvcConfig implements WebMvcConfigurer {
//
//    @Bean
//    public AuthCheckInterceptor authCheckInterceptor() {
//        return new AuthCheckInterceptor();
//    }
//
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(authCheckInterceptor())
//                .addPathPatterns("/board/**") // 적용할 url
//                .addPathPatterns("/account/list")
//                .addPathPatterns("/survey/list")
//                .excludePathPatterns("/account") // 제외할 url
//                .excludePathPatterns("/home") // 제외할 url
//                .excludePathPatterns("/survey/main") // 제외할 url
//                .excludePathPatterns("/survey/surveyResults") // 제외할 url
//                .excludePathPatterns("/board/list"); // 제외할 url
////        WebMvcConfigurer.super.addInterceptors(registry);
//    }
//
//
//}
