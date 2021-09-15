package com.art.kr;

import java.util.Scanner;

public class Sample {
	public void Ex1() {
		System.out.print("\"나는 개발자 입니다.\"");
	}
	public void Ex2() {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >♡");
		System.out.println("Have a Good Time.");
	}
	public void Ex3() {
		System.out.println("|\\_/| \n" + 
							"|q p|   /} \n" + 
							"( 0 )\"\"\"\\ \n" + 
							"|\"^\"`    | \n" + 
							"||_/=\\\\__|");
	}
	public void Ex4() {
		int a;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 수를 입력 : ");
		a = sc.nextInt();
		
		System.out.println("==== 결과출력 ====");
		System.out.printf("10진수 : %d \n", a);
		System.out.printf("8진수 : %o \n", a);
		System.out.printf("16진수 : %c \n", a);
	}
	public void Ex5() {
		int su1;
		int su2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번쨰 수 : ");
		su1 = sc.nextInt();
		
		System.out.print("두번째 수 : ");
		su2 = sc.nextInt();
		
		System.out.println("===== 결과 출력 =====");
		System.out.println(su1 + "+" + su2 + "=" + (su1+su2));
	}
	public void Ex6() {
		int kor;
		int eng;
		int math;
		double avg;
		int sum;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		eng = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		math = sc.nextInt();
		
		sum = (kor + eng + math);
		avg = sum/3.0; //정수 연산 실수는 실수값이 나옴
					   //정수 연산 정수는 정수값 까지 나옴
		
		System.out.println("==== 결과출력 ====");
		System.out.printf("평균점수 : %.2f \n" ,  avg);
		System.out.println("합계점수 : " + sum);
	}
	public void Ex7() {
		String name;
		double height;
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나의 이름 입력 : ");
		name = sc.nextLine();
		System.out.print("나의 키(신체) 입력 : ");
		height = sc.nextDouble();
		System.out.print("나의 나이 입력 : ");
		age = sc.nextInt();
		
		System.out.println("======= 입력 정보 출력 =======");
		
		System.out.println("나의 이름은 [" + name + "] 입니다.");
		System.out.println("나의 키는 [" + height + "] 입니다.");
		System.out.println("나의 나이는 [" + age + "] 입니다.");
	}
	public void Ex8() {
		String name;
		int age;
		String addr;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		sc.nextLine();
		System.out.print("주소 : ");
		addr = sc.nextLine();
		
		System.out.println("==== 결과 출력 ====");
		System.out.println("입력한 이름 : " + name);
		System.out.println("입력한 나이 : "+ age);
		System.out.println("입력한 주소 : " + addr);
	}
	public void Ex9() {
		int su1 = 10;
		int su2 = 3;
		
		System.out.println("==== 출력결과 ====");
		System.out.println("두수를 더한 수 : " + (su1+su2));
		System.out.println("두수를 뺸 수 : " + (su1-su2));
		System.out.println("두수를 곱한 수 : " + (su1*su2));
		System.out.printf("두수를 나눈 수 : %.2f " , (su1/(double)su2));
	}
	public void Ex10() {
		
	int a  = 40,b = 20;
	a+=b; //a=60 b=20
	System.out.printf("a의 값: %d , b의 값 : %d \n", a,b);
	a-=b; //a=40 b=20
	System.out.printf("a의 값: %d , b의 값 : %d \n", a,b);
	b*=a; //b=800 a=40
	System.out.printf("a의 값: %d , b의 값 : %d \n", a,b);
	b/=a; // b20 a=40
	System.out.printf("a의 값: %d , b의 값 : %d \n", a,b);
	}
	
	public void Ex11() {
		int a = 10, b = 20, c = 30, d = 40;
		 boolean result1, result2;
		 result1 = ((a<20 && b>10) && (c==20||d==40));
		 result2 = ((a==10 && b!=2*10) || (c==30&&d!=40));
		 System.out.printf("첫번째 결과값 : %b \n", result1); //true
		 System.out.printf("두번째 결과값 : %b \n", result2); //false
	}
	
	public void Ex12() {
		int age;
		String result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		result = age <20 ? "미성년자는 입장불가입니다.":"성인입니다. 어서오세요";
		
		System.out.println(result);
		
	}
	public void Ex13() {
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
		
		sum = (kor + eng + math);
		avg = sum/3.0;
		result = kor>=40 && eng >=40 && math >=40 && avg >=60? "합격입니다.":"불합격입니다.";
		System.out.println("==== 결과 출력 ====");
		System.out.printf("평균점수 : %.2f \n" , avg);
		System.out.println("합계점수 : " + sum);
		System.out.println("합격여부 : " + result);
	}
	public void Ex14() {
		int su;
		String result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수 입력 : ");
		su = sc.nextInt();
		
		result = su%2 == 0 ? "입력한 수는 짝수다":"입력한 수는 홀수다";
		System.out.println(result);
	}
	public void ex15() {
		int i = 7;
		int sum = 0;
		int count = 0;
		while(sum <= 1000) {
			sum = sum + i;
			count=count+1;
			System.out.println("count=" + count + " i=" + i + " sum=" + sum);
			i=i+7;
		}
	}
	public void ex16() {
		int month;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일수를 알고싶은 달을 입력하시오 : ");
		month = sc.nextInt();
		
		switch(month) {
		case 1 : 
		case 3 : 
		case 5 : 
		case 7 : 
		case 8 : 
		case 10 : 
		case 12 : System.out.println(month + "월달은 31일 입니다."); break;
		
		case 4 :
		case 6 :
		case 9 :
		case 11 : System.out.println(month + "월달은 30일 입니다."); break;
		
		case 2 : System.out.println("2월달은 28일 입니다."); break;

			default : System.out.println("잘 못 입력하셨습니다.");
		}
		
	}
	public void ex17() {
		char grade;
		System.out.println("장학금 지불 시스템 입니다.");
		System.out.println("학생 학점을 입력해주세요\n" +"(A학점,B학점,C학점,D학점,F학점)");
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		grade = sc.next().charAt(0);
		
		switch(String.valueOf(grade).toUpperCase()) {
		case "A" : System.out.println("수고하셨습니다. 장학금을 100% 지급해드리겠습니다");break;
		case "B" : System.out.println("약간 아쉽네요 장학금 50% 지원입니다");break;
		case "C" : System.out.println("이번 학기 장학금은 없네요.. 힘내세요");break;
		case "D" : System.out.println("장학금보다는 학고는 면하셨네요..노력하세요");break;
		case "F" : System.out.println("이번학기 장학금으로 학고를 맞으셨습니다. 3GO일시 제적");break;
		}
	}
	public void ex18() {
		int su1;
		int su2;
		char ch;
		System.out.println("===== 계산기 프로그램 =====");
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자 입력 (+, -, *, /) : ");
		ch = sc.next().charAt(0);
		
		System.out.print("첫번째 숫자 입력 : ");
		su1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		su2 = sc.nextInt();
		
		System.out.println("===== 결      과 ======");
		switch(ch) {
		case '+' : System.out.println(su1 + " + " + su2 + " = " + (su1+su2));break;
		case '-' : System.out.println(su1 + " - " + su2 + " = " + (su1-su2));break;
		case '*' : System.out.println(su1 + " * " + su2 + " = " + (su1*su2));break;
		case '/' : System.out.println(su1 + " / " + su2 + " = " + (su1/su2));break;
		}
	}
	public void ex19() {
		String fruit;
		int su;
		int price = 0;
		
		System.out.println("------ 과일 메뉴 ------");
		System.out.println("사과 / 딸기 / 수박 / 바나나 / 복숭아");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과일 이름을 입력하세요 : ");
		fruit = sc.next();
		
		switch(fruit) {
		case "사과" : System.out.println("사과는 개당 2000원 입니다.");
		price = 2000; break;			
		case "딸기" : System.out.println("딸기는 개당 1000원 입니다.");
		price = 1000;break;
		case "수박" : System.out.println("수박는 개당 8000원 입니다.");
		price = 8000;break;
		case "바나나" : System.out.println("바나나는 개당 4000원 입니다.");
		price = 4000;break;
		case "복숭아" : System.out.println("복숭아는 개당 5000원 입니다.");
		price = 5000;break;
		  
		}
		
		System.out.print("몇개 주문하시겠습니까? : ");
		su = sc.nextInt();
		System.out.println("주문하신 과일 ["+ fruit + "]의 [" + su + "]개 금액은 총 " + (price * su) + "원 입니다."  );
		
	}
	public void ex20() {
		int su;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		su= sc.nextInt();
		 
		if(0<=su && su<=100) {
			
			switch(su/10) {
			case 10 :
			case 9 : System.out.println(su + "점 ==> A등급");break;
			case 8 : System.out.println(su + "점 ==> B등급");break;
			case 7 : System.out.println(su + "점 ==> C등급");break;
			case 6 : System.out.println(su + "점 ==> D등급");break;
			 default : System.out.println(su + "점 미만 ==> F등급");
			}
		}else {
			System.out.println("잘못된 점수 입력");
		}
	}
	public void ex21() {
		int su1 = 0;
		
		while(su1 < 5) {
			System.out.println("안녕하세요");
			su1++;
		}
		
	}
	public void ex22() {
		int su1;
		int su2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("동작할 횟수 입력 : ");
		su1 = sc.nextInt();
		
		while(su2 < su1) {
			System.out.println((su2+1) + ". 안녕하세요");
			su2++;
		}
	}
	public void ex23() {
		int su1 = 1;
		
		while(su1 < 10) {
			System.out.println("2 x " + su1 + " = " + (2*su1));
			su1++;
		}
	}
	public void ex24() {
		int su1;
		int su2 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 단수 입력 : ");
		su1 = sc.nextInt();
		
		while(su2 < 10) {
			System.out.println(su1 + " x " + su2 + " = " + (su1*su2));
			su2++;
		}
	}
	public void ex25() {
		int su1 = 1;
		int su2;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		while(su1 <= 5) {
			System.out.print(su1 + "번째 정수 입력 : ");
			su2 = sc.nextInt();
			su1++;
			sum += su2;
		}System.out.println("입력한 5개의 정수 합 : " + sum );
	}
	
}
