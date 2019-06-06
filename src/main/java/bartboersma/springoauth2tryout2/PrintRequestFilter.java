package bartboersma.springoauth2tryout2;

import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class PrintRequestFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;

//        Cookie[] cookies = httpRequest.getCookies();
//        if (cookies != null) {
//            for(Cookie cookie: cookies) {
//                System.out.println(cookie.getName() + ": " + cookie.getValue());
//            }
//        }

        System.out.println(httpRequest.getRequestURL());

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
