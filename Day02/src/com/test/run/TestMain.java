package com.test.run;

import java.util.Scanner;

public class TestMain {

	
	//Scanner를 사용하려면 Java.util.Scanner import 해주어야 한다.
	//단축기 Ctrl + Shift + O 를 눌러서 추가해주어도 된다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("주소 입력 : ");
		String addr = sc.nextLine();
		
		System.out.println("당신의 주소 : " + addr);
		
		/*System.out.print("이름 입력 : ");
		String str = sc.next();
		
		System.out.println("당신의 이름은 [" + str + "] 이군요");
		
		/*System.out.print("첫번째 정수 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int b = sc.nextInt();
		
		
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		
		System.out.println("결과 출력 : " + (a+b));*/
		
		System.out.print("첫번쨰 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번쨰 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("세번쨰 정수 입력 : ");
		int num3 = sc.nextInt();
		
		System.out.println("3개의 정수 합 : " + (num1 + num2 + num3));
	}

}
