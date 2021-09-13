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
		int count=0;
		
		System.out.println("========== Quiz 프로그램 =========");
		System.out.println("첫번째 퀴즈입니다.");
		Scanner sc = new Scanner(System.in);
		System.out.print("사과는 영어로 무엇일까요? (1.Apple / 2. 잡스) : ");
		su1 = sc.nextInt();
		if(su1 == 1) {
			System.out.println("정답!!");//정답을 맞추었다면
			
			count++;
		}else {
			System.out.println("떙!");//정답을 틀렸다면
		}
		
		System.out.println("두번째 퀴즈입니다.");
		System.out.print("바나나는 길어 길면은 기차 기차는? (1.빨라 / 2.비싸) : ");
		//변수를 또 하나 더 만드는 분들이 있습니다.
		//기존에 입력한 데이터가 유지 되어야만 한다면 새로운 입력에서는 변수를 만들어야 합니다.
		//그런데 기존에 입력한 데이터를 굳이 유지 시키고 싶지 않다면! 기존 변수를 사용해도 됩니다.
		
		su2 = sc.nextInt();
		if(su2 == 1) {
			System.out.println("정답!!");
			count++;
		}else {
			System.out.println("땡!");
		}
		/*result = su1 == 1 && su2 == 1 ? "총 2문제를 맞추셨습니다." : su1 == 2 && su2 == 2 ? "총 0 문제를 맞추셨습니다.":"총 1문제를 맞추셨습니다.";
		System.out.println(result);*/
		//문제가 2개가아니라 10개 100개가 되면 사용하기힘듬
		
		System.out.println("총" + count + "문제를 맞추셨습니다.");
	}
	public void ex6() {
		char ch;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신은 회원입니까?(Y/N)");
		ch = sc.next().charAt(0);
		
		if(ch == 'Y' || ch == 'y') {
			System.out.print("유료회원인가요?(Y/N)");
			ch = sc.next().charAt(0);
			if(ch == 'Y' || ch == 'y') {
				System.out.println("당신은 VIP 회원!");
			}else {
				System.out.println("유료가입해주세요");
			}
		}else {
			System.out.print("가입을 희망합니까?(Y/N)");
			ch = sc.next().charAt(0);
			if(ch == 'Y' || ch == 'y') {
				System.out.println("가입사이트 안내하겠습니다.");
			}else {
				System.out.println("다음에 다시 이용해주세요.");
			}
		}
	}
	//9월 13일 오후(4:30)
	public void ex7() {
		int su1,su2;
		char ch;
		
		System.out.println("계산기 프로그램 ver1.0");
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자를 입력하세요 (+, -, *, /) : ");
		ch = sc.next().charAt(0);
		
		System.out.print("첫번째 수 입력 : ");
		su1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		su2 = sc.nextInt();
		
		if(ch == '+') {
			System.out.println(su1 + "+" + su2 + "=" +(su1+su2));
		}else if(ch == '-') {
			System.out.println(su1 + "-" + su2 + "=" +(su1-su2));
		}else if(ch == '*') {
			System.out.println(su1 + "*" + su2 + "=" +(su1*su2));
		}else if(ch == '/') {
			System.out.println(su1 + "/" + su2 + "=" +(su1/(double)su2));
		}	
	}
	public void ex8() {
		char ch;
	
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		ch = sc.next().charAt(0);
		
		System.out.println("==== 결 과 ====");
		
		if('a'<=ch && 'z'>=ch) { //소문자범위(97~122)  (char)(ch-32)(char)(ch^32)
			System.out.println("소문자를 입력 하였습니다.");
			System.out.println("대문자로 변환 : " +  String.valueOf(ch).toUpperCase());
		}else if('A'<=ch && ch<='Z') {//대문자범위 (65~90)(char)(ch+32)(char)(ch^32)
			System.out.println("대문자를 입력 하였습니다.");
			System.out.println("대문자로 변환 : " +  String.valueOf(ch).toLowerCase());
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	public void ex9() {
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		if(num == 0 ) {
			System.out.println("[" + num + "] 0입니다.");
		}else if(num%3 ==0 && num%4 ==0) {
			System.out.println("[" + num + "] 3의 배수이면서 4의 배수 입니다.");
		}else if(num%4 == 0 ) {
			System.out.println("["+ num + "]은(는) 4의 배수 입니다.");
		}else if(num%3 == 0 ) {
			System.out.println("["+ num + "]은(는) 3의 배수 입니다.");
		}else  {//필요한 경ㅇ 이렇게 표현가능 -> su%3 ==0 && su%4 ==0
			System.out.println("[" + num + "] 3의 배수도 4의 배수도 아닙니다.");
		}
		
	}
	
}

