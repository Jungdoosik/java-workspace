package com.test.print;

import java.util.Scanner;

public class TestPrint {
	public void ex1() {
		
		int su;
		System.out.println("======= 숫자 구별 프로그램 v1.0 =======");
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 수를 입력하세요 : ");
		su = sc.nextInt();
	
		if(su>0) {
			System.out.println("당신이 입력한 수 " + su + "는 양수입니다.");
		}
		if(su==0) {
			System.out.println("당신이 입력한 수 " + su + "는 0입니다.");
		}
		if(su<0) {
			System.out.println("당신이 입력한 수 " + su + "는 음수입니다.");
		}
		System.out.println("계속하려면 아무 거나 누르십시오...");
		}
	
	public void ex2() {
		 int su1;
		 int su2;
		 
		 System.out.println("======= 두 수를 비교하는 프로그램 v1.0 =======");
		 Scanner sc = new Scanner(System.in);
		 System.out.print("첫번째 수를 입력하시오 : ");
		 su1 = sc.nextInt();
		 System.out.print("두번째 수를 입력하시오 : ");
		 su2 = sc.nextInt();
		 
		 if(su1>su2) {
			 System.out.println(su1 + ">" + su2 + "\n 첫번째 수가 더 큽니다.");
		 }
		 if(su1<su2) {
			 System.out.println(su1 + "<" + su2 + "\n 두번째 수가 더 큽니다.");
		 }
		 if(su1 == su2) {
			 System.out.println(su1 + "=" + su2 + "\n 두 수가 같은 수 입니다.");
		 }
		 System.out.println("계속하려면 아무 키나 누르십시오...");
	}
	public void ex3() {
		int su1;
		int su2;
		char ch;
		
		System.out.println("계산기 프로그램 ver 1.0");
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자를 입력하세요(+, -, *, /) : ");
		ch = sc.next().charAt(0);
		System.out.print("첫번째 수 입력 : ");
		su1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		su2 = sc.nextInt();
		
		//if문은 조건문 다음에 실행하는 실행문이 1줄인 경우에는 (세미콜론 기준)
		//중괄호{}를 생략할 수 있다.
		if(ch == '+') {
			System.out.println(su1 + "+" + su2 + "=" + (su1+su2));
		}
		if(ch == '-') {
			System.out.println(su1 + "-" + su2 + "=" + (su1-su2));
		}
		if(ch == '*') {
			System.out.println(su1 + "*" + su2 + "=" + (su1*su2));
		}
		if(ch == '/') {
			System.out.println(su1 + "/" + su2 + "=" + (su1/(double)su2));
		}
	}
	public void ex4() {
		
		int su;
		Scanner sc = new Scanner(System.in);
		System.out.print("당신은 몇 살입니까? ");
		su = sc.nextInt();
		
		if(su<=19) {
			System.out.println("미성년자 이군요!!");
		}else {
			System.out.println("성인이군요!!");
		}
	}
	public void ex5() {
		int su1,su2;
		String result;
		
		System.out.println("첫번째 퀴즈입니다.");
		Scanner sc = new Scanner(System.in);
		System.out.print("사과는 영어로 무엇일까요? (1.Apple / 2. 잡스) : ");
		su1 = sc.nextInt();
		if(su1 == 1) {
			System.out.println("정답!!");
		}else {
			System.out.println("떙!");
		}
		
		System.out.println("두번째 퀴즈입니다.");
		System.out.print("바나나는 길어 길면은 기차 기차는? (1.빨라 / 2.비싸) : ");
		su2 = sc.nextInt();
		if(su2 == 1) {
			System.out.println("정답!!");
		}else {
			System.out.println("땡!");
		}
		result = su1 == 1 && su2 == 1 ? "총 2문제를 맞추셨습니다." : su1 == 2 && su2 == 2 ? "총 0 문제를 맞추셨습니다.":"총 1문제를 맞추셨습니다.";
		System.out.println(result);
	}
	public
}

