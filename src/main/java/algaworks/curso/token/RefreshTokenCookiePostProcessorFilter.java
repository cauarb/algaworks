package algaworks.curso.token;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingResponseWrapper;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.json.JsonMapper;
import tools.jackson.databind.node.ObjectNode;

import java.io.IOException;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RefreshTokenCookiePostProcessorFilter extends OncePerRequestFilter {

    private final JsonMapper mapper = JsonMapper.builder().build();

    @Override
    protected boolean shouldNotFilter(HttpServletRequest req) {
        return !"POST".equalsIgnoreCase(req.getMethod())
                || !(req.getContextPath() + "/oauth2/token").equals(req.getRequestURI());
    }

    @Override
    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)
            throws ServletException, IOException {

        ContentCachingResponseWrapper wrapper = new ContentCachingResponseWrapper(resp);
        chain.doFilter(req, wrapper);

        byte[] body = wrapper.getContentAsByteArray();
        if (wrapper.getStatus() == 200 && body.length > 0) {
            JsonNode node = mapper.readTree(body);
            if (node instanceof ObjectNode json && json.hasNonNull("refresh_token")) {
                String refreshToken = json.get("refresh_token").asString();

                Cookie cookie = new Cookie("refreshToken", refreshToken);
                cookie.setHttpOnly(true);
                cookie.setSecure(false); // TODO: true em produção (HTTPS)
                cookie.setPath(req.getContextPath() + "/oauth2/token");
                cookie.setMaxAge(2592000);
                wrapper.addCookie(cookie);

                json.remove("refresh_token");
                wrapper.resetBuffer();
                wrapper.getOutputStream().write(mapper.writeValueAsBytes(json));
            }
        }
        wrapper.copyBodyToResponse();
    }
}