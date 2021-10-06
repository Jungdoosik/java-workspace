package com.test.controller;

import java.util.Scanner;

import com.test.vo.Member;

public class MemberController {
	Member m = new Member();
	Scanner sc = new Scanner(System.in);
	
	public void start() {
		while(true) {
			System.out.println("------회원정보-------");
			System.out.println("1. 회원정보입력");
			System.out.println("2. 회원정보출력");
			System.out.println("0. 프로그램종료");
			System.out.print("선택 : ");
			int su = sc.nextInt();
			sc.nextLine();
			
			switch(su) {
			case 1 : insertMember(); break;
			case 2 : printMember(); break;
			case 0 : System.out.println("프로그램이 종료 되었습니다."); return;
			}
		}
	}
	public void insertMember() {
		System.out.println("-----입력-----");
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
		System.out.println("======회원정보=======");
		System.out.printf("%10s %10s %10s \n","이름","나이","주소");
		System.out.printf("%10s %10d %10s \n",
				m.getName(),
				m.getAge(),
				m.getAddr());
		
	}
}
