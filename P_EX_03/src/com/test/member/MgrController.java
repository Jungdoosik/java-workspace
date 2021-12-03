package com.test.member;

import java.util.Scanner;

public class MgrController {
	
	Scanner sc = new Scanner(System.in);
	Member m = new Member();
	
	public void start() {
		while(true) {
			System.out.println("======회원가입 프로그램 ver.1.0======");
			System.out.println("1. 회원가입");
			System.out.println("2. 회원 정보보기");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			int select = sc.nextInt();
			
			System.out.println();
			
			switch(select) {
			case 1 : insertMember(); break;
			case 2 : printMember(); break;
			case 0 : System.out.println("프로그램을 종료합니다."); break;
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
		
		String addr = sc.nextLine();
		
		System.out.print("성별입력 : ");
		String gender = sc.next();
		
		System.out.print("전화번호 입력 : ");
		String phone = sc.next();
		
		m.setName(name);
		m.setAge(age);
		m.setAddr(addr);
		m.setGender(gender);
		m.setPhone(phone);
		
		System.out.println("데이터입력 완료!!!");
	}
	
	public void printMember() {
		
		System.out.println("=====데이터 출력=====");
		
		System.out.println("이름 : " + m.getName());
		System.out.println("나이 : " + m.getAge());
		System.out.println("주소 : " + m.getAddr());
		System.out.println("성별 : " + m.getGender());
		System.out.println("전화번호 : " + m.getPhone());
		
		System.out.println("=====데이터 출력 완료=====");
	}

}
