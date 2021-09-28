package com.test.print;

import java.util.Random;
import java.util.Scanner;

public class TestPrint {
	public void ex1() {
	
		int su;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("임의의 수를 입력 : ");
		su = sc.nextInt();
		System.out.println("===== 결과출력 =====");
		System.out.printf("10진수 : %d \n" , su);
		System.out.printf("8진수 : %o \n" , su);
		System.out.printf("16진수 : %x \n" , su);
	}
	public void ex2() {
		int su1, su2;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 : ");
		su1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		su2 = sc.nextInt();
		System.out.println("===== 결과출력 =====");
		System.out.println(su1 + " + " + su2 + " = " + (su1+su2));
	}
	public void ex3() {
		int kor, eng, math;
		int sum;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		eng = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		math = sc.nextInt();
		
		
		sum = kor + eng + math;
		avg = sum/3.0;
		System.out.println("===== 결과출력 =====");
		System.out.printf("평균점수 : %.2f \n" , avg);
		System.out.println("합계점수 : " + sum);
	}
	public void ex4() {
		String name;
		int age;
		double heigth;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나의 이름 입력 : ");
		name = sc.next();
		System.out.print("나의 키(신체) 입력 : ");
		heigth = sc.nextDouble();
		System.out.print("나의 나이 입력 : ");
		age = sc.nextInt();
		
		System.out.println("======= 입력 정보 출력 =======");
		System.out.println("나의 이름은 [" + name + "] 입니다.");
		System.out.println("나의 키는 [" + heigth + "]cm 입니다.");
		System.out.println("나의 나이는 [" + age + "]세 입니다.");
	}
	public void ex5() {
		String name;
		int age;
		String addr;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("나이  : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("주소 : ");
		addr = sc.nextLine();
		
		System.out.println("======결과 출력======");
		System.out.println("입력한 이름 : " + name);
		System.out.println("입력한 나이 : " + age);
		
		
		System.out.println("입력한 주소 : " + addr);
	}
	public void ex6() {
		int su1,su2;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		su1 = sc.nextInt();
		System.out.print("두번쨰 수 입력 : ");
		su2 = sc.nextInt();
		
		System.out.println("==== 출력결과 ====");
		System.out.println("두수를 더한수 : " + (su1 + su2)) ;
		System.out.println("두수를 뺸수 : " + (su1 - su2));
		System.out.println("두수를 곱한수 : " + (su1 * su2));
		System.out.println("두수를 나눈수 : " + (su1 / su2));
	}
	public void ex7() {
		int age;
		String result;
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		result = age >19 ? "성인입니다. 어서오세요." : "미성년자는 입장불가입니다.";
		
		System.out.println(result);
	}
	public void ex8() {
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		String result;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		eng = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		avg = sum/3.0;
		result = kor>=40 && eng>=40 && math>=40 && avg>=60? "합격 입니다." : "불합격 입니다.";
		System.out.println("==== 결과 출력 ====");
		System.out.printf("평균 점수 : %.2f \n" , avg);
		System.out.println("합계 점수 : " + sum);
		System.out.println("합격 여부 : " + result);
	}
	public void ex9() {
		int su;
		String result;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("임의의 정수를 입력 : ");
		su = sc.nextInt();
		
		result = su%2 == 0 ? "입력한 수는 짝수다.":"입력한 수는 홀수다.";
		System.out.println("==== 결과 ====");
		System.out.println(result);	
	}
	public void ex10() {
		int su;
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 수를 입력하세요 : ");
		su = sc.nextInt();
		if(su>0) {
			System.out.println("당신이 입력한 수 "+su+"는 양수입니다.");
		}
		if(su==0) {
			System.out.println("당신이 입력한 수 "+su+"는 0입니다.");
		}
		if(su<0) {
			System.out.println("당신이 입력한 수 "+su+"는 음수입니다.");
		}
	}
	public void ex11() {
		int su1,su2;
		System.out.println("==== 두수 비교 하는 프로그램 v1.0 ==== ");
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력 하세요 : ");
		su1 = sc.nextInt();
		System.out.print("두번째 수를 입력 하세요 : ");
		su2 = sc.nextInt();
		if(su1>su2) {
			System.out.println( su1 + " > " + su2 + "\n첫번째 수가 더 큽니다.");
		}
		if(su1<su2) {
			System.out.println( su1 + " < " + su2 + "\n두번째 수가 더 큽니다.");
		}
		if(su1==su2) {
			System.out.println( su1 + " = " + su2 + "\n두수가 같은 수 입니다.");
		}
	}
	public void ex12() {
		int su1,su2;
		char yun;
		System.out.println("계산기 프로그램 ver 1.0");
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자를 입력하세요(+,-,*,/) : ");
		yun = sc.next().charAt(0);
		System.out.print("첫번째 수 입력 : ");
		su1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		su2 = sc.nextInt();
		if(yun == '+') {
			System.out.println(su1 + " + " + su2 + " = " + (su1+su2));
		}
		if(yun == '-') {
			System.out.println(su1 + " - " + su2 + " = " + (su1-su2));
		}
		if(yun == '*') {
			System.out.println(su1 + " * " + su2 + " = " + (su1*su2));
		}
		if(yun == '/') {
			System.out.println(su1 + " / " + su2 + " = " + (su1/(double)su2));
		}
	}
	public void ex13() {
		Scanner sc = new Scanner(System.in);
		int su;
		
		System.out.print("당신은 몇살입니까? : ");
		su = sc.nextInt();
		
		if(su>19) {
			System.out.println("성인이군요!!");
		}else {
			System.out.println("미성년자 이군요!!");
		}
		
	}
	public void ex14() {
		Scanner sc = new Scanner(System.in);
		int su;
		int count = 0;
		
		System.out.println("첫번째 퀴즈 입니다.");
		System.out.print("사과는 영어로 무엇일까요? (1.Apple / 2.잡스) : ");
		su = sc.nextInt();
		if(su == 1) {
			System.out.println("정답!!");
			count++;
		}else {
			System.out.println("떙!!");
		}
		System.out.println("두번째 퀴즈 입니다.");
		System.out.print("바나나는 길어 길으면 기차 기차는? (1.빨라 / 2.비싸) : ");
		su = sc.nextInt();
		if(su == 1) {
			System.out.println("정답!!");
			count++;
		}else {
			System.out.println("떙!!");
		}
		System.out.println("총 " + count + " 문제를 맞추셨습니다.");
	}
	public void ex15() {
		char choice;
		Scanner sc = new Scanner(System.in);
		System.out.print("당신은 회원입니까?");
		choice = sc.next().charAt(0);
		if(choice == 'y' || choice == 'Y') {
			System.out.print("유료회원인가요?");
			choice = sc.next().charAt(0);
			if(choice == 'y' || choice == 'Y') {
				System.out.println("당신은 VIP 회원!");
			}else {
				System.out.println("유료가입해주세요!!");
			}
		}else {
			System.out.print("가입을 희망합니까?");
			choice = sc.next().charAt(0);
			if(choice == 'y' || choice == 'Y') {
				System.out.println("가입사이트 안내하겠습니다.");
			}else {
				System.out.println("다음에 다시 이용해주세요!!");
			}
		}	
	}
	public void ex16() {
		Scanner sc = new Scanner(System.in);
		int su1, su2;
		char yun;
		
		System.out.println("계산기 프로그램 ver1.0");
		System.out.print("연산자를 입력하세요 (+,-,*,/) : ");
		yun = sc.next().charAt(0);
		System.out.print("첫번쨰 수 입력 : ");
		su1 = sc.nextInt();
		System.out.print("두번쨰 수 입력 : ");
		su2 = sc.nextInt();
		if(yun == '+') {
			System.out.println(su1 + " + " + su2 + " = " + (su1 + su2) );
		}else if(yun == '-') {
			System.out.println(su1 + " - " + su2 + " = " + (su1 - su2) );
		}else if(yun == '*') {
			System.out.println(su1 + " * " + su2 + " = " + (su1 * su2) );
		}else if(yun == '/') {
			System.out.println(su1 + " / " + su2 + " = " + (su1 / (double)su2) );
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	public void ex17() {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		ch = sc.next().charAt(0);
		System.out.println("==== 결과 ====");
		
		if('a'<= ch && ch <='z') {
			System.out.println("소문자를 입력 하였습니다.");
			System.out.println("대문자로 변환 : " + String.valueOf(ch).toUpperCase());
		}else if ('A'<=ch && ch <= 'Z') {
			System.out.println("대문자를 입력하였습니다.");
			System.out.println("소문자로 변환 : " + String.valueOf(ch).toLowerCase());
		}else {
			System.out.println("잘못입력하였습니다. 영문자를 입력해주세요.");
		}
	}
	public void ex18() {
		Scanner sc = new Scanner(System.in);
		int su;
		
		System.out.print("정수 입력 : ");
		su = sc.nextInt();
		
		if(su%3==0 && su%4==0) {
			System.out.println(su + "는 3의 배수이면서, 4의 배수입니다.");
		}else if(su%3 == 0) {
			System.out.println(su + "는3 의 배수입니다.");
		}else if(su%4 == 0) {
			System.out.println(su + "는 4의 배수입니다.");
		}else if(su == 0) {
			System.out.println(su + "는 3의 배수도 4의 배수도 아닙니다.");
		}else {
			System.out.println(su + "는 3의 배수도 4의 배수도 아닙니다.");
		}
	}
	public void ex19() {
		Scanner sc = new Scanner(System.in);
		int month;
		
		System.out.print("일수를 알고 싶은 달을 입력하시오 : ");
		month = sc.nextInt();
		
		switch(month) {
		
		case 1 : System.out.println("1월달은 31일수 입니다.");break;
		case 2 : System.out.println("2월달은 28일수 입니다.");break;
		case 3 : System.out.println("3월달은 31일수 입니다.");break;
		case 4 : System.out.println("4월달은 30일수 입니다.");break;
		case 5 : System.out.println("5월달은 31일수 입니다.");break;
		case 6 : System.out.println("6월달은 30일수 입니다.");break;
		case 7 : System.out.println("7월달은 31일수 입니다.");break;
		case 8 : System.out.println("8월달은 31일수 입니다.");break;
		case 9 : System.out.println("9월달은 30일수 입니다.");break;
		case 10 : System.out.println("10월달은 31일수 입니다.");break;
		case 11 : System.out.println("11월달은 30일수 입니다.");break;
		case 12 : System.out.println("12월달은 31일수 입니다.");break;
		default : System.out.println("다시입력하세요!!!");
		}
	}
	public void ex20() {
		int i = 1;
		while(i <= 5) {
			System.out.println("안녕하세요");
			i++;
		}
	}
	public void ex21() {
		Scanner sc = new Scanner(System.in);
		int su1;
		int su2 = 1;
		System.out.print("동작할 횟수 입력 : ");
		su1 = sc.nextInt();
		
		while(su2 <= su1) {
			System.out.println(su2 + ". 안녕하세요");
			su2++;
		}
	}
	public void ex22() {
		int su =1;
		System.out.println("구구단 2단 출력");
		while(su <=9) {
			System.out.println("2 x " + su + " = " + (2*su));
			su++;
		}
	}
	public void ex23() {
		Scanner sc = new Scanner(System.in);
		int su;
		int su2 = 1;
		
		System.out.print("출력할 단수 입력 : ");
		su = sc.nextInt();
		
		while(su2 <= 9) {
			System.out.println(su + " x " + su2 + " = " + (su*su2));
			su2++;
		}
	}
	public void ex24() {
		Scanner sc = new Scanner(System.in);
		int su1;
		int su2 = 1;
		int sum = 0;
		
		while(su2 <= 5) {
			System.out.print(su2 + "번째 정수 입력 : ");
			su1 = sc.nextInt();
			su2++;
			sum += su1;
		}
		System.out.println("입력한 5개 정수 합 : " + sum);
	}
	public void ex25() {
		 Scanner sc = new Scanner(System.in);
		 int start, last;
		 int sum = 0;
		 
		 System.out.print("시작 정수 입력 : ");
		 start = sc.nextInt();
		 System.out.print("끝 정수 입력 : ");
		 last = sc.nextInt();
		 
		 int i = start;
		 while(i <= last) {
			 sum += i;
			 i ++;
		 }System.out.println(start + " ~ " + last + "까지의 합은 [" + sum + "] 입니다.");
	}
	public void ex26() {
		int su1 ,su2;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		su1 = sc.nextInt();
		System.out.print("두번쨰 정수 입력 : ");
		su2 = sc.nextInt();
		
		int start = su1;
		int end = su2;
		
		if(su1> su2) {
			start = su2;
			end = su1;
		}
		
		int i = start;
		int sum = 0;
		while(i <=end) {
			sum += i;
			i++;
		}
		System.out.println(start + " ~ " + end + "까지의 합은 [" + sum + "] 입니다.");	
	}
	public void ex27() {
		System.out.println("자동 덧셈 계산기");
		Scanner sc = new Scanner(System.in);
		
		int su1;
		int sum = 0;
		int count = 0;
		do {
			System.out.print("정수를 입력하세요(0 이면 종료) : ");
			su1 = sc.nextInt();
			sum += su1;
			count++;
		}while(su1 != 0);
		System.out.println("입력한 [" + (count-1) +"]개의 정수 합은 ["+ sum + "] 입니다.");
	}
	public void ex28() {
		for(int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
	}
	public void ex29() {
		Scanner sc = new Scanner(System.in);
		int i;
		
		System.out.print("동작할 횟수 입력 : ");
		i = sc.nextInt();
		for(int j = 0; j < i; j++) {
			System.out.println((j+1) + ". 안녕하세요");
		}
	}
	public void ex30() {
		System.out.println("구구단 2단 출력");
		for(int i = 1; i < 10; i++) {
			System.out.println("2 x " + i + " = " + (2*i));
		}
	}
	public void ex31() {
		Scanner sc = new Scanner(System.in);
		int su;
		System.out.print("출력할 단수 입력 : ");
		su = sc.nextInt();
		System.out.println("구구단 [" + su + "]단 출력");
		
		for(int i = 1; i < 10; i++) {
			System.out.println(su + " x " + i + " = " + (su*i));
		}
	}
	public void ex32() {
		Scanner sc = new Scanner(System.in);
		int su1;
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1) + "번째 정수 입력 : ");
			su1 = sc.nextInt();
			
			sum += su1;
		}
		System.out.println("입력한 5개의 정수 합 : " + sum);	
	}
	public void ex33() {
		Scanner sc = new Scanner(System.in);
		int start,end;
		
		System.out.print("시작 정수 입력 : ");
		start = sc.nextInt();
		System.out.print("끝 정수 입력 : ");
		end = sc.nextInt();
		
		int sum = 0;
		
		for(int i = start; i <= end; i++) {
			sum += i;
		}System.out.println(start + "~" + end + "까지의 합은 [" + sum + "] 입니다.");
	}
	public void ex34() {
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j <10; j++) {
				System.out.printf("%1d x %d = %1d \t",i,j,i*j );
				//System.out.print(i+"*"+j+"="+" "+(i*j)+"\t");
			}System.out.println();
		}
	}
	public void ex35() {
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j <10; j++) {
				System.out.printf("%1d x %d = %1d \t",j,i,i*j );
				//System.out.print(i+"*"+j+"="+" "+(i*j)+"\t");
			}System.out.println();
		}
	}
	public void ex36() {
		int su1,su2;
		char yun;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("계산기 프로그램 ver 1.0");
			System.out.print("연산자를 입력하세요(+,-,*,/ (종료는 q)) : ");
			yun = sc.next().charAt(0);
			if(yun == 'q' || yun == 'Q') {
				System.out.println("계산기를 이용해주셔서 감사드립니다.");
				break;
			}
			System.out.print("첫번째 수 입력 : ");
			su1 = sc.nextInt();
			System.out.print("두번째 수 입력 : ");
			su2 = sc.nextInt();
			
			switch(yun) {
			case '+' : System.out.println(su1 + " + " + su2 + " = " + (su1+su2));break;
			case '-' : System.out.println(su1 + " - " + su2 + " = " + (su1-su2));break;
			case '*' : System.out.println(su1 + " * " + su2 + " = " + (su1*su2));break;
			case '/' : System.out.println(su1 + " / " + su2 + " = " + (su1/(double)su2));break;
			}
			System.out.println();
			System.out.println("------ Next ------");
			System.out.println();
		}
	}
	public void ex37() {
		Random r = new Random();
		
		while(true) {
			System.out.println("0~9 까지의 랜덤 수 : " + (r.nextInt(10)));
			System.out.println("1~10 까지의 랜덤 수 : " + (r.nextInt(10)+1));
			System.out.println("20~35 까지의 랜덤 수 : " + (r.nextInt(16)+20));
			System.out.println("0 또는 1 까지의 랜덤 수 : " + (r.nextInt(2)));
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("-------------");
			System.out.println();
		}
		
	}
	public void ex38() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int su1;
		
		while(true) {
			System.out.println("==== 동전 앞 뒤 맞추기 ====");
			System.out.print("숫자를 입력해주세요. (1.앞면 / 2.뒷면) : ");
			su1 = sc.nextInt();
			
			if(su1 ==0 || su1 >2) {
				System.out.println("잘못입력하였습니다.");
				continue;
				}
			
			System.out.println();
			
			int su2 = r.nextInt(2)+1;
			if(su2 == su1) {
				System.out.println("맞췄습니다^^");
			}else {
				System.out.println("떙! 틀렸습니다!");
			}
			System.out.println("--------------->restart");
			System.out.println();
		}
	}
	public void ex39() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int money = 500;
		int bet;
		int su1;
		
		while(true) {
			System.out.println("==== 동전 앞 뒤 맞추기 ====");
			System.out.println("현재 소지금 : " + money);
			System.out.print("배팅금을 입력하세요 : ");
			bet = sc.nextInt();
			if(bet > money) {
				System.out.println("현재 소지금 보다 높은 배팅을 하셨습니다.");
				continue;
			}
			System.out.print("숫자를 입력해주세요. (1.앞면 / 2.뒷면) : ");
			su1 = sc.nextInt();
			
			if(su1 ==0 || su1 >2) {
				System.out.println("잘못입력하였습니다.");
				continue;
				}
			money -= bet;
			System.out.println();
			
			int su2 = r.nextInt(2)+1;
			if(su2 == su1) {
				System.out.println("맞췄습니다^^");
				System.out.println(bet + "원을 얻었습니다.");
				money = money + (bet*2);
			}else {
				System.out.println("떙! 틀렸습니다!");
				System.out.println(bet + "원을 잃었습니다.");	
			}
			
			if(money == 0) {
				System.out.println("돈 더가져와~~^^");
				break;
			}
			System.out.println("--------------->restart");
			System.out.println();
		}
		
		
	}
	public void ex40() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("==== Up & Down ====");
		System.out.println("이 게임은 1~ 100 사이의 수 하나를 맞추는 게임입니다.");
		System.out.println("<<Game Start>>");
		int user;
		int count = 0;
		int su1 = r.nextInt(100)+1;
		
		
		while(true) {
			System.out.print("숫자를 입력해 주세요 : ");
			user = sc.nextInt();
			
			if(user == su1) {
				System.out.println("정답입니다.");
				count++;
				System.out.println(count + "번 만에 맞췄습니다. 숫자를 입력해주세요.");
				su1 = r.nextInt(100)+1;
				count = 0;
				continue;
			}else if(user > su1) {
				System.out.println("DOWN!!");
				count++;
			}else if(user < su1) {
				System.out.println("UP!!");
				count++;
			}
		}
		
	}
	public void ex41() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("==== Up & Down ====");
		System.out.println("이 게임은 1~ 100 사이의 수 하나를 맞추는 게임입니다.");
		System.out.println("<<Game Start>>");
		int user;
		int count = 0;
		int su1 = r.nextInt(100)+1;
		
		int start =1;
		int end = 100;
		System.out.println("현재 범위 : " + start + " ~ " + end);
		while(true) {
			System.out.println("-----User-----");
			System.out.print("유저선택 : ");
			user = sc.nextInt();
			
			if(user == su1) {
				System.out.println("정답입니다.");
				su1 = r.nextInt(100)+1;
				break;
			}else if(user > su1) {
				System.out.println("DOWN!!");
				end = user -1;	
			}else if(user < su1) {
				System.out.println("UP!!");
				start = user +1;	
			}System.out.println("현재 범위 : " + start + "~" + end);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
			System.out.println("-----com-----");
			int com = r.nextInt(100)+1;
			System.out.println("컴퓨터 선택 : " + com);
			
			if(com == su1) {
				System.out.println("정답입니다");
				System.out.println("당신이 패배하였습니다.");
				break;
			}else if(com > su1) {
				System.out.println("DOWN!!");
				end = com -1;
			}else {
				System.out.println("up!!");
				start = com +1;
			}System.out.println("현재 범위 : " + start + "~" + end);
		}
		
	}
	public void ex42() {
		String[] arr = {"딸기", "복숭아", "키위", "사과", "바나나"};
		Scanner sc = new Scanner(System.in);
		int fruit;
		System.out.print("몇번째 과일을 출력하시겠습니까? : ");
		fruit = sc.nextInt();
		
		System.out.println("당신이 선택한 과일은 [" + arr[fruit-1] + "]이군요");
	}
	public void ex43() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		int sum = 0;
		for(int i = 0; i <5; i++) {
			System.out.println((i+1) + "번째 정수 입력 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}System.out.println("5개의 정수를 합한 값 : " + sum);
	}
	public void ex44() {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i <arr.length; i++) {
			System.out.print((i+1) + "번째 학생 점수 입력 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		for(int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		avg = sum/5.0;
		System.out.printf("학생들의 성적(평균) %.1f \n" , avg);
		System.out.println("학생들의 성적 (총합) : " + sum);	
	}
	public void ex45() {
		Scanner sc = new Scanner(System.in);
		int[]arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+ "번째 정수 입력 : ");
			arr[i] = sc.nextInt();
		}
		for(int j=0;j<arr.length-1;j++)
		{
			for(int i=0;i<(arr.length-1)-j;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int tmp;
					tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
		
		/*int tmp;
		if(arr[0]>arr[1]) {
			tmp = arr[0];
			arr[0] = arr[1];
			arr[1] = tmp;*/
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public void ex46() {
		int[][] arr = new int[5][5];
		int k=1;
		
		/*for(int i = 0; i < 5; i++) {
			for(int j =4; j >= 0 ; j--) {
				arr[i][j] = k++;
			}
		}
		for(int i=0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%5d" , arr[i][j]);
			}System.out.println();
		}System.out.println("============Q1");
		
		
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 ; j++) {
				arr[j][i] = k++;
			}
		}
		for(int i=0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%5d" , arr[i][j]);
			}System.out.println();
		}System.out.println("============Q2");
		
		
		
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j >= 0 ; j--) {
				arr[j][i] = k++;
			}
		}
		for(int i=0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%5d" , arr[i][j]);
			}System.out.println();
		}System.out.println("============Q3");*/
		
		
		for(int i = 0; i < 5; i++) {
			for(int j =0; j < 5 ; j++) {
				arr[i][j] = k++;
			}
		}
		for(int i=0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%5d" , arr[i][j]);
			}System.out.println();
		}System.out.println("============Q4");
	}
	
	public void ex47() {
		int[][] arr = new int[5][5];
		int k=1;
		
		/*for(int i = 0; i < 5; i++) {
			if(i%2 ==0) {
				for(int j =0; j <= 4 ; j++) {
					arr[i][j] = k++;
				}
			}else {
				for(int j =4; j >=0; j--) {
					arr[i][j]= k++;
				}
			}
		}
		for(int i=0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%5d" , arr[i][j]);
			}System.out.println();
		}System.out.println("============Q5");*/
		
		
		
		/*for(int i = 0; i < 5; i++) {
			if(i%2 !=0) {
			for(int j =0; j < 5 ; j++) {
				arr[i][j] = k++;
			}
			}else {
				for(int j =4; j >=0; j--) {
					arr[i][j]= k++;
				}
			}
		}
			
		for(int i=0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%5d" , arr[i][j]);
			}System.out.println();
		}System.out.println("============Q6");*/
		
		
		
		/*for(int i = 0; i < 5; i++) {
			if(i%2 ==0) {
			for(int j =4; j >=0 ; j--) {
				arr[j][i] = k++;
			}
			}else {
				for(int j=0; j<=4; j++) {
					arr[j][i]= k++;
				}
			}
		}
		for(int i=0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%5d" , arr[i][j]);
			}System.out.println();
		}System.out.println("============Q7");*/
		
		
		for(int i = 0; i < 5; i++) {
			if(i%2==0) {
			for(int j =0; j < 5 ; j++) {
				arr[j][i] = k++;
			}
			}else {
				for(int j=4; j>=0; j--) {
					arr[j][i]=k++;
				}
			}
		}
		for(int i=0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%5d" , arr[i][j]);
			}System.out.println();
		}System.out.println("============Q8");
	}
	
	public void ex48() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int su1, su2;
		System.out.print("생성할 2차원 배열의 가로길이(su1) : ");
		su1 = sc.nextInt();
		System.out.print("생성할 2차원 배열의 세로길이(su2) : ");
		su2 = sc.nextInt();
		int [][] arr = new int[su1][su2];
		
		for(int i = 0;i < su1; i++){
			for(int j = 0; j < su2; j++){
				arr[i][j] = 'a' + r.nextInt(26); //'a'이 왜 붙는지는 모르겠지만 삭제하면 문자가 안나옴
			}
		}
		
		for(int i = 0;i < su1; i++){
			for(int j = 0; j < su2; j++){
				System.out.print((char)arr[i][j] + " ");
			}System.out.println();
		}
	}
	public void test2() {
	Scanner sc = new Scanner(System.in);
	char ch;
	System.out.print("영문자 입력 : ");
	ch = sc.next().charAt(0);
	System.out.println("===== 변 환 =====");
	System.out.print(ch + " --> ");
	ch = charChange(ch);
	System.out.println(ch);
	}

	public char charChange(char ch) {
		if('a' <= ch && ch <= 'z') {
			ch = (char)(ch-32);
		}else if('A'<= ch && ch <= 'Z') {
			ch = (char)(ch+32);
		}
		return ch;
	
	
	}
}
