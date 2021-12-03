package com.test.university;

import java.util.Scanner;

public class StdMgr {

	Student[] st = new Student[3];
	Scanner sc = new Scanner(System.in);
	
	public StdMgr() {
		for (int i = 0; i < st.length; i++) {
			st[i] = new Student();
		}
	}

	public void start() {

		while (true) {
			System.out.println("-----------학생관리 시스템------------");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				insertData();
				break;
			case 2:
				printData();
				break;
			case 3:
				System.out.println("프로그램을 사용해주셔서 감사합니다");
				return;
			}
			System.out.println();
		}
		

	}

	public void insertData() {

		for (int i = 0; i < st.length; i++) {
			System.out.println("------정보입력------");

			System.out.print((i + 1) + "번쨰 학생 학번 입력 : ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print((i + 1) + "번쨰 학생 이룸 입력 : ");
			String name = sc.nextLine();
			System.out.print((i + 1) + "번쨰 학생 성적 입력 (A,B,C,D,F) : ");
			char grade = sc.next().charAt(0);
			

			st[i].setNumber(number);
			st[i].setName(name);
			st[i].setGrade(grade);

		}
		System.out.println("입력 완료");
	}
	public void printData() {
		
		System.out.println("--------회원 정보 출력--------");
		System.out.printf("%10s %10s %10s \n","학번","이름", "성적");
		
		for(int i =0; i < st.length; i++) {
			
			System.out.printf("%7d %8s %10s \n", st[i].getNumber(), st[i].getName(),st[i].getGrade());
			
		}
		System.out.println("데이터 출력 완료");

	}

}
