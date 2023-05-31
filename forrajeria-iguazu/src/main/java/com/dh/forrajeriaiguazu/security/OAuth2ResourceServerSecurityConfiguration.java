package com.dh.forrajeriaiguazu.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class OAuth2ResourceServerSecurityConfiguration {

    public static final String ADMIN = "admin";
    public static final String VENDEDOR = "app_vendedor";
    public static final String PROVEEDOR = "app_proveedor";

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.oauth2ResourceServer().jwt().jwtAuthenticationConverter(new KeyCloakJwtAuthenticationConverter());
        http.cors().and().csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                .authorizeHttpRequests()
                .requestMatchers("/productos/vendedor").hasRole(VENDEDOR)
                .requestMatchers("/productos/proveedor").hasRole(PROVEEDOR)
                .anyRequest().authenticated();
        return http.build();
    }

    @Bean
    public JwtDecoder jwtDecoder() {
        return NimbusJwtDecoder.withJwkSetUri("http://localhost:8082/realms/ForrajeriaIguazu/protocol/openid-connect/certs").build();
    }
}
