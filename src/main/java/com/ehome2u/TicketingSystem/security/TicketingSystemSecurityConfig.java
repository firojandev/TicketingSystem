package com.ehome2u.TicketingSystem.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class TicketingSystemSecurityConfig {
    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails firoj = User.builder()
                .username("firoj")
                .password("{noop}firoj123")
                .roles("EMPLOYEE")
                .build();

        return new InMemoryUserDetailsManager(firoj);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configure ->
                        configure
                                .anyRequest().authenticated()
                )
                .formLogin(form ->
                        form.loginPage("/login")
                                .loginProcessingUrl("/authenticateTheUser")
                                .permitAll()
                )
                .logout(logout ->
                        logout.permitAll()
                );
        return http.build();
    }
}
