package com.test.controller;

import com.test.vo.Member;

public class MemberController {
	private Member m;
	
	public void insertData(Member m) {
		this.m = m;
	}
	public void printData() {
		System.out.println("-------정보-------");
		System.out.println("이름 : " + m.getName());
		System.out.println("나이 : " + m.getAge());
		System.out.println("주소 : " + m.getAddr());
	}
}
