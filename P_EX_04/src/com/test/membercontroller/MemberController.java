package com.test.membercontroller;

import java.util.Scanner;

import com.test.member.Member;

public class MemberController {
	private Scanner sc = new Scanner(System.in);
	private Member[] m = new Member[3];
	
	public MemberController() {
		for(int i =0; i < m.length; i++) {
			m[i] = new Member();	
		}
	}
	
	public void start() {
		
		
		while(true) {
			System.out.println("=======학생정보프로그램 ver.1.0=======");
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생정보출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			int select = sc.nextInt();
			
			System.out.println();
			
			switch(select) {
			case 1 : insertMember(); break;
			case 2 : printMember(); break;
			case 0 : System.out.println("프로그램이 종료되었습니다 ㅃㅃ"); return;
			}
			System.out.println();
		}
		
	}
	
	public void insertMember() {
		System.out.println("======학생정보입력======");
		
		for(int i = 0; i < m.length; i++) {
			System.out.print((i+1) + "번 학생 이름 : ");
			String name = sc.next();
			
			System.out.print((i+1) + "번 학생 나이 : ");
			int age = sc.nextInt();
			
			System.out.print((i+1) + "번 학생 주소 : ");
			sc.nextLine();
			String addr = sc.nextLine();
			
			m[i].setName(name);
			m[i].setAge(age);
			m[i].setAddr(addr);
			
			System.out.println((i+1)+"번쩨 학생 데이터 입력완료");
		}
		System.out.println("======데이터 입력 완료======");
		System.out.println();
		
		
		
	}
	
	public void printMember() {
		
		System.out.println("=====학생들 데이터 출력=====");
		
		for(int i = 0; i < m.length; i++) {
			System.out.println();
			System.out.println((i+1)+"번째 학생의 이름 : " + m[i].getName());
			System.out.println((i+1)+"번째 학생의 이름 : " + m[i].getAge());
			System.out.println((i+1)+"번째 학생의 이름 : " + m[i].getAddr());
			System.out.println();
		}
		System.out.println("데이터 출력 완료!!!");
	}
}
