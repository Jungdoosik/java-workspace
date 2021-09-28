package com.test.vo;
//데이터 자체를 표현하는 class를 모아놓은 패키지를 vo라고 부릅니다.
//vo는 value objact약자
public class Member {
	//이름, 나이 , 주소만 저장하는 객체
	//멤버 변수는 정보은닉을 위해서 private
	private String name;
	private int age;
	private String addr;
	
	public void setName(String name) {
		this.name = name;
	}
	//멤버변수와 메소드안에 매개변수가 동일한 이름인 경우에는
	//메소드에서 접근할 경우 가장 가까운 곳을 접근 한다.
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddr() {
		return addr;
	}
}
