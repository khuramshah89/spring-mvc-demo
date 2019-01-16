package com.luv2.code.pojo;

public class Student {

	private String firstName;
	private String lastName;
	private int studnetId;
	
	
	public Student(String firstName, String lastName, int studnetId) {
		this.firstName = firstName;
		this.lastName = lastName; 
		this.studnetId = studnetId;
	}
	public int getStudnetId() {
		return studnetId;
	}
	public void setStudnetId(int studnetId) {
		this.studnetId = studnetId;
	}
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
