package com.yyc.hw.filter;

import com.yyc.hw.util.JWTUtil;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.SignatureException;
@Component
public class AutorFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String authHeader = request.getHeader("authorization");
        String url = request.getServletPath();
        if (url.endsWith("login")) {
            filterChain.doFilter(request, response);
        } else if ("OPTIONS".equals(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
            filterChain.doFilter(servletRequest, servletResponse);
        } else if (authHeader == null ) {
                response.setStatus(HttpServletResponse.SC_BAD_GATEWAY);
                System.out.print("Missing authon");
            } else {
                final String token = authHeader.substring(0);

                String user = JWTUtil.getUsername(token);
                request.setAttribute("user", user);

                filterChain.doFilter(request, response);
            }

    }

    @Override
    public void destroy() {

    }
}
