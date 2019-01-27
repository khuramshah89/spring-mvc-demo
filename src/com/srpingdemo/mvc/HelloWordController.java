package com.srpingdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWordController {

	//need controller to show the initial form 
	
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloWorldPage";
	}
	//to redirect new page 
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloWorld";
	}
	
	@RequestMapping("/proecssForm2")
	public String letShootDude(@RequestParam ("studentName") String studentName
			, Model model){
		
		//ready request param from html form 
//		String studentName=request.getParameter("studentName");
		
		
		//convert to upperCase
		studentName=	studentName.toUpperCase();
		
		//return new string to view
		model.addAttribute("msg",studentName);
		
		
		return "helloWorld";
	}

	@RequestMapping("/crop")
	public String uploadImage(){
		return "crop";
	}
}
