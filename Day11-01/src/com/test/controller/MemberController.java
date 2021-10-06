package com.test.controller;

import java.util.Scanner;

import com.test.vo.Member;

//회원 정보를 바탕으로 회원 관리를 하는 Class
public class MemberController {
	Member m = new Member();
	
	Scanner sc = new Scanner(System.in);
	public void start() {
		while(true) {
			System.out.println("-------- 회원 관리 프로그램 --------");
			System.out.println("1. 신규 회원 정보 입력");
			System.out.println("2. 입력된 회원 정보 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1 : insertMember(); break;
			case 2 : printMember(); break;
			case 0 : System.out.println("이용해주셔서 감사합니다."); return;
			}
		}
	}
	
	
	//회원 정보를 입력할 수 있도록 하는 메소드
	public void insertMember() {
		System.out.print("새로 추가될 회원의 이름 입력 : ");
		String name = sc.next();
		m.setName(name);
		
		System.out.print("새로 추가될 회원의 나이 입력 : ");
		int age = sc.nextInt();
		m.setAge(age);
		sc.nextLine();
		
		System.out.print("새로 추가될 회원의 주소 입력 : ");
		String addr = sc.next();
		m.setAddr(addr);
		sc.nextLine();
	}
	//회원 정보를 출력할 수 있도록 하는 메소드
	public void printMember() {
		System.out.println("--------회원 정보 출력---------");
		System.out.println("회원의 이름 : " + m.getName());
		System.out.println("회원의 나이 : " + m.getAge());
		System.out.println("회원의 주소 : " + m.getAddr());
	}
}
