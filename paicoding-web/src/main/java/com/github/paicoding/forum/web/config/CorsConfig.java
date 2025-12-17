package com.github.paicoding.forum.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns(
                        "http://localhost",
                        "http://127.0.0.1",
                        "https://101.200.167.69",
                        "https://101.200.167.69",
                        "http://203.10.98.186"
                )
                .allowedMethods("*")            // 允许 GET, POST, PUT, DELETE 等
                .allowedHeaders("*")            // 允许所有请求头
                .allowCredentials(true)         // 允许携带 Cookie 或认证信息
                .maxAge(3600);                  // 预检请求缓存时间，单位秒
    }
}

