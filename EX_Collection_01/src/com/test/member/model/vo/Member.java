package com.test.member.model.vo;

public class Member {
	private int numberID;
	private String name;
	private int age;
	private String addr;
	
	
	
	@Override
	public String toString() {
		return "Member [numberID=" + numberID + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

	public Member() {}
	
	public Member(int numberID, String name, int age, String addr) {
		
		this.numberID = numberID;
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	public int getNumberID() {
		return numberID;
	}
	public void setNumberID(int numberID) {
		this.numberID = numberID;
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
