package com.test.print;

import java.util.Scanner;

public class TestPrint {
	public void ex1() {
		int su;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일수를 알고싶은 달을 입력하시오 : ");
		su = sc.nextInt();
		
		switch(su) {
		case 1 : System.out.println("1월달은 31 일수입니다."); break;
		case 2 : System.out.println("2월달은 28 일수입니다."); break;
		case 3 : System.out.println("3월달은 31 일수입니다."); break;
		case 4 : System.out.println("4월달은 30 일수입니다."); break;
		case 5 : System.out.println("5월달은 31 일수입니다."); break;
		case 6 : System.out.println("6월달은 30 일수입니다."); break;
		case 7 : System.out.println("7월달은 31 일수입니다."); break;
		case 8 : System.out.println("8월달은 31 일수입니다."); break;
		case 9 : System.out.println("9월달은 30 일수입니다."); break;
		case 10 : System.out.println("10월달은 31 일수입니다."); break;
		case 11 : System.out.println("11월달은 30 일수입니다."); break;
		case 12 : System.out.println("12월달은 31 일수입니다."); break;
			default : System.out.println("몇 월인지 알 수 없습니다");
		}
	}
	public void ex2() {
		char point;
		
		System.out.println("장학금 지불 시스템 입니다.");
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 학점을 입력해주세요.\n(A학점, B학점, C학점, D학점, F학점)");
		System.out.print("입력 : ");
		point = sc.next().charAt(0);
		
		switch(String.valueOf(point).toUpperCase()) {
		case "A" : System.out.println("수고하셨습니다. 장학금을 100% 지급해드리겠습니다."); break;
		case "B" : System.out.println("약간 아쉽네요 장학금 50% 지원입니다.");break;
		case "C" : System.out.println("이번 학기 장학금은 없네요.. 힘내세요"); break;
		case "D" : System.out.println("장학금보다는 학고는 면하셨네요.. 노력하세요"); break;
		case "F" : System.out.println("이번학기 장학금으로 학고를 맞으셨습니다. 3GO일시 제적");break;
			default : System.out.println("성적을 제대로 입력해주세요");
		}
	}
	public void ex3() {
		System.out.println("===== 계산기 프로그램 =====");
		
		char ch;
		int su1,su2;
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자 입력 (+, -, *, / ) : ");
		ch = sc.next().charAt(0);
		System.out.print("첫번쨰 숫자 입력 : ");
		su1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		su2 = sc.nextInt();
		
		System.out.println("===== 결    과 =====");
		
		switch(ch) {
		case '+' : System.out.println(su1 + "+" + su2 + "=" + (su1+su2)); break;
		case '-' : System.out.println(su1 + "-" + su2 + "=" + (su1-su2)); break;
		case '*' : System.out.println(su1 + "*" + su2 + "=" + (su1*su2)); break;
		case '/' : System.out.println(su1 + "/" + su2 + "=" + (su1/(double)su2)); break;
			default : System.out.println("정확한 연산자를 입력해 주세요!!");
		}
	}
	public void ex4() {
		
		String fruit;
		int count;
		int su = 0;
		
		System.out.println("------ 과일 메뉴 ------");
		System.out.println("사과  / 딸기 / 수박 / 바나나 / 복숭아");
		Scanner sc = new Scanner(System.in);
		System.out.print("과일 이름을 입력하세요 : ");
		fruit = sc.nextLine();
		
		switch(fruit) {
		case "딸기" : System.out.println("딸기는 개당 1,000원 입니다.");
			su = 1000 ;break;
		case "사과" : System.out.println("사과는 개당 2,000원 입니다.");
			su = 2000;break;
		case "수박" : System.out.println("수박은 개당 8,000원 입니다.");
			su = 8000;break;
		case "바나나" : System.out.println("바나나는 개당 4,000원 입니다.");
			su = 4000;break;
		case "복숭아" : System.out.println("복숭아는 개당 5,000원 입니다.");
			su = 5000;break;
			default : System.out.println("잘못 선택하셨습니다. 다시선택해주세요");
		}
		
		System.out.print("몇개 주문하시겠습니까? : ");
		count = sc.nextInt();
		
		System.out.println("주문하신 과일 ["+ fruit + "]의 [" + count + "]개 금액은 총" + (count*su) + "원 입니다.");
	}
	
	public void ex5() {
		int su1 = 0;
		int su2 = 10;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		su1 = sc.nextInt();
		
		if (0<=su1 && su1<=100) {
			
			switch(su1/10) {
			case 10 : System.out.println(su1 + "점 ==> A등급"); break;
				
			case 9 : System.out.println(su1 + "점 ==> A등급"); break;
			
			case 8 : System.out.println(su1 + "점 ==> B등급"); break;
			
			case 7 : System.out.println(su1 + "점 ==> C등급"); break;
			
			case 6: System.out.println(su1 + "점 ==> D등급"); break;
				default : System.out.println( su1 + "점 ==> F등급");
			}
		}else {
			System.out.println("잘못된 입력 ( 0 ~ 100 사이 입력 )");
			}
		}
}
