package com.test.member.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.test.member.controller.MemberController;
import com.test.member.controller.MemberControllerImpl;
import com.test.member.model.vo.Member;


public class MemberView {
	private MemberController mCon = new MemberControllerImpl();
	private Scanner sc = new Scanner(System.in);
	
	public void menu() {
		
		while(true) {
			System.out.println("------- 회원 관리 프로그램 -------");
			System.out.println("1. 전체 회원 정보 출력 ");
			System.out.println("2. 회원 정보 출력(1명선택) ");
			System.out.println("3. 회원 정보 입력 ");
			System.out.println("4. 회원 정보 수정 ");
			System.out.println("5. 회원 정보 삭제 ");
			System.out.println("0. 프로그램 종료 ");
			System.out.print("선택 : ");
			int select = sc.nextInt();
			
			System.out.println();
			
			switch(select) {
			case 1: selectAllMember(); break;
			case 2: selectOneMember(); break;
			case 3: insertMember();break;
			case 4: updateMember();break;
			case 5: deleteMember();break;
			case 0:System.out.println("프로그램이 종료되었습니다.");return;
			}
			System.out.println();
		}
		
	}
	
	public void selectAllMember() {
		ArrayList<Member> list = mCon.selectAllMember();
		System.out.println("-------회원정보-------");
		
		for(Member m : list) {
			System.out.println(m);
		}
		
	}
	
	public void selectOneMember() {
		System.out.println("찾으시는 회원번호 입력 : ");
		int numberId = sc.nextInt();
		Member m = mCon.selectOneMember(numberId);
		
		System.out.println("-----회원 정보 출력 -----");
		System.out.println("ID : " + m.getNumberId());
		System.out.println("이름 : " + m.getName());
		System.out.println("나이 : " + m.getAge());
		System.out.println("주소 : " + m.getAddr());
		
	}
	
	public void insertMember() {
		
		
		System.out.print("id : ");
		int id = sc.nextInt();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("주소 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		
		Member m = new Member(id, name, age, addr);
		
		boolean result = mCon.insertMember(m);
		if(result == true) {
			System.out.println("회원등록에 성공");
		}else {
			System.out.println("회원등록에 실패");
		}
		
		
	}
	
	public void updateMember() {}
	
	public void deleteMember() {}
}
