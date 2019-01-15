package com.srpingdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {

	@RequestMapping("/showForms")
	public String showForm(){
		return "silly";
	}
}
