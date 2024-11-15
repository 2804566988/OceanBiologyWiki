package com.pzl.obwiki.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

    @Autowired
    com.pzl.obwiki.interceptor.DurationInterceptor DurationInterceptor;

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(DurationInterceptor)
                .addPathPatterns("/**");
    }
}
