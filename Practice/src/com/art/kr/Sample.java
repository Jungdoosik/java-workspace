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
}
