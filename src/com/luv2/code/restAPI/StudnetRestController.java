package com.luv2.code.restAPI;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2.code.pojo.Student;

@RestController
@RequestMapping("api")
public class StudnetRestController {
	
	private List<Student> studentList;
	
	//define @PostConstract to load data.... once once when bean initialized
	
	@PostConstruct
	public void loadData(){
		studentList=new ArrayList<>();
		studentList.add(new Student("khuram","shah",1));
		studentList.add(new Student("amir","shah",2));
	}
@GetMapping("/students")
	public List<Student> getStudents(){
		return studentList;
	}

@GetMapping("/students/{stdId}") //{stdId} is path variable 
public Student getStudent(@PathVariable int stdId){
	for(Student s:studentList){
		if(s.getStudnetId()==stdId){
			return s;
		}
	}
	
	return null; 
//	return new ResponseEntity<>("no studnet fouunf",HttpStatus.NOT_FOUND);
}

/**
 * Used to handle any generic exception
 * 
 * this can also be achieved by using @ControllerAdvice for global level (for all RestControllers)
 * @param exc
 * @return
 */
@ExceptionHandler
public ResponseEntity<Object> handelException(Exception exc){
	
	return new ResponseEntity<>("bad Request",HttpStatus.BAD_REQUEST);
}
}
