package com.test.function;

import java.util.Scanner;

public class Example {
	public void opSample1() {
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		String result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		math = sc.nextInt();
		
		
		sum = (kor + eng + math);
		avg = sum /3.0;
		
		result = kor>=40 && eng >=40 && math>=40 && avg >=60 ?"합격 입니다.":"불합격 입니다.";
		System.out.println("====결과 출력 ====");
		System.out.printf("평균점수 : %.2f \n " , avg);
		System.out.println("합계점수 : " + sum);
		System.out.println("합격여부 : " + result);
		
	}
	
	public void opSample2() {
		int su;
		String result;
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수를 입력 : ");
		su = sc.nextInt();
		
		result = su%2 == 1 ? "입력한 수는 홀수다":"입력한 수는 짝수다";
		
		System.out.println("==== 결과 ====");
		System.out.println(result);
		
	}

}
