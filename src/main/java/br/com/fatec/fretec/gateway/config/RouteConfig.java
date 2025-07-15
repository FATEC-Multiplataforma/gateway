package br.com.fatec.fretec.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class RouteConfig {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
        return http
                .csrf(ServerHttpSecurity.CsrfSpec::disable)
                .authorizeExchange(exchange -> exchange
                        .pathMatchers(
                                "/v3/api-docs/**",
                                "/swagger-ui/**",
                                "/swagger-ui.html",
                                "/fretec/v1/auth/v3/api-docs",
                                "/fretec/v1/order/v3/api-docs",
                                "/fretec/v1/auth/login/**",
                                "/fretec/v1/auth/forget/**")
                        .permitAll()
                        .pathMatchers("/fretec/v1/auth/save/**")
                        .hasRole("ADMIN")
                        .anyExchange()
                        .authenticated()
                ).oauth2ResourceServer(oauth -> oauth.jwt())
                .build();
    }

}
