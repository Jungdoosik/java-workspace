package com.test.print;

import java.util.Scanner;

public class TestPrint {
	
	public void ex1() {
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번쨰 수 입력 : ");
		a = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		b = sc.nextInt();
		
		System.out.println("====출력결과====");
		System.out.println("두 수를 더한 수 : " + (a+b));
		System.out.println("두 수를 뺸 수 : " + (a-b));
		System.out.println("두 수를 곱한 수 : " + (a*b));
		System.out.printf("두 수를 나눈 수 : %.2f \n" , (a/(double)b));
		System.out.println("두 수를 나눈수  : " + Math.round((a/(double)b)*100)/100.0);
	}
	
	public void ex2() {
		int a  = 40,b = 20;
		a+=b; //a = 60, b = 20
		System.out.printf("a의 값: %d , b의 값 : %d \n", a,b);
		a-=b; //a = 40, b = 20
		System.out.printf("a의 값: %d , b의 값 : %d \n", a,b);
		b*=a; // b = 800, a = 40
		System.out.printf("a의 값: %d , b의 값 : %d \n", a,b);
		b/=a; // b = 20, a = 40
		System.out.printf("a의 값: %d , b의 값 : %d \n", a,b);
	}
	
	public void ex3() {
		int a = 10, b = 20, c = 30, d = 40;
		 boolean result1, result2;
		 result1 = ((a<20 && b>10) && (c==20||d==40));
		 result2 = ((a==10 && b!=2*10) || (c==30&&d!=40));
		 System.out.printf("첫번째 결과값 : %b \n", result1);
		 System.out.printf("두번째 결과값 : %b \n", result2);
		 //첫번쨰 결과값 : true
		 //두번쨰 결과값 : false
	}
	
	public void ex4() {
		int age;
		String result;
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		result = age<=19 ?"미성년자는 입장불가입니다" : "성인입니다. 어서오세요";
		System.out.println(result);
	}

}
