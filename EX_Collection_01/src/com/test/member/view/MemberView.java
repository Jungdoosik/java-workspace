package com.test.member.view;

import java.util.Scanner;

import com.test.member.controller.MemberController;
import com.test.member.controller.MemberControllerImpl;
import com.test.member.model.vo.Member;

public class MemberView {
	private MemberController mCon = new MemberControllerImpl();
	private Scanner sc = new Scanner(System.in);

	
	
	public void menu() {
		while(true) {
			System.out.println("------ 전체 메뉴 출력 ------");
			System.out.println("1. 전체 회원 정보 출력");
			System.out.println("2. 회원 정보 출력(1명 선택)");
			System.out.println("3. 회원 정보 입력");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			int su = sc.nextInt();
			
			switch(su) {
			case 1 : selectAllMember(); break;
			case 2 : selectOneMember(); break;
			case 3 : insertMember(); break;
			case 4 : updateMember(); break;
			case 5 : deleteMember(); break;
			case 0 : System.out.println("프로그램 종료"); return;
			}
		}
			
	}
	private void selectAllMember() {
		
	}
	private void selectOneMember() {
		
		
	}
	private void insertMember() {
		Member m = new Member();
		
		System.out.print("회원 ID 입력 : ");
		m.setNumberID(sc.nextInt());
		System.out.print("회원 이름 입력 : ");
		m.setName(sc.next());
		System.out.print("회원 나이 입력 : ");
		m.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("회원 주소 입력 : ");
		m.setAddr(sc.nextLine());
		
		boolean result = mCon.insertMember(m);
		
		if(result) {
			System.out.println("데이터 입력 완료");
		}else {
			System.out.println("데이터 입력 실패 - 문의바람.");
		}
		
	}
	private void updateMember() {
		
	}
	private void deleteMember() {
		
	}
}
