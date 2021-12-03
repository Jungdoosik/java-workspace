package com.test.membercontroller;

import java.util.Scanner;

import com.test.member.Member;

public class MemberController {
	Scanner sc = new Scanner(System.in);
	Member m =new Member();
	
	public void start() {
		while(true) {
			System.out.println("=========회원정보 프로그램 ver.1.0=========");
			System.out.println("1. 회원정보입력");
			System.out.println("2. 회원정보출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			int select = sc.nextInt();
			
			System.out.println();
			
			switch(select) {
			case 1 : insertMember(); break;
			case 2 : readMember(); break;
			case 0 : System.out.println("프로그램이 종료되었습니다 ㅃㅃ"); return;
			}
			System.out.println();
		}
	}
	
	public void insertMember() {
		System.out.print("이름입력 : ");
		String name = sc.next();
		
		System.out.print("나이입력 : ");
		int age = sc.nextInt();
		
		System.out.print("주소입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		
		m.setName(name);
		m.setAge(age);
		m.setAddr(addr);
		
		System.out.println("=====데이터 입력완료=====");
	}
	
	public void readMember() {
		System.out.println("=====회원정보 출력=====");
		
		System.out.println("이름 : " + m.getName());
		System.out.println("나이 : " + m.getAge());
		System.out.println("주소 : " + m.getAddr());
		
		System.out.println("=====데이터 출력완료=====");
		
		
	}

}
