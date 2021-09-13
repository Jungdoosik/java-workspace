package com.test.run;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {

		/*Scanner sc = new Scanner(System.in);
		int su;
		System.out.print("10 이하의 수를 입력하세요");
		su = sc.nextInt();
		if(su<=10) 
		{
			System.out.println("잘 따라하는군요");
		}
		System.out.println("수고하셨습니다.");*/

	
	
		Scanner sc = new Scanner(System.in);
		int su;
		System.out.println("정수 입력 : ");
		su = sc.nextInt();
		if (su > 0) {
			System.out.println("입력한 값은 0보다 크다.");
		}else {
			System.out.println("입력한 값은 0보다 크지 않다.");
		}
	}

}
