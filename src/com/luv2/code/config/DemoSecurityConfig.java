package com.luv2.code.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
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
        auth.inMemoryAuthentication().withUser("khuram").password("123").roles("Admin","Employee");
        auth.inMemoryAuthentication().withUser("amir").password("123").roles("Manger","Employee");
        auth.inMemoryAuthentication().withUser("shah").password("123").roles("Employee");

    }

    /**
     * Uesd to setup login and logout pages with pages access after authentication
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
              //  .anyRequest().authenticated()
                .antMatchers("/").hasRole("Employee")
                .antMatchers("/leaders/**").hasRole("Manger")
                .antMatchers("/systems/**").hasRole("Admin")
                .and()
                .formLogin()
                .loginPage("/showLoginPage")//path of controller from which return login page name
                .loginProcessingUrl("/authenticateTheUser")//where authenticated userNAME and passWord.
                // Note there is no need to add authenticateTheUser class any where in the project. just add it here with any name
                .permitAll()
                .and()
                .logout()
                .permitAll()
                .and()
                .exceptionHandling().accessDeniedPage("/access-denied");
    }
}

