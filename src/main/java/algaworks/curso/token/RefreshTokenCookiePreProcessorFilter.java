package algaworks.curso.token;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.*;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RefreshTokenCookiePreProcessorFilter  extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)
            throws ServletException, IOException {

        if ((req.getContextPath() + "/oauth2/token").equalsIgnoreCase(req.getRequestURI())
                && "refresh_token".equals(req.getParameter("grant_type"))
                && req.getParameter("refresh_token") == null
                && req.getCookies() != null) {

            for (Cookie cookie : req.getCookies()) {
                if ("refreshToken".equals(cookie.getName())) {
                    req = new RefreshTokenRequestWrapper(req, cookie.getValue());
                    break;
                }
            }
        }
        chain.doFilter(req, resp);
    }

    static class RefreshTokenRequestWrapper extends HttpServletRequestWrapper {

        private final Map<String, String[]> params;

        RefreshTokenRequestWrapper(HttpServletRequest request, String refreshToken) {
            super(request);
            Map<String, String[]> copy = new LinkedHashMap<>(request.getParameterMap());
            copy.put("refresh_token", new String[] { refreshToken });
            this.params = Collections.unmodifiableMap(copy);
        }

        @Override
        public Map<String, String[]> getParameterMap() {
            return params;
        }

        @Override
        public String getParameter(String name) {
            String[] v = params.get(name);
            return v == null ? null : v[0];
        }

        @Override
        public String[] getParameterValues(String name) {
            return params.get(name);
        }

        @Override
        public Enumeration<String> getParameterNames() {
            return Collections.enumeration(params.keySet());
        }
    }
}