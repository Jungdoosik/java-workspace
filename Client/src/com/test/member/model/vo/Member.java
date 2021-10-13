package com.test.member.model.vo;

public class Member {
	private int numberId;
	private String name;
	private int age;
	private String addr;
	
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(int numberId, String name, int age, String addr) {
		super();
		this.numberId = numberId;
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	public int getNumberId() {
		return numberId;
	}
	public void setNumberId(int numberId) {
		this.numberId = numberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	

}
