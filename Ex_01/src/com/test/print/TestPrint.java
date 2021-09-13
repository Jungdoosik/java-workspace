package com.test.print;

import java.util.Scanner;

public class TestPrint {
	
	public void ex1() {
		System.out.print("\"나는 개발자 입니다.\"");
		
	
	}
	public void ex2() {
		
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >♡");
		System.out.println("Have a Good Time.");
	}
	
	public void ex3() {
		
		System.out.println("|\\_/|\n" + 
		                   "|q p|   /}\n" + 
				           "( 0 )\"\"\"\\\n" + 
		                   "|\"^\"`    |\n" + 
				           "||_/=\\\\__|" );
	}
	
	public void ex4() {
		
		int num;
		int num1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("임의의 수를 입력 : ");
		num = sc.nextInt();
		
		
		System.out.println("=====결과출력=====");
		System.out.printf("10진수 : %d \n", num);
		System.out.printf("8진수 : %o \n", num);
		System.out.printf("16진수 : %c \n", num);
		
		System.out.print("임의의 수를 입력 : ");
		num1 = sc.nextInt();
		
		
		System.out.println("=====결과출력=====");
		System.out.printf("10진수 : %d \n", num1);
		System.out.printf("8진수 : %o \n", num1);
		System.out.printf("16진수 : %c \n", num1);
		
		
	}
	public void ex5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번쩨 수 : ");
		int su1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		int su2 = sc.nextInt();
		
		System.out.println("=====결과 출력====");
		System.out.println(su1 + "+" + su2 + "=" +(su1+su2));
		
	}
	public void ex6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 입력 : ");
		int k = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		int e = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		int m = sc.nextInt();
		
		int sum = k+e+m;
		
		System.out.println("=====결과 출력=====");
		System.out.printf("평균점수 : %.2f \n", sum/3.0);
		System.out.println("합계점수 : " + sum);
	
	}
	public void ex7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나의 이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("나의 키(신체) 입력 : ");
		double height = sc.nextDouble();
		System.out.print("나의 나이 입력 : ");
		int age = sc.nextInt();
		
		System.out.println("=======입력 정보 출력=======");
		System.out.println("나의 이름은 [" + name + "]입니다.");
		System.out.println("나의 키는 [" + height + "]cm 입니다.");
		System.out.println("나의 나이는 [" + age + "]세 입니다.");
	
	}
	public void ex8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine();//버퍼 비우기
		
		System.out.print("주소 :");
		String addr = sc.nextLine();
		
		System.out.println("====결과출력====");
		System.out.println("입력한 이름 : " + name);
		System.out.println("입력한 나이 : " + age);
		System.out.println("입력한 주소 : " + addr);
	}
}
