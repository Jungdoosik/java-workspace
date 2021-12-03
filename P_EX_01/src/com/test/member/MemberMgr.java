package com.test.member;

import java.util.Scanner;

public class MemberMgr {
	
	
	public void ex1() {
		testMethod(); // 안녕하세요 테스트 메소드 입니다.
		testMethod(10); // 호출 값은 10입니다.
		testMethod(10, 20); // 2개의 값은 10와20이며 합한 값은 30입니다.
	}

	public void testMethod() {
		System.out.println("안녕하세요 테스트 메소드 입니다.");
	}

	public void testMethod(int a) {
		System.out.println("호출 값은 "+a+"입니다.");
	}

	public void testMethod(int a, int b) {
		System.out.println("2개의 값은 "+a+"와"+b+"이며 합한 값은 "+(a+b)+"입니다.");
	}
	/*Scanner sc = new Scanner(System.in);
	
	private String name;
	private int age;
	private String addr;
	
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

	public void start() {
		
		while(true) {
			System.out.println("========회원가입프로그램========");
			System.out.println("1. 회원 정보 입력 : ");
			System.out.println("2. 회원 정보 확인 : ");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			int select = sc.nextInt();
			
			System.out.println();
			
			switch(select) {
			case 1 : createMember(); break;
			case 2 : readMember(); break;
			case 0 : System.out.println("프로그램이 종료되었습니다 ㅃㅃ"); return;
			}
			System.out.println();
		}
	}
	
	public void createMember() {
		
		System.out.println("회원정보를 입력해주세요!!");
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("주소 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		
		setName(name);
		setAge(age);
		setAddr(addr);
		
		System.out.println("정보입력이 완료되었습니다.");	
	}
	
	public void readMember() {
		
		System.out.println("=========회원 정보 출력========");
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("주소 : " + getAddr());
		
		System.out.println("회원정보 확인");
	}*/
}




