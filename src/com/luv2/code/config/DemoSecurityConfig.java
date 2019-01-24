package com.luv2.code.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

/**
 * Created by Khuram Shah on 1/23/2019.
 */
@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // add user in memory  authentication
        auth.inMemoryAuthentication().withUser("khuram").password("123").roles("Admin");
        auth.inMemoryAuthentication().withUser("amir").password("123").roles("Manger");
        auth.inMemoryAuthentication().withUser("shah").password("123").roles("Employee");

    }
}

