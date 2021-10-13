package com.test.member.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.test.member.controller.MemberControllerImpl;
import com.test.member.model.vo.Member;

public class Memberview {
	private MemberControllerImpl mCon = new MemberControllerImpl();
	private Scanner sc = new Scanner(System.in);
	
	public void menu() {
		while(true) {
			System.out.println("------회원 관리 프로그램 ------");
			System.out.println("1. 전체회원 정보출력");
			System.out.println("2. 1명회원 정보출력");
			System.out.println("3. 회원 정보 입력");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			int select = sc.nextInt();
			
			System.out.println();
			switch(select) {
			case 1: selectAllMember(); break;
			case 2: selectOneMember(); break;
			case 3: insertMember(); break;
			case 4: updateMember(); break;
			case 5: deletMember(); break;
			case 0: System.out.println("프로그램을 종료하겠습니다."); return;
			} System.out.println();
		}
		
		
	}
	
	public void selectOneMember() {
		System.out.print("검색할 회원 ID 입력 : ");
		int id = sc.nextInt();
		
		Member m = mCon.selectOneMember(id);
		System.out.println(m);
		
	
	}
	
	public void selectAllMember() {
		
		ArrayList<Member> list = mCon.selectAllMember();
		
		System.out.println("=====회원정보출력=====");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}
	
	public void insertMember() {
		System.out.print("회원 ID 입력 : ");
		int id = sc.nextInt();
		
		System.out.print("회원 이름 입력 : ");
		sc.nextLine();
		String name = sc.next();
		
		System.out.print("회원 나이 입력 : ");
		int age = sc.nextInt();
		
		System.out.print("회원 주소 입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		
		Member m = new Member(id, name, age, addr);
		boolean result = mCon.insertMember(m);
		
		if(result == true) {
			System.out.println("회원 등록에 성공");
		}else {
			System.out.println("회원 등록에 실패");
		}
		
	}
	
	public void updateMember() {
		
		System.out.print("수정할 회원 ID 입력 : ");
		int id = sc.nextInt();
		
		Member m = mCon.selectOneMember(id);
		
		if(m != null) {
		
			System.out.println("회원정보 : " + m);
			
			System.out.println("=========수정 가능 항목=========");
			System.out.println("1. 이름 ");
			System.out.println("2. 나이 ");
			System.out.println("3. 주소 ");
			System.out.println("항목에 없는 번호 입력시 취소");
			System.out.print("수정할 항목 선택 : ");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.print("수정될 이름 입력 : ");
				sc.nextLine();
				String name = sc.next();
				System.out.println(m.getName() + " -> " + name);
				m.setName(name);
			}else if(select ==2) {
				System.out.print("수정될 나이 입력 : ");
				int age = sc.nextInt();
				System.out.println(m.getAge() + " -> " + age);
				m.setAge(age);
			}else if(select == 3) {
				System.out.print("수정될 주소 입력 : ");
				sc.nextLine();
				String addr = sc.nextLine();
				System.out.println(m.getAddr() + " -> " + addr);
				m.setAddr(addr);
			}else {
				System.out.println("잘못입력하셨습니다.처음으로 돌아갑니다");
				return;
			}
		}else {
			System.out.println("회원 정보가 없는 ID 입니다.");
		}
		System.out.println("수정완료");
		
		
	}
	
	public void deletMember() {
		System.out.println("삭제할 회원 ID 입력 (복구불가): ");
		int id = sc.nextInt();
		
		boolean result = mCon.deleteMember(id);
		
		if(result == true) {
			System.out.println(id+"ID는 삭제 되었습니다.");
			
		}else if(result==false){
			System.out.println(id+"ID는 없는회원입니다");
		}
		
		
	}
	
}
