package com.github.paicoding.forum.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/admin/**")            // 只对 /admin 下的接口生效
                .allowedOriginPatterns("*")        // 允许所有来源访问
                .allowedMethods("*")               // 允许 GET, POST, PUT, DELETE 等
                .allowedHeaders("*")               // 允许所有请求头
                .allowCredentials(true)            // 允许携带 Cookie 或认证信息
                .maxAge(3600);                     // 预检请求缓存时间，单位秒
    }
}
