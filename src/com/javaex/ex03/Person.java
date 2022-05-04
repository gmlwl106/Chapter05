package com.javaex.ex03;

public class Person {

	//필드
	private String name;
	private String phone;
	private String company;
	
	
	
	
	//생성자
	public Person() {
	}
	public Person(String name, String phone, String company) {
		this.name = name;
		this.phone = phone;
		this.company = company;
	}
	
	
	//메소드 gs
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	//메소드 일반
	
	
	
	
}
