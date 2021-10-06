package com.test.member.vo;

public class Member implements Comparable {
	private String name;
	private int age;
	private String addr;
	
	public Member() {}
	public Member(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
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
	@Override
	public String toString() {
		return name + "/" + age + "/" + addr;
	}
	@Override
	public int compareTo(Object o) {
		//return this.age - ((Member)o).getAge();
		return   ((Member)o).getAge() - this.age;
	}
	
}
