package com.test.member;

import java.util.Scanner;

public class MemberController {
	private Member m = new Member();
	Scanner sc = new Scanner(System.in);
	
	
	public void start() {
		while(true) {
		System.out.println("-----회원정보입력-----");
		System.out.println("1. 회원정보 입력  ");
		System.out.println("2. 회원정보 출력  ");
		System.out.println("0. 회원정보 종료 Bye ");
		System.out.print("선택 : ");
		int a = sc.nextInt();
		
		switch(a) {
		case 1 :insertMember(); break;
		case 2 :printMember(); break;
		case 0 : return;
		}
		}
	}
	public void insertMember() {
		System.out.println("---------회원정보입력----------");
		System.out.print("이름 : ");
		String name = sc.next();
		m.setName(name);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		m.setAge(age);
		sc.nextLine();
		
		System.out.print("주소 : ");
		String addr = sc.nextLine();
		m.setAddr(addr);
	}
	public void printMember() {
		System.out.println("=====정보출력=====");
		System.out.println("이름 : " + m.getName());
		System.out.println("나이 : " + m.getAge());
		System.out.println("주소 : " + m.getAddr());
	}
	
}
