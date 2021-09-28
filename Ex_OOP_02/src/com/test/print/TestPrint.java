package com.test.print;

import java.util.Scanner;

public class TestPrint {
	
	public void ex1() {
		testMethod();		              // 안녕하세요 테스트 메소드 입니다.
		testMethod(10);	              // 호출 값은 10입니다.
		testMethod(10,20);	          // 2개의 값은 10와20이며 합한 값은 30입니다.
	}
	public void testMethod() {
		System.out.println("안녕하세요 테스트 메소드 입니다.");
	}
	public void testMethod(int a) {
		System.out.println("호출값은 " + a + "입니다.");
	}
	public void testMethod(int a, int b) {
		int c = a+b;
		System.out.println("2개의 값은 " + a +"와" + b + "이며 합한 값은 " + c + "입니다.");
	}
	
public void ex2() {
		
		int su1;
		int su2;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		su1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요 : ");
		su2 = sc.nextInt();
		
		int result = dataHandle(dataHandle(su1,su2));
		
		System.out.println("결과값 출력 : " + result);	
	}
	public int dataHandle(int su1,int su2) {
		 	
		return su1+su2;
	}
	public int dataHandle(int su3) {
		return su3*su3;
	}
}
