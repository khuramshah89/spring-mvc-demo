package com.luv2.code.restAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class RestDemoRestContoller {
	@GetMapping("/hi")
public String helo(){
	return "hello khuram it is form rest so now go to sleep";
}
}
