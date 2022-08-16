package org.j4g.jpaspecifications.config;

import org.j4g.jpaspecifications.interceptors.RequestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class RequestInterceptorConfiguration implements WebMvcConfigurer {

    @Autowired
    private RequestInterceptor requestInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // TODO: make pattern like /**  */vehicle/* in future
        registry.addInterceptor(requestInterceptor).addPathPatterns("/**");
    }

}
