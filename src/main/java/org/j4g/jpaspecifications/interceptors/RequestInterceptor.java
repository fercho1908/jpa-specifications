package org.j4g.jpaspecifications.interceptors;

import org.j4g.jpaspecifications.model.request.RequestHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class RequestInterceptor implements HandlerInterceptor {

    @Autowired
    private RequestHeaders requestHeaders;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

//        String source = request.getHeader("source");
//
//        if(source == null){
//            throw new Exception("Source not defined");
//        }
//
//        requestHeaders.setSourceType(source);

        return true;
    }
}
