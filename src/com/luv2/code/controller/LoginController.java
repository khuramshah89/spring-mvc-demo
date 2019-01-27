package com.luv2.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Khuram Shah on 1/26/2019.
 */
@Controller
public class LoginController {
    @RequestMapping("/showLoginPage")
    public String getLoginPage(){
        return "fancy-login";
//        return "plain-login";
    }

    @GetMapping("/access-denied")
  public String showAccessDenied(){
      return "access-denied";
  }
}
